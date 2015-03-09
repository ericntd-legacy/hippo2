package com.gec.components;

import com.gec.beans.Promotion;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.content.beans.standard.HippoFolderBean;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.parameters.ParametersInfo;
import org.onehippo.cms7.essentials.components.EssentialsListComponent;
import org.onehippo.cms7.essentials.components.info.EssentialsDocumentListComponentInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by eric on 9/3/15.
 */
@ParametersInfo(type = EssentialsDocumentListComponentInfo.class)
public class PromotionsComponent extends EssentialsListComponent {
    private Logger l = LoggerFactory.getLogger(this.getClass());

    private final String FOLDER_PROMOTIONS = "promotions";

    @Override
    public void doBeforeRender(final HstRequest request,
                               final HstResponse response)
            throws HstComponentException {
        l.info("doBeforeRender");

        /*
        The document root folder
         */
        HippoBean  rootBean = request.getRequestContext().getSiteContentBaseBean();
        /*
        Get the promotions folder
         */
        HippoFolderBean promoFolder = rootBean.getBean(FOLDER_PROMOTIONS, HippoFolderBean.class);
        if (promoFolder==null) return;

        List<Promotion> promotions = promoFolder.getDocuments(Promotion.class);

        if (promotions==null||promotions.size()==0) return;

        request.setAttribute(FOLDER_PROMOTIONS, promotions);
    }
}

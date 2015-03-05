package com.gec.components;

import com.gec.beans.EventsDocument;
import com.gec.beans.Sports;
import org.hippoecm.hst.component.support.bean.BaseHstComponent;
import org.hippoecm.hst.content.beans.query.HstQuery;
import org.hippoecm.hst.content.beans.query.exceptions.QueryException;
import org.hippoecm.hst.content.beans.standard.*;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.parameters.ParametersInfo;
import org.hippoecm.hst.util.ContentBeanUtils;
import org.onehippo.cms7.essentials.components.EssentialsListComponent;
import org.onehippo.cms7.essentials.components.info.EssentialsDocumentListComponentInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by eric on 4/3/15.
 */
@ParametersInfo(type = EssentialsDocumentListComponentInfo.class)
public class GalleryComponent extends EssentialsListComponent {
    private Logger l = LoggerFactory.getLogger(this.getClass());

    /**
     * This method is called by EssentialsListComponent.doBeforeRender()
     *
     * @param request
     * @param paramInfo
     * @param scope
     * @param <T>
     * @return
     */
//    @Override
//    protected <T extends EssentialsDocumentListComponentInfo> HstQuery buildQuery(HstRequest request, T paramInfo,
//                                                                                  HippoBean scope) {
//        l.info("buildQuery");
//        HippoDocumentBean subject = request.getRequestContext().getContentBean(HippoDocumentBean.class);
//
//        if (subject == null) {
//            l.warn("subject is null");
//            return null;
//        }
//
//        HippoFolderBean galleryBaseBean = getGalleryBaseBean(request);// content/gallery/ folder
//        HippoFolderBean scc = galleryBaseBean.getFolders().get(0);// content/gallery/scc/ folder
//
//        if (scc == null) {
//            l.warn("reviewsFolder is null");
//            return null;
//        }
//
//        try {
//            HstQuery reviewsQuery = ContentBeanUtils.createIncomingBeansQuery(subject, scc, 4, HippoFolderBean.class,
//                    false);
//            return reviewsQuery;
//        } catch (QueryException e) {
//            l.warn("Failed to create incoming beans query", e);
//        }
//
//        return null;
//    }

    @Override
    public void doBeforeRender(final HstRequest request,
                               final HstResponse response)
            throws HstComponentException {
        l.info("doBeforeRender");
        /*
        the current event, sports page etc. that has the gallery
         */
        HippoDocumentBean subject = request.getRequestContext().getContentBean(HippoDocumentBean.class);

        HippoFolderBean galleryFolder = null;
        if (subject instanceof Sports)  {
            galleryFolder = (HippoFolderBean) ((Sports) subject).getGallery();
        }
        if (subject instanceof EventsDocument) {
            galleryFolder = (HippoFolderBean) ((EventsDocument) subject).getGallery();
        }
        // l.info("gallery is "+galleryFolder.getName());
        // HippoFolderBean sportsGalleryFolder = (HippoFolderBean) galleryFolder;
        // l.info("number of images in the gallery is "+sportsGalleryFolder.getDocuments());
        if (galleryFolder==null) return;

        List<HippoGalleryImageSet> images = galleryFolder.getDocuments(HippoGalleryImageSet.class);
        for (HippoGalleryImageSet image: images) {
            l.info("Image is "+image.getFileName());
        }
        request.setAttribute("images", images);
        // request.setAttribute("document", images.get(0));
        // l.info("how do get the gallery included in this current document?");
    }
}

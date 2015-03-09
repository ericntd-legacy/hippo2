package com.gec.components;

import com.gec.beans.EventsDocument;
import org.apache.commons.lang.StringUtils;
import org.hippoecm.hst.content.beans.query.HstQuery;
import org.hippoecm.hst.content.beans.query.HstQueryResult;
import org.hippoecm.hst.content.beans.query.exceptions.QueryException;
import org.hippoecm.hst.content.beans.query.filter.Filter;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.content.beans.standard.HippoBeanIterator;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.parameters.ParametersInfo;
import org.hippoecm.hst.util.SearchInputParsingUtils;
import org.onehippo.cms7.essentials.components.EssentialsListComponent;
import org.onehippo.cms7.essentials.components.info.EssentialsDocumentListComponentInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eric on 9/3/15.
 */
@ParametersInfo(type = EssentialsDocumentListComponentInfo.class)
public class LatestEventsComponent extends EssentialsListComponent {
    private Logger l = LoggerFactory.getLogger(this.getClass());

    @Override
    public void doBeforeRender(final HstRequest request,
                               final HstResponse response)
            throws HstComponentException {
        l.info("doBeforeRender");
        Object info = getComponentParametersInfo(request);
        // the scope to search below, for example /content/documents/example
        HippoBean scope = getSiteContentBaseBean(request);
        try {
            // create the query to search below 'scope', return beans that are
            // of type BaseDocument bean or a subclass/sub-jcr-types, the
            // third argument, 'true', indicates whether to include subtypes
            HstQuery hstQuery =
                    getQueryManager(request).createQuery(scope,
                            EventsDocument.class, true);
            // always set a limit! The limit is normally the pageSize,
            // for example 10
            int pageSize = 10;
            hstQuery.setLimit(pageSize);
            // the offset : Assume requested page is 3. Then the offset is 20
//            int crPage = 3;
//            hstQuery.setOffset(pageSize * (crPage - 1));
            // we assume ordering on property "mynamespace:date" descending
            hstQuery.addOrderByDescending("scc:date");

            // parse a free text query to remove invalid chars. The argument
            // 'false' means no wildcards allowed
//            String parsedQuery = SearchInputParsingUtils.parse(query, false);
//
//            if (StringUtils.isNotEmpty(parsedQuery)) {
//                // create a filter
//                Filter f = hstQuery.createFilter();
//                // add a constraint: Only Documents that contain the terms
//                // in parsedQuery will be a hit
//                // Note that "." means: Search in the entire Document
//                // including all descendant jcr nodes
//                f.addContains(".", parsedQuery);
//                // apply the filter
//                hstQuery.setFilter(f);
//            }

            // execute the query
            HstQueryResult result = hstQuery.execute();

            List<EventsDocument> events = new ArrayList<EventsDocument>();
            HippoBeanIterator it = result.getHippoBeans();
            while (it.hasNext()) {
                events.add((EventsDocument) it.nextHippoBean());
            }
            // set the result, info and parsedQuery on the HstRequest : It is
            // then available in the JSP
            request.setAttribute("events", events);
//            request.setAttribute("info", info);
//            request.setAttribute("query", parsedQuery);
//
        } catch (QueryException e) {
            throw new HstComponentException(
                    "Exception occured during creation or execution of HstQuery. ", e);
        }
    }
}

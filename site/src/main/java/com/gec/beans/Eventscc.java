package com.gec.beans;

import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jcr.NodeIterator;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.query.Query;
import javax.jcr.query.QueryManager;
import javax.jcr.query.QueryResult;
import java.util.ArrayList;
import java.util.List;

@HippoEssentialsGenerated(internalName = "scc:eventscc")
@Node(jcrType = "scc:eventscc")
public class Eventscc extends EventsDocument {
	private static final Logger log = LoggerFactory.getLogger(Eventscc.class);

	@HippoEssentialsGenerated(internalName = "scc:sports")
	public HippoBean getSports() {
		return getLinkedBean("scc:sports", HippoBean.class);
	}

	@HippoEssentialsGenerated(internalName = "scc:gallery")
	public HippoBean getGallery() {
		return getLinkedBean("scc:gallery", HippoBean.class);
	}

	public List<HippoGalleryImageSet> getImages() {
		List<HippoGalleryImageSet> images = new ArrayList<HippoGalleryImageSet>();
		String expression = "/jcr:root/content/gallery/scc/gallery1//element(*, hippo:handle)";
		try {
			Session session = getNode().getSession();
			QueryManager queryManager = session.getWorkspace().getQueryManager();
			String language = Query.XPATH;

			Query query = queryManager.createQuery(expression, language);
			QueryResult result = query.execute();
			NodeIterator nodes = result.getNodes();
			if (nodes.hasNext()) {
				javax.jcr.Node ratingNode = nodes.nextNode();
			}
		} catch (RepositoryException e) {
			log.error("Failed to retrieve average rating for product document {}", getCanonicalHandleUUID(), e);
		}
		return images;
	}
}

package com.gec.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import java.util.ArrayList;
import java.util.List;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jcr.Item;
import javax.jcr.NodeIterator;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.query.Query;
import javax.jcr.query.QueryManager;
import javax.jcr.query.QueryResult;

@HippoEssentialsGenerated(internalName = "scc:sports")
@Node(jcrType = "scc:sports")
public class Sports extends BaseDocument {
	private static final Logger log = LoggerFactory.getLogger(Eventscc.class);

	@HippoEssentialsGenerated(internalName = "scc:name")
	public String getName() {
		return getProperty("scc:name");
	}

	@HippoEssentialsGenerated(internalName = "scc:desc")
	public String getDesc() {
		return getProperty("scc:desc");
	}

	@HippoEssentialsGenerated(internalName = "scc:governor")
	public String getGovernor() {
		return getProperty("scc:governor");
	}

	@HippoEssentialsGenerated(internalName = "scc:convenor")
	public String getConvenor() {
		return getProperty("scc:convenor");
	}

	@HippoEssentialsGenerated(internalName = "scc:gallery")
	public HippoBean getGallery() {
		return getLinkedBean("scc:gallery", HippoBean.class);
	}

	public List<HippoGalleryImageSet> getImages() {
		log.info("getImages");
		List<HippoGalleryImageSet> images = new ArrayList<HippoGalleryImageSet>();
		String expression = "/jcr:root/content/gallery/scc/gallery1//element(*, hippo:handle)";
		try {
			Session session = getNode().getSession();
			QueryManager queryManager = session.getWorkspace()
					.getQueryManager();
			String language = Query.XPATH;
			Query query = queryManager.createQuery(expression, language);
			QueryResult result = query.execute();
			NodeIterator nodes = result.getNodes();
			while (nodes.hasNext()) {
				javax.jcr.Node node = nodes.nextNode();
				log.info("node is "+node);

				// Item item = node.getPrimaryItem();
				HippoGalleryImageSet image = new HippoGalleryImageSet();
				image.setNode(node);


				images.add(image);
			}
		} catch (RepositoryException e) {
			log
					.error(
							"Failed to retrieve average rating for product document {}",
							getCanonicalHandleUUID(), e);
		}
		return images;
	}

	@HippoEssentialsGenerated(internalName = "scc:Image")
	public HippoGalleryImageSet getImage() {
		return getLinkedBean("scc:Image", HippoGalleryImageSet.class);
	}
}

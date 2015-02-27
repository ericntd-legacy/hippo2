package com.gec.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import java.util.List;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoBean;

@HippoEssentialsGenerated(internalName = "scc:sports")
@Node(jcrType = "scc:sports")
public class Sports extends BaseDocument {
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

	@HippoEssentialsGenerated(internalName = "scc:images")
	public List<HippoGalleryImageSet> getImages() {
		return getLinkedBeans("scc:images", HippoGalleryImageSet.class);
	}

	@HippoEssentialsGenerated(internalName = "scc:convenor")
	public String getConvenor() {
		return getProperty("scc:convenor");
	}

	@HippoEssentialsGenerated(internalName = "scc:gallery")
	public HippoBean getGallery() {
		return getLinkedBean("scc:gallery", HippoBean.class);
	}
}

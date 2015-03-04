package com.gec.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import java.util.List;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;

@HippoEssentialsGenerated(internalName = "scc:gallery")
@Node(jcrType = "scc:gallery")
public class Gallery extends BaseDocument {
	@HippoEssentialsGenerated(internalName = "scc:desc")
	public String getDesc() {
		return getProperty("scc:desc");
	}

	@HippoEssentialsGenerated(internalName = "scc:event")
	public HippoBean getEvent() {
		return getLinkedBean("scc:event", HippoBean.class);
	}

	@HippoEssentialsGenerated(internalName = "scc:sports")
	public HippoBean getSports() {
		return getLinkedBean("scc:sports", HippoBean.class);
	}

	@HippoEssentialsGenerated(internalName = "scc:images")
	public List<HippoGalleryImageSet> getImages() {
		return getLinkedBeans("scc:images", HippoGalleryImageSet.class);
	}

	@HippoEssentialsGenerated(internalName = "scc:imagefolder")
	public HippoBean getImagefolder() {
		return getLinkedBean("scc:imagefolder", HippoBean.class);
	}

	@HippoEssentialsGenerated(internalName = "scc:subject")
	public HippoBean getSubject() {
		return getLinkedBean("scc:subject", HippoBean.class);
	}
}

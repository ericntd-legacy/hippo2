package com.gec.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import java.util.List;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;

@HippoEssentialsGenerated(internalName = "scc:photogallery")
@Node(jcrType = "scc:photogallery")
public class Photogallery extends BaseDocument {
	@HippoEssentialsGenerated(internalName = "scc:desc")
	public String getDesc() {
		return getProperty("scc:desc");
	}

	@HippoEssentialsGenerated(internalName = "scc:images")
	public List<HippoGalleryImageSet> getImages() {
		return getLinkedBeans("scc:images", HippoGalleryImageSet.class);
	}
}

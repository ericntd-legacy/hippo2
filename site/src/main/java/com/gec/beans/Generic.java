package com.gec.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoBean;

@HippoEssentialsGenerated(internalName = "scc:generic")
@Node(jcrType = "scc:generic")
public class Generic extends BaseDocument {
	@HippoEssentialsGenerated(internalName = "scc:image_gallery")
	public HippoBean getImage_gallery() {
		return getLinkedBean("scc:image_gallery", HippoBean.class);
	}
}

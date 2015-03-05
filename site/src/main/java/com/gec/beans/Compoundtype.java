package com.gec.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoBean;

@HippoEssentialsGenerated(internalName = "scc:compoundtype")
@Node(jcrType = "scc:compoundtype")
public class Compoundtype extends HippoDocument {
	@HippoEssentialsGenerated(internalName = "scc:hippo_mirror")
	public HippoBean getHippo_mirror() {
		return getLinkedBean("scc:hippo_mirror", HippoBean.class);
	}
}

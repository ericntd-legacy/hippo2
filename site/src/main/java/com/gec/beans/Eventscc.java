package com.gec.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoBean;

@HippoEssentialsGenerated(internalName = "scc:eventscc")
@Node(jcrType = "scc:eventscc")
public class Eventscc extends EventsDocument {
	@HippoEssentialsGenerated(internalName = "scc:sports")
	public HippoBean getSports() {
		return getLinkedBean("scc:sports", HippoBean.class);
	}
}

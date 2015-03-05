package com.gec.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import com.gec.beans.Compoundtype;

@HippoEssentialsGenerated(internalName = "scc:EventI")
@Node(jcrType = "scc:EventI")
public class EventI extends Generic {
	@HippoEssentialsGenerated(internalName = "scc:text")
	public String getText() {
		return getProperty("scc:text");
	}

	@HippoEssentialsGenerated(internalName = "scc:name")
	public String getName() {
		return getProperty("scc:name");
	}

	@HippoEssentialsGenerated(internalName = "scc:scc_compoundtype")
	public Compoundtype getScc_compoundtype() {
		return getBean("scc:scc_compoundtype", Compoundtype.class);
	}
}

package com.gec.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import java.util.Calendar;
import org.hippoecm.hst.content.beans.standard.HippoBean;

@HippoEssentialsGenerated(internalName = "scc:promotion")
@Node(jcrType = "scc:promotion")
public class Promotion extends BaseDocument {
	@HippoEssentialsGenerated(internalName = "scc:name")
	public String getName() {
		return getProperty("scc:name");
	}

	@HippoEssentialsGenerated(internalName = "scc:discount")
	public String getDiscount() {
		return getProperty("scc:discount");
	}

	@HippoEssentialsGenerated(internalName = "scc:desc")
	public String getDesc() {
		return getProperty("scc:desc");
	}

	@HippoEssentialsGenerated(internalName = "scc:start")
	public Calendar getStart() {
		return getProperty("scc:start");
	}

	@HippoEssentialsGenerated(internalName = "scc:end")
	public Calendar getEnd() {
		return getProperty("scc:end");
	}

	@HippoEssentialsGenerated(internalName = "scc:link")
	public HippoBean getLink() {
		return getLinkedBean("scc:link", HippoBean.class);
	}

	@HippoEssentialsGenerated(internalName = "scc:subject")
	public HippoBean getSubject() {
		return getLinkedBean("scc:subject", HippoBean.class);
	}
}

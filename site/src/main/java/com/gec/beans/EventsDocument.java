package com.gec.beans;

import java.util.Calendar;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.standard.HippoBean;

@HippoEssentialsGenerated(internalName = "scc:eventsdocument")
@Node(jcrType = "scc:eventsdocument")
public class EventsDocument extends HippoDocument {
	/** 
	 * The document type of the events document.
	 */
	public final static String DOCUMENT_TYPE = "scc:eventsdocument";
	private final static String TITLE = "scc:title";
	private final static String DATE = "scc:date";
	private final static String INTRODUCTION = "scc:introduction";
	private final static String IMAGE = "scc:image";
	private final static String CONTENT = "scc:content";
	private final static String LOCATION = "scc:location";
	private final static String END_DATE = "scc:enddate";

	/** 
	 * Get the title of the document.
	 * @return the title
	 */
	@HippoEssentialsGenerated(internalName = TITLE)
	public String getTitle() {
		return getProperty(TITLE);
	}

	/** 
	 * Get the date of the document, i.e. the start date of the event.
	 * @return the (start) date
	 */
	@HippoEssentialsGenerated(internalName = "scc:date")
	public Calendar getDate() {
		return getProperty(DATE);
	}

	/** 
	 * Get the introduction of the document.
	 * @return the introduction
	 */
	@HippoEssentialsGenerated(internalName = "scc:introduction")
	public String getIntroduction() {
		return getProperty(INTRODUCTION);
	}

	/** 
	 * Get the image of the document.
	 * @return the image
	 */
	@HippoEssentialsGenerated(internalName = "scc:image")
	public HippoGalleryImageSet getImage() {
		return getLinkedBean(IMAGE, HippoGalleryImageSet.class);
	}

	/** 
	 * Get the main content of the document.
	 * @return the content
	 */
	@HippoEssentialsGenerated(internalName = "scc:content")
	public HippoHtml getContent() {
		return getHippoHtml(CONTENT);
	}

	/** 
	 * Get the location of the document.
	 * @return the location
	 */
	@HippoEssentialsGenerated(internalName = "scc:location")
	public String getLocation() {
		return getProperty(LOCATION);
	}

	/** 
	 * Get the end date of the document, i.e. the end date of the event.
	 * @return the end date
	 */
	@HippoEssentialsGenerated(internalName = "scc:enddate")
	public Calendar getEndDate() {
		return getProperty(END_DATE);
	}

	@HippoEssentialsGenerated(internalName = "hippostd:tags")
	public String[] getTags() {
		return getProperty("hippostd:tags");
	}

	@HippoEssentialsGenerated(internalName = "scc:image_gallery")
	public HippoBean getImage_gallery() {
		return getLinkedBean("scc:image_gallery", HippoBean.class);
	}

	@HippoEssentialsGenerated(internalName = "scc:gallery")
	public HippoBean getGallery() {
		return getLinkedBean("scc:gallery", HippoBean.class);
	}
}

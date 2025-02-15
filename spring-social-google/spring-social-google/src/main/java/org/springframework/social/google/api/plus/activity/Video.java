package org.springframework.social.google.api.plus.activity;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName("video")
public class Video extends Attachment {

	public Video(@JsonProperty("url") String url, @JsonProperty("displayName") String displayName, 
			@JsonProperty("content") String content, @JsonProperty("image") PreviewImage previewImage) {
		super(url, displayName, content, previewImage);
	}

}

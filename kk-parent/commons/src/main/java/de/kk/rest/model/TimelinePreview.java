package de.kk.rest.model;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TimelinePreview {
	
	private Date timelineDate;
	
	private String articleURL;

}

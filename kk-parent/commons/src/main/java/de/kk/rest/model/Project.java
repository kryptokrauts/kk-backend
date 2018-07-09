package de.kk.rest.model;

import java.util.Date;
import java.util.List;

import de.kk.rest.model.shared.Reference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Project {

	// Projects start date
	private Date foundingDate;

	// Date of ICO
	private Date icoDate;

	// Date of first transaction
	private Date genesisDate;

	// List of external references 
	private List<Reference> refrences;

	private String articleURL;

}

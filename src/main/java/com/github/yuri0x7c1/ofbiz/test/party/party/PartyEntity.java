package com.github.yuri0x7c1.ofbiz.test.party.party;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class PartyEntity {

	@Getter
	@Setter
	private String partyId;

	@Getter
	@Setter
	private String partyTypeId;

	@Getter
	@Setter
	private String partyName;


}

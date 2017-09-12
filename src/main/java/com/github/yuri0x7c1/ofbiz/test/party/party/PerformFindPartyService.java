package com.github.yuri0x7c1.ofbiz.test.party.party;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ofbiz.service.LocalDispatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PerformFindPartyService {

	public static final String NAME = "performFindParty";
	@Autowired
	private LocalDispatcher dispatcher;

	@NoArgsConstructor
	public static class In {
		@Getter
		@Setter
		private String roleTypeId;
		@Getter
		@Setter
		private String noConditionFind;
		@Getter
		@Setter
		private String extInfo;
		@Getter
		@Setter
		private Object extCond;
		@Getter
		@Setter
		private String partyId;
		@Getter
		@Setter
		private String partyTypeId;
		@Getter
		@Setter
		private String userLoginId;
		@Getter
		@Setter
		private String externalId;
		@Getter
		@Setter
		private String groupName;
		@Getter
		@Setter
		private String firstName;
		@Getter
		@Setter
		private String lastName;
		@Getter
		@Setter
		private String address1;
		@Getter
		@Setter
		private String address2;
		@Getter
		@Setter
		private String city;
		@Getter
		@Setter
		private String stateProvinceGeoId;
		@Getter
		@Setter
		private String postalCode;
		@Getter
		@Setter
		private String infoString;
		@Getter
		@Setter
		private String countryCode;
		@Getter
		@Setter
		private String areaCode;
		@Getter
		@Setter
		private String contactNumber;
		@Getter
		@Setter
		private String idValue;
		@Getter
		@Setter
		private String partyIdentificationTypeId;
		@Getter
		@Setter
		private String inventoryItemId;
		@Getter
		@Setter
		private String serialNumber;
		@Getter
		@Setter
		private String softIdentifier;
		@Getter
		@Setter
		private String partyRelationshipTypeId;
		@Getter
		@Setter
		private List ownerPartyIds;
		@Getter
		@Setter
		private String sortField;
		@Getter
		@Setter
		private Object locale;
		@Getter
		@Setter
		private String password;
		@Getter
		@Setter
		private String username;
		@Getter
		@Setter
		private Object timeZone;
		@Getter
		@Setter
		private Object userLogin;

		public Map toMap() {
			Map map = new HashMap();
			map.put("roleTypeId", roleTypeId);
			map.put("noConditionFind", noConditionFind);
			map.put("extInfo", extInfo);
			map.put("extCond", extCond);
			map.put("partyId", partyId);
			map.put("partyTypeId", partyTypeId);
			map.put("userLoginId", userLoginId);
			map.put("externalId", externalId);
			map.put("groupName", groupName);
			map.put("firstName", firstName);
			map.put("lastName", lastName);
			map.put("address1", address1);
			map.put("address2", address2);
			map.put("city", city);
			map.put("stateProvinceGeoId", stateProvinceGeoId);
			map.put("postalCode", postalCode);
			map.put("infoString", infoString);
			map.put("countryCode", countryCode);
			map.put("areaCode", areaCode);
			map.put("contactNumber", contactNumber);
			map.put("idValue", idValue);
			map.put("partyIdentificationTypeId", partyIdentificationTypeId);
			map.put("inventoryItemId", inventoryItemId);
			map.put("serialNumber", serialNumber);
			map.put("softIdentifier", softIdentifier);
			map.put("partyRelationshipTypeId", partyRelationshipTypeId);
			map.put("ownerPartyIds", ownerPartyIds);
			map.put("sortField", sortField);
			map.put("locale", locale);
			map.put("login.password", password);
			map.put("login.username", username);
			map.put("timeZone", timeZone);
			map.put("userLogin", userLogin);
			return map;
		}

		public void fromMap(java.util.Map map) {
			In result = new In();
			roleTypeId = (String) map.get("roleTypeId");
			noConditionFind = (String) map.get("noConditionFind");
			extInfo = (String) map.get("extInfo");
			extCond = (Object) map.get("extCond");
			partyId = (String) map.get("partyId");
			partyTypeId = (String) map.get("partyTypeId");
			userLoginId = (String) map.get("userLoginId");
			externalId = (String) map.get("externalId");
			groupName = (String) map.get("groupName");
			firstName = (String) map.get("firstName");
			lastName = (String) map.get("lastName");
			address1 = (String) map.get("address1");
			address2 = (String) map.get("address2");
			city = (String) map.get("city");
			stateProvinceGeoId = (String) map.get("stateProvinceGeoId");
			postalCode = (String) map.get("postalCode");
			infoString = (String) map.get("infoString");
			countryCode = (String) map.get("countryCode");
			areaCode = (String) map.get("areaCode");
			contactNumber = (String) map.get("contactNumber");
			idValue = (String) map.get("idValue");
			partyIdentificationTypeId = (String) map
					.get("partyIdentificationTypeId");
			inventoryItemId = (String) map.get("inventoryItemId");
			serialNumber = (String) map.get("serialNumber");
			softIdentifier = (String) map.get("softIdentifier");
			partyRelationshipTypeId = (String) map
					.get("partyRelationshipTypeId");
			ownerPartyIds = (List) map.get("ownerPartyIds");
			sortField = (String) map.get("sortField");
			locale = (Object) map.get("locale");
			password = (String) map.get("login.password");
			username = (String) map.get("login.username");
			timeZone = (Object) map.get("timeZone");
			userLogin = (Object) map.get("userLogin");
		}

		public In(java.util.Map map) {
			fromMap(map);
		}
	}

	@ToString
	@NoArgsConstructor
	public static class Out {
		@Getter
		@Setter
		private Object listIt;
		@Getter
		@Setter
		private String errorMessage;
		@Getter
		@Setter
		private List errorMessageList;
		@Getter
		@Setter
		private String responseMessage;
		@Getter
		@Setter
		private String successMessage;
		@Getter
		@Setter
		private List successMessageList;

		public Map toMap() {
			Map map = new HashMap();
			map.put("listIt", listIt);
			map.put("errorMessage", errorMessage);
			map.put("errorMessageList", errorMessageList);
			map.put("responseMessage", responseMessage);
			map.put("successMessage", successMessage);
			map.put("successMessageList", successMessageList);
			return map;
		}

		public void fromMap(java.util.Map map) {
			Out result = new Out();
			listIt = (Object) map.get("listIt");
			errorMessage = (String) map.get("errorMessage");
			errorMessageList = (List) map.get("errorMessageList");
			responseMessage = (String) map.get("responseMessage");
			successMessage = (String) map.get("successMessage");
			successMessageList = (List) map.get("successMessageList");
		}

		public Out(java.util.Map map) {
			fromMap(map);
		}
	}

	public Out runSync(In in) {
		Map result = null;
		try {
			result = dispatcher.runSync(NAME, in.toMap());
		} catch (Exception e) {
			log.error("Error", e);
		}
		return new Out(result);
	}
}
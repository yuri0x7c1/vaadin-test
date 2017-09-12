package com.github.yuri0x7c1.ofbiz.test.party.party.ui.form;

import com.vaadin.ui.VerticalLayout;
import lombok.extern.slf4j.Slf4j;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;

import lombok.Getter;

import com.github.yuri0x7c1.ofbiz.test.party.party.PerformFindPartyService;
import com.github.yuri0x7c1.ofbiz.test.party.party.PerformFindPartyService.In;
import com.vaadin.data.Binder;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Button;
import javax.annotation.PostConstruct;

@Slf4j
@SpringComponent
@UIScope
public class PerformFindPartyServiceForm extends VerticalLayout {

	@Getter
	private In bean;
	private Binder<PerformFindPartyService.In> binder = new Binder<>();
	@Getter
	private TextField roleTypeIdField = new TextField("roleTypeId");
	@Getter
	private TextField noConditionFindField = new TextField("noConditionFind");
	@Getter
	private TextField extInfoField = new TextField("extInfo");
	@Getter
	private int extCondField;
	@Getter
	private TextField partyIdField = new TextField("partyId");
	@Getter
	private TextField partyTypeIdField = new TextField("partyTypeId");
	@Getter
	private TextField userLoginIdField = new TextField("userLoginId");
	@Getter
	private TextField externalIdField = new TextField("externalId");
	@Getter
	private TextField groupNameField = new TextField("groupName");
	@Getter
	private TextField firstNameField = new TextField("firstName");
	@Getter
	private TextField lastNameField = new TextField("lastName");
	@Getter
	private TextField address1Field = new TextField("address1");
	@Getter
	private TextField address2Field = new TextField("address2");
	@Getter
	private TextField cityField = new TextField("city");
	@Getter
	private TextField stateProvinceGeoIdField = new TextField(
			"stateProvinceGeoId");
	@Getter
	private TextField postalCodeField = new TextField("postalCode");
	@Getter
	private TextField infoStringField = new TextField("infoString");
	@Getter
	private TextField countryCodeField = new TextField("countryCode");
	@Getter
	private TextField areaCodeField = new TextField("areaCode");
	@Getter
	private TextField contactNumberField = new TextField("contactNumber");
	@Getter
	private TextField idValueField = new TextField("idValue");
	@Getter
	private TextField partyIdentificationTypeIdField = new TextField(
			"partyIdentificationTypeId");
	@Getter
	private TextField inventoryItemIdField = new TextField("inventoryItemId");
	@Getter
	private TextField serialNumberField = new TextField("serialNumber");
	@Getter
	private TextField softIdentifierField = new TextField("softIdentifier");
	@Getter
	private TextField partyRelationshipTypeIdField = new TextField(
			"partyRelationshipTypeId");
	@Getter
	private int ownerPartyIdsField;
	@Getter
	private TextField sortFieldField = new TextField("sortField");
	@Getter
	private Button runButton = new Button("Run");

	public void setBean(In bean) {
		this.bean = bean;
		binder.setBean(bean);
	}

	@PostConstruct
	private void init() {
		binder.forField(roleTypeIdField).bind(
				PerformFindPartyService.In::getRoleTypeId,
				PerformFindPartyService.In::setRoleTypeId);
		binder.forField(noConditionFindField).bind(
				PerformFindPartyService.In::getNoConditionFind,
				PerformFindPartyService.In::setNoConditionFind);
		binder.forField(extInfoField).bind(
				PerformFindPartyService.In::getExtInfo,
				PerformFindPartyService.In::setExtInfo);
		/*
		binder.forField(extCondField).bind(
				PerformFindPartyService.In::getExtCond,
				PerformFindPartyService.In::setExtCond);
				*/
		binder.forField(partyIdField).bind(
				PerformFindPartyService.In::getPartyId,
				PerformFindPartyService.In::setPartyId);
		binder.forField(partyTypeIdField).bind(
				PerformFindPartyService.In::getPartyTypeId,
				PerformFindPartyService.In::setPartyTypeId);
		binder.forField(userLoginIdField).bind(
				PerformFindPartyService.In::getUserLoginId,
				PerformFindPartyService.In::setUserLoginId);
		binder.forField(externalIdField).bind(
				PerformFindPartyService.In::getExternalId,
				PerformFindPartyService.In::setExternalId);
		binder.forField(groupNameField).bind(
				PerformFindPartyService.In::getGroupName,
				PerformFindPartyService.In::setGroupName);
		binder.forField(firstNameField).bind(
				PerformFindPartyService.In::getFirstName,
				PerformFindPartyService.In::setFirstName);
		binder.forField(lastNameField).bind(
				PerformFindPartyService.In::getLastName,
				PerformFindPartyService.In::setLastName);
		binder.forField(address1Field).bind(
				PerformFindPartyService.In::getAddress1,
				PerformFindPartyService.In::setAddress1);
		binder.forField(address2Field).bind(
				PerformFindPartyService.In::getAddress2,
				PerformFindPartyService.In::setAddress2);
		binder.forField(cityField).bind(PerformFindPartyService.In::getCity,
				PerformFindPartyService.In::setCity);
		binder.forField(stateProvinceGeoIdField).bind(
				PerformFindPartyService.In::getStateProvinceGeoId,
				PerformFindPartyService.In::setStateProvinceGeoId);
		binder.forField(postalCodeField).bind(
				PerformFindPartyService.In::getPostalCode,
				PerformFindPartyService.In::setPostalCode);
		binder.forField(infoStringField).bind(
				PerformFindPartyService.In::getInfoString,
				PerformFindPartyService.In::setInfoString);
		binder.forField(countryCodeField).bind(
				PerformFindPartyService.In::getCountryCode,
				PerformFindPartyService.In::setCountryCode);
		binder.forField(areaCodeField).bind(
				PerformFindPartyService.In::getAreaCode,
				PerformFindPartyService.In::setAreaCode);
		binder.forField(contactNumberField).bind(
				PerformFindPartyService.In::getContactNumber,
				PerformFindPartyService.In::setContactNumber);
		binder.forField(idValueField).bind(
				PerformFindPartyService.In::getIdValue,
				PerformFindPartyService.In::setIdValue);
		binder.forField(partyIdentificationTypeIdField).bind(
				PerformFindPartyService.In::getPartyIdentificationTypeId,
				PerformFindPartyService.In::setPartyIdentificationTypeId);
		binder.forField(inventoryItemIdField).bind(
				PerformFindPartyService.In::getInventoryItemId,
				PerformFindPartyService.In::setInventoryItemId);
		binder.forField(serialNumberField).bind(
				PerformFindPartyService.In::getSerialNumber,
				PerformFindPartyService.In::setSerialNumber);
		binder.forField(softIdentifierField).bind(
				PerformFindPartyService.In::getSoftIdentifier,
				PerformFindPartyService.In::setSoftIdentifier);
		binder.forField(partyRelationshipTypeIdField).bind(
				PerformFindPartyService.In::getPartyRelationshipTypeId,
				PerformFindPartyService.In::setPartyRelationshipTypeId);
		/*
		binder.forField(ownerPartyIdsField).bind(
				PerformFindPartyService.In::getOwnerPartyIds,
				PerformFindPartyService.In::setOwnerPartyIds);
				*/
		binder.forField(sortFieldField).bind(
				PerformFindPartyService.In::getSortField,
				PerformFindPartyService.In::setSortField);
		addComponent(roleTypeIdField);
		addComponent(noConditionFindField);
		addComponent(extInfoField);
		// addComponent(extCondField);
		addComponent(partyIdField);
		addComponent(partyTypeIdField);
		addComponent(userLoginIdField);
		addComponent(externalIdField);
		addComponent(groupNameField);
		addComponent(firstNameField);
		addComponent(lastNameField);
		addComponent(address1Field);
		addComponent(address2Field);
		addComponent(cityField);
		addComponent(stateProvinceGeoIdField);
		addComponent(postalCodeField);
		addComponent(infoStringField);
		addComponent(countryCodeField);
		addComponent(areaCodeField);
		addComponent(contactNumberField);
		addComponent(idValueField);
		addComponent(partyIdentificationTypeIdField);
		addComponent(inventoryItemIdField);
		addComponent(serialNumberField);
		addComponent(softIdentifierField);
		addComponent(partyRelationshipTypeIdField);
		// addComponent(ownerPartyIdsField);
		addComponent(sortFieldField);
		addComponent(runButton);
	}
}
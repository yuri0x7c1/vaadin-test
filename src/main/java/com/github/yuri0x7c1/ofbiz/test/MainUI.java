package com.github.yuri0x7c1.ofbiz.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ofbiz.entity.GenericDelegator;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.entity.util.EntityListIterator;
import org.apache.ofbiz.party.party.PartyHelper;
import org.apache.ofbiz.service.LocalDispatcher;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.yuri0x7c1.ofbiz.test.party.party.PartyEntity;
import com.github.yuri0x7c1.ofbiz.test.party.party.PerformFindPartyService;
import com.github.yuri0x7c1.ofbiz.test.party.party.ui.form.PerformFindPartyServiceForm;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringUI
@Theme("valo")
public class MainUI extends UI {

	@Autowired
	GenericDelegator delegator;

	@Autowired
	LocalDispatcher dispatcher;

	@Autowired
	PerformFindPartyService service;

	@Autowired
	PerformFindPartyServiceForm form;

	private Grid<PartyEntity> partyGrid = new Grid<>();

	@Override
	protected void init(VaadinRequest request) {
		VerticalLayout layout = new VerticalLayout();

		log.info(dispatcher.toString());
		log.info(delegator.toString());

		PerformFindPartyService.In in = new PerformFindPartyService.In();
		in.setUsername("admin");
		in.setPassword("ofbiz");
		in.setNoConditionFind("Y");

		form.setBean(in);

		form.getRunButton().addClickListener(event -> {
			PerformFindPartyService.Out out = service.runSync(in);
			log.info(out.toString());
			if (out.getListIt() != null) {
				EntityListIterator listIt = (EntityListIterator) out.getListIt();
				try {
					List<PartyEntity>  partyList = new ArrayList<>();
					for (GenericValue v : listIt.getCompleteList()) {
						log.info(v.toString());

						PartyEntity partyEntity = new PartyEntity();
						partyEntity.setPartyId((String) v.get("partyId"));
						partyEntity.setPartyTypeId((String) v.get("partyTypeId"));
						partyEntity.setPartyName(PartyHelper.getPartyName(delegator, partyEntity.getPartyId(), true));

						partyList.add(partyEntity);
					}

					partyGrid.setItems(partyList);


				}
				catch (Exception e) {
					log.error("Error", e);
				}
			}

		});

		layout.addComponent(form);

		partyGrid.addColumn(PartyEntity::getPartyId).setCaption("Party Id");
		partyGrid.addColumn(PartyEntity::getPartyName).setCaption("Party Name");

		layout.addComponent(partyGrid);

		setContent(layout);
	}

}

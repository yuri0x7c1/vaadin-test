package com.example.vaadin_test;

import org.ofbiz.entity.GenericDelegator;
import org.ofbiz.service.LocalDispatcher;

import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;


public class VaadinTestUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		
		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);

		Button button = new Button("Click Me!");
		button.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				layout.addComponent(new Label("Hello, World! I'am vaadin test application inside ofbiz container!"));
			}
		});
		layout.addComponent(button);
		
		GenericDelegator delegator = (GenericDelegator) VaadinServlet.getCurrent().getServletContext().getAttribute("delegator");
		LocalDispatcher dispatcher = (LocalDispatcher) VaadinServlet.getCurrent().getServletContext().getAttribute("dispatcher");
	}

}
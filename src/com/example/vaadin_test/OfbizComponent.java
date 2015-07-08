package com.example.vaadin_test;

import org.ofbiz.base.util.Debug;
import org.ofbiz.entity.GenericDelegator;
import org.ofbiz.service.LocalDispatcher;

import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.CustomComponent;

public class OfbizComponent extends CustomComponent {
	
	protected GenericDelegator delegator;
	
	protected LocalDispatcher dispatcher;

	public OfbizComponent() {
		delegator = (GenericDelegator) VaadinServlet.getCurrent().getServletContext().getAttribute("delegator");
		if (delegator == null) {
			Debug.log("Delegator is null!");
		}
		
		dispatcher = (LocalDispatcher) VaadinServlet.getCurrent().getServletContext().getAttribute("dispatcher");
		if (dispatcher == null) {
			Debug.log("Dispatcher is null!");
		}
	}
}

package com.example.vaadin_test;

import org.ofbiz.base.util.Debug;

import com.example.vaadin_test.views.EntityDataView;
import com.example.vaadin_test.views.EntityView;
import com.example.vaadin_test.views.ServiceView;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;


@SuppressWarnings("serial")
public class VaadinTestUI extends UI {
	
	private Navigator navigator;

	@Override
	protected void init(VaadinRequest request) {
		VerticalLayout mainLayout = new VerticalLayout();
		setContent(mainLayout);
		
		MenuBar mainMenuBar = new MenuBar();
		
		mainMenuBar.addItem("Services", new MenuBar.Command() {
		    public void menuSelected(MenuBar.MenuItem selectedItem) {
		    	navigator.navigateTo("services");
		    }
		});
		
		mainMenuBar.addItem("Entities", new MenuBar.Command() {
		    public void menuSelected(MenuBar.MenuItem selectedItem) {
		    	navigator.navigateTo("entities");
		    }
		});
		
		mainLayout.addComponent(mainMenuBar);
				
		CssLayout content = new CssLayout();
		content.setSizeFull();
		mainLayout.addComponent(content);
		
		navigator = new Navigator(this, content);
		navigator.addView("services", ServiceView.class);
		navigator.addView("entities", EntityView.class);
		navigator.navigateTo("services");
	}
}
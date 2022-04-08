package com.demo.application.views.demo;

import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class TopBarView extends VerticalLayout{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Label logo = new Label("LOGO"); 
	private HorizontalLayout menuLayout = new HorizontalLayout();
	private HorizontalLayout rightLayout = new HorizontalLayout();
	
	public TopBarView() {
		
		addClassNames("container header");
		logo.addClassName("logo");
		menuLayout.addClassName("menu");
		menuLayout.setWidth("100%");
		menuLayout.add(logo);
		addMenus();
		menuLayout.add(rightLayout);
		rightLayout.addClassName("navbar-menu");
		add(menuLayout);
		
	}
	
	private void addMenus() {
		Anchor menu1 = new Anchor("","Menu 1");
		rightLayout.add(menu1);
		Anchor menu2 = new Anchor("","Menu 2");
		rightLayout.add(menu2);
		Anchor menu3 = new Anchor("","Menu 3");
		rightLayout.add(menu3);
	}

}

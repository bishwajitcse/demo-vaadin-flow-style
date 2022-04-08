package com.demo.application.views.demo;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;


@CssImport(value="./themes/demo-vaadin-flow-style/views/button-view.css",themeFor="vaadin-button")
public class CategoryView extends Div{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CategoryView() {
		addClassName("category");
		
		Button btnCat1 = new Button("Cleaning");
		btnCat1.addClassName("catservice");
		Icon icon1 = VaadinIcon.PAINT_ROLL.create();
		icon1.addClassName("top-service-tile-icon");
		btnCat1.setIcon(icon1);
		
		Button btnCat2 = new Button("Maid");
		btnCat2.addClassName("catservice");
		Icon icon2 = VaadinIcon.FEMALE.create();
		icon2.addClassName("top-service-tile-icon");
		btnCat2.setIcon(icon2);
		
		add(btnCat1);
		add(btnCat2);
	}
}

package com.demo.application.views.demo;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

@CssImport(value="./themes/demo-vaadin-flow-style/views/textfield.css",themeFor="vaadin-text-field")
public class BannerView extends VerticalLayout{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BannerView() {
		setMargin(false);
		setPadding(false);
		addClassName("banner-container");
		add(addBanner());
		Div overlay = new Div();
		overlay.addClassName("banner-overlay");
		add(overlay);
	}

	private Div addBanner() {
		Div bannerCmpLayout = new Div();
		bannerCmpLayout.addClassName("home-banner");
		bannerCmpLayout.getStyle().set("background-image", "url(\"./images/banner1.jpg\")");
		
		Div search = new Div();
		search.addClassName("search");
		H1 slog1= new H1("Your Personal Assistant");
		slog1.addClassName("slog1");
		search.add(slog1);
		H2 slog2= new H2("One-stop solution for your services. Order any service, anytime.");
		slog2.addClassName("slog2");
		search.add(slog2);
		
		HorizontalLayout searchFields = new HorizontalLayout();
		Button btnMarker = new Button("Location");
		btnMarker.addThemeNames("primary small");
		btnMarker.addClassName("btn-location");
		btnMarker.setIcon(VaadinIcon.MAP_MARKER.create());
		searchFields.add(btnMarker);
		
		TextField txtSearch = new TextField();
		Icon icon = VaadinIcon.SEARCH.create();
		icon.getStyle().set("fill", "#00a281");
		txtSearch.setPrefixComponent(icon);
		txtSearch.addClassName("search");
		searchFields.add(txtSearch);
		searchFields.setAlignItems(Alignment.END);
		
		search.add(searchFields);
		bannerCmpLayout.add(search);
		
		
		return bannerCmpLayout;
	}
}

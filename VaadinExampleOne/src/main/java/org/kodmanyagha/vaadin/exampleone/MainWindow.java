package org.kodmanyagha.vaadin.exampleone;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
@Title("My UI")
@Theme("liferay")
public class MainWindow extends UI {

	@Override
	protected void init(VaadinRequest request) {
		VerticalLayout content = new VerticalLayout();
		setContent(content);

		// Display the greeting
		content.addComponent(new Label("Hello World!"));

		// Have a clickable button
		content.addComponent(new Button("Push Me!", new Button.ClickListener() {

			public void buttonClick(ClickEvent event) {
				Notification.show("Pushed!");
			}
		}));
	}
}

package org.koushik.javabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener<DrawEvent> {

	public MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@Override
	public void onApplicationEvent(DrawEvent drawEvent) {
		System.out.println(messageSource.getMessage(drawEvent.toString(), null, "Draw event occurred", DrawingApp.getLocale()));
		//System.out.println(drawEvent.toString());
		
	}

}

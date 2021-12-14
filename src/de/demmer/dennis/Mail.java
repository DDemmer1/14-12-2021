package de.demmer.dennis;

import java.util.Date;

public class Mail{

	private String sender;
	private String recipient;
	private String date;
	private String text;
	
	
	public Mail() {
		System.out.println("Objekt wird aus Klasse erstellt");
	}

	public Mail(String sender, String recipient) {
		this();
		this.sender = sender;
		this.recipient = recipient;
		this.date = new Date().toString();
		this.text = "";
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSender() {
		return sender;
	}

	public String getDate() {
		return date;
	}
	
	
	public String toString() {
		return "Mail [sender=" + sender + ", recipient=" + recipient + ", date=" + date + ", text=" + text + "]";
	}

}

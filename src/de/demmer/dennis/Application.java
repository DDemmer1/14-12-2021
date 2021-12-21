package de.demmer.dennis;


public class Application {

	public static void main(String[] args) {

		Mail mail = new Mail("sender@bla.xy", "empfänger@smail.uni-koeln.de");
		
		System.out.println(mail.toString());
	
	}

}

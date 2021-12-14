package de.demmer.dennis;


public class Application {

	public static void main(String[] args) {

		Mail mail = new Mail("Dennis.Demmer@web.de", "Dennis.Demmer@uni-koeln.de");
		
		System.out.println(mail.toString());
	
	}

}

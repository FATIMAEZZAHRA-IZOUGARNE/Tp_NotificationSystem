package com.notification;

public class TestSystemeNotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utilisateur Yassine = new Utilisateur("Yassine", "Yassine@example.com");
		Utilisateur Ali = new Utilisateur("Ali", "Ali@example.com");
		
		ServiceNotification service1= new ServiceNotification("EmailSender");
		ServiceNotification service2= new ServiceNotification("SMSSender");
		
		SystemeSurveillance systemeSecurite= new SystemeSurveillance("SystemeSecuritePrincipale");
		systemeSecurite.ajouterObservateur(service1);
		systemeSecurite.ajouterObservateur(service2);
		
		systemeSecurite.notifierObservateurs("alerteCritique", Yassine);
		systemeSecurite.notifierObservateurs("nouvelleCommande",Ali);
		
	}

}
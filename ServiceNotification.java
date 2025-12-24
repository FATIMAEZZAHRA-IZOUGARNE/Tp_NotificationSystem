package com.notification;

public class ServiceNotification implements ObservateurEvenement {
	  private String typeService;
	  
	  public ServiceNotification(String typeService) {
		    this.typeService=typeService;
	  }
	  
	  @Override
	  public void mettreAJour(String evenement, Object donnees) {
		    if ("EmailSender".equals(this.typeService)) {
		    	      System.out.println("[Service Email]: Envoi d'un email pour l'événement "+evenement);
		    }
		    else if ("SMSSender".equals(this.typeService)) {
		           System.out.println("[Service SMS]: Envoi d'un SMS pour l'événement "+evenement);
		    }
		    else {
		    	     System.out.println(this.typeService+"Envoi d'un SMS pour l'événement"+evenement);
		    }
		    
		    	  
		    if (donnees instanceof Utilisateur) {
  	    	           ((Utilisateur)donnees).recevoirNotification("Message lié à l'événement " + evenement);
  	        }
	    	       
	  }
	  
	  
}
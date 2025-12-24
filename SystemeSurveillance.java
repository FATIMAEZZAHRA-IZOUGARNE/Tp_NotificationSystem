package com.notification;
import java.util.ArrayList;
import java.util.List;


public class SystemeSurveillance implements SujetEvenement{
	private String nomSysteme;
	private List<ObservateurEvenement> observateurs; 
	
	 public SystemeSurveillance(String nomSysteme) {
	        this.nomSysteme = nomSysteme;
	        this.observateurs = new ArrayList<>();
	 }
	 
	 @Override
	 public void ajouterObservateur(ObservateurEvenement observateur) {
		    this.observateurs.add(observateur);
		    System.out.println("observateur ajouter en succes! au "+this.nomSysteme);
	 }
	 
	 @Override
	 public void retirerObservateur(ObservateurEvenement observateur) {
		    this.observateurs.remove(observateur);
		    System.out.println("observateur supprime en succes! au "+this.nomSysteme);
	 }
	 
	 @Override
	 public void notifierObservateurs(String evenement, Object donnees) {
		     for(ObservateurEvenement obs: observateurs) {
		    	      obs.mettreAJour(evenement, donnees);
		    	           
		     }
		     System.out.println("les observateurs sont notifiés!");
	 }

}
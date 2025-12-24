package com.notification;

interface SujetEvenement {
	
	public void ajouterObservateur(ObservateurEvenement observateur);
	public void retirerObservateur(ObservateurEvenement observateur);
	public void notifierObservateurs(String evenement, Object donnees);

}

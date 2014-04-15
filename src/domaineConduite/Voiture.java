package domaineConduite;

import java.util.Observable;

public class Voiture extends Observable {

	private int coordXEnMetres;
	private int coordYEnMetres;
	private int vitesseMetreParSecondes;

	public static final int largeurDomaine = 1000;

	public Voiture(int coordXEnMetres) {
		this.coordXEnMetres = coordXEnMetres;
		this.vitesseMetreParSecondes = 0;
	}

	public Voiture(int coordXEnMetres, int coordYEnMetres, int vitesseMetreParSecondes) {
		this.coordXEnMetres = coordXEnMetres;
		this.coordYEnMetres = coordYEnMetres;
		this.vitesseMetreParSecondes = vitesseMetreParSecondes;
	}

	public int getCoordXEnMetres() {
		return coordXEnMetres;
	}
	
	public int getCoordYEnMetres() {
		return coordYEnMetres;
	}

	public int getVitesseMetreParSecondes() {
		return vitesseMetreParSecondes;
	}

	public void avancerEnFonctionDeLaVitesse() {
		coordXEnMetres += vitesseMetreParSecondes;
		coordYEnMetres += vitesseMetreParSecondes;
		notificationObservateurs();
	}

	private void notificationObservateurs() {
		this.setChanged();
		this.notifyObservers();
	}
}

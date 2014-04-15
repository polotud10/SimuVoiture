package domaineConduite;

import java.util.Observable;

public class Voiture extends Observable {

	private int coordXEnMetres;
	private int coordYEnMetres;
	private int vitesseMetreParSecondes;
	private double angle;
	private int tailleTriangle;

	public static final int largeurDomaine = 1000;
	public static final int coeffVitesse = 1;
	public static final double coeffRotation = 5;

	public Voiture(int coordXEnMetres) {
		this.coordXEnMetres = coordXEnMetres;
		this.vitesseMetreParSecondes = 0;
		this.angle = 0;
		this.tailleTriangle = 50;
	}

	public Voiture(int coordXEnMetres, int coordYEnMetres, int vitesseMetreParSecondes) {
		this.coordXEnMetres = coordXEnMetres;
		this.coordYEnMetres = coordYEnMetres;
		this.vitesseMetreParSecondes = vitesseMetreParSecondes;
		this.angle = 0;
		this.tailleTriangle = 50;
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
		double radians = Math.toRadians(angle);
                  
		double vitesseEnX = Math.cos(radians) * vitesseMetreParSecondes;
		double vitesseEnY = Math.sin(radians) * vitesseMetreParSecondes;
		
		coordXEnMetres += vitesseEnX;
		coordYEnMetres += vitesseEnY;
		
		notificationObservateurs();
	}

	private void notificationObservateurs() {
		this.setChanged();
		this.notifyObservers();
	}

	public void setAngle(double angle) {
		this.angle = angle;
		notificationObservateurs();
	}

	public double getAngle() {
		return angle;
	}

	public void accelerer() {
		vitesseMetreParSecondes += coeffVitesse;
	}

	public void decelerer() {
		if (vitesseMetreParSecondes > 0) {
			vitesseMetreParSecondes -= coeffVitesse;
		}
	}

	public void tournerDroite() {
		angle += coeffRotation;
	}

	public void tournerGauche() {
		angle -= coeffRotation;
	}

	public void setTaille(int taille) {
		tailleTriangle = taille;
		notificationObservateurs();
	}

	public int getTaille() {
		return tailleTriangle;
	}

	public int getPositionXDuNez() {
		
		double radians = Math.toRadians(angle);
        
		double nezPostionRelativeX = Math.cos(radians) * (getTaille() / 2);
		int nezPostionGlobalX = coordXEnMetres + (int)nezPostionRelativeX;
		
		return nezPostionGlobalX;
	}

	public int getPositionYDuNez() {
		// TODO Auto-generated method stub
		return 0;
	}
}

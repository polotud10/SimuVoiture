package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import domaineConduite.Voiture;



public class TestVoiture {
	
	@Test
	public void testGetX(){
		Voiture voiture = new Voiture(20) ;
		
		int xVoiture = voiture.getCoordXEnMetres() ;
		
		assertEquals(20, xVoiture);
		
	}
	
	@Test
	public void testGetY(){
		Voiture voiture = new Voiture(20,10,150) ;
		
		int yVoiture = voiture.getCoordYEnMetres() ;
		
		assertEquals(10, yVoiture);
	}
	
	@Test
	public void testVitesseX() {
		Voiture voiture = new Voiture(20,10,150);
		
		assertEquals(150,voiture.getVitesseMetreParSecondes());
	}
	
	@Test
	public void testMiseAjourPositionEnFonctionVitesse() {
		Voiture voiture = new Voiture(20,10,100);
		voiture.setAngle(0);
		voiture.avancerEnFonctionDeLaVitesse();
		assertEquals(120, voiture.getCoordXEnMetres());
		assertEquals(10, voiture.getCoordYEnMetres());
	}

	@Test
	public void testAngleVoiture() {
		Voiture voiture = new Voiture(0,0,100);
		voiture.setAngle(20);
		assertTrue(20 == voiture.getAngle());
	}
	
	@Test
	public void testAccelerationVoiture() {
		Voiture voiture = new Voiture(0,0,100);
		voiture.accelerer();
		
		assertEquals(101 ,voiture.getVitesseMetreParSecondes());
	}
	
	@Test
	public void testDecelerationVoiture() {
		Voiture voiture = new Voiture(0,0,100);
		voiture.decelerer();
		
		assertEquals(99 ,voiture.getVitesseMetreParSecondes());
	}
	
	@Test
	public void testTournerDroiteVoiture() {
		Voiture voiture = new Voiture(0,0,100);
		voiture.tournerDroite();

		assertTrue(5 == voiture.getAngle());
	}
	
	@Test
	public void testTournerGaucheVoiture() {
		Voiture voiture = new Voiture(0,0,100);
		voiture.tournerGauche();

		assertTrue(-5 == voiture.getAngle());
	}
	
	@Test
	public void testTailleVoiture() {
		Voiture voiture = new Voiture(0,0,100);
		voiture.setTaille(70);
		
		assertTrue(70 == voiture.getTaille());
	}
	
	@Test
	public void testGetNezXDeLaVoiture() {
		Voiture voiture = new Voiture(50,50,100);
		voiture.setAngle(0);
		
		assertTrue(75 == voiture.getPositionXDuNez());
	}
	
}

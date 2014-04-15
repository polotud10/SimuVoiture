package tests;

import static org.junit.Assert.*;

import java.awt.Point;
import java.awt.Polygon;

import org.junit.Test;

import applicationSimulateur.CalculateurVoiture;

public class TestCalculateurVoiture {

	@Test
	public void testCreeTriangle(){
		
		Polygon affichageDeLaVoiture = CalculateurVoiture.creeTriangle(100,200,50);
		
		int pointDuTriangleEnX[] = affichageDeLaVoiture.xpoints;
		int pointDuTriangleEnY[] = affichageDeLaVoiture.ypoints;
		
		assertEquals(75, pointDuTriangleEnX[0]);
		assertEquals(75, pointDuTriangleEnX[1]);
		assertEquals(125, pointDuTriangleEnX[2]);
		
		assertEquals(175, pointDuTriangleEnY[0]);
		assertEquals(225, pointDuTriangleEnY[1]);
		assertEquals(200, pointDuTriangleEnY[2]);
		
	}
	
	@Test
	public void testRotationPointEnFonctionCentre(){
		
		Point pointA,pointCentrale,pointB ;
		
		pointA = new Point(15,15);
		pointCentrale = new Point(10,10);
		double angle = 40;
		
		pointB = CalculateurVoiture.rotationPointEnFonctionCentre(pointA,pointCentrale,angle);
	
		assertEquals(10, pointB.x);
		assertEquals(17, pointB.y);

		
	}
	
	
	@Test
	public void testCreeTriangleEnFontionAngle(){
		Polygon affichageDeLaVoiture = CalculateurVoiture.creeTriangleEnFonctionAngle(100,200,50,40);
	
		int pointDuTriangleEnX[] = affichageDeLaVoiture.xpoints;
		int pointDuTriangleEnY[] = affichageDeLaVoiture.ypoints;
		
		
		assertEquals(97, pointDuTriangleEnX[0]);
		assertEquals(65, pointDuTriangleEnX[1]);
		assertEquals(119, pointDuTriangleEnX[2]);
		
		assertEquals(165, pointDuTriangleEnY[0]);
		assertEquals(203, pointDuTriangleEnY[1]);
		assertEquals(216, pointDuTriangleEnY[2]);
	}
	
	
}

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
		
		assertEquals(100, pointDuTriangleEnX[0]);
		assertEquals(100, pointDuTriangleEnX[1]);
		assertEquals(150, pointDuTriangleEnX[2]);
		
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
	
}

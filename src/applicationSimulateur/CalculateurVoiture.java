package applicationSimulateur;

import java.awt.Point;
import java.awt.Polygon;

public class CalculateurVoiture {

	public static Polygon creeTriangle(int xPixelVoiture, int yPixelVoiture, int tailleVoiture) {

		int pointDuTriangleEnX[] = {0,0,0} ;
		int pointDuTriangleEnY[] = {0,0,0} ;
		int nombreDePoints = 3;
		
		pointDuTriangleEnX[0]=xPixelVoiture-tailleVoiture/2; 
		pointDuTriangleEnX[1]=xPixelVoiture-tailleVoiture/2; 
		pointDuTriangleEnX[2]=xPixelVoiture+tailleVoiture/2;
		
		pointDuTriangleEnY[0]=yPixelVoiture-tailleVoiture/2;
		pointDuTriangleEnY[1]=yPixelVoiture+tailleVoiture/2; 
		pointDuTriangleEnY[2]=yPixelVoiture;

		Polygon affichageDeLaVoiture = new Polygon(pointDuTriangleEnX, pointDuTriangleEnY, nombreDePoints);  
	
		
		return affichageDeLaVoiture;
	}

	public static Point rotationPointEnFonctionCentre(Point pointA, Point pointCentrale,double angle) {
		
		double angleRad = (angle/180)*Math.PI;
	    double cosAngle = Math.cos(angleRad );
	    double sinAngle = Math.sin(angleRad );
	    double deltaX = (pointA.x-pointCentrale.x);
	    double deltaY = (pointA.y-pointCentrale.y);
	
	    Point pointResultant = new Point();
	    pointResultant.x = pointCentrale.x + (int) (deltaX*cosAngle-deltaY*sinAngle);
	    pointResultant.y = pointCentrale.y + (int) (deltaX*sinAngle+deltaY*cosAngle);
	    
	    return pointResultant;
	}

	public static Polygon creeTriangleEnFonctionAngle(int xPixelVoiture, int yPixelVoiture, int tailleVoiture,double angle) {
		// TODO Auto-generated method stub
		
		Point sommetTriangle1 = new Point(xPixelVoiture-tailleVoiture/2,yPixelVoiture-tailleVoiture/2);
		Point sommetTriangle2 = new Point(xPixelVoiture-tailleVoiture/2,yPixelVoiture+tailleVoiture/2);
		Point sommetTriangle3 = new Point(xPixelVoiture+tailleVoiture/2,yPixelVoiture);
		Point centreTriangle = new Point(xPixelVoiture,yPixelVoiture);
		
		
		sommetTriangle1 = rotationPointEnFonctionCentre(sommetTriangle1,centreTriangle,angle);
		sommetTriangle2 = rotationPointEnFonctionCentre(sommetTriangle2,centreTriangle,angle);
		sommetTriangle3 = rotationPointEnFonctionCentre(sommetTriangle3,centreTriangle,angle);
		
		
		int pointDuTriangleEnX[] = {0,0,0} ;
		int pointDuTriangleEnY[] = {0,0,0} ;
		int nombreDePoints = 3;
		
		pointDuTriangleEnX[0]=sommetTriangle1.x; 
		pointDuTriangleEnX[1]=sommetTriangle2.x; 
		pointDuTriangleEnX[2]=sommetTriangle3.x; 
		
		pointDuTriangleEnY[0]=sommetTriangle1.y; 
		pointDuTriangleEnY[1]=sommetTriangle2.y; 
		pointDuTriangleEnY[2]=sommetTriangle3.y; 
		
		Polygon affichageDeLaVoiture = new Polygon(pointDuTriangleEnX, pointDuTriangleEnY, nombreDePoints);  
		
		return affichageDeLaVoiture;
	}

	

	
}

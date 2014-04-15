package applicationSimulateur;

import java.awt.Point;
import java.awt.Polygon;

public class CalculateurVoiture {

	public static Polygon creeTriangle(int xPixelVoiture, int yPixelVoiture, int tailleVoiture) {

		int pointDuTriangleEnX[] = {0,0,0} ;
		int pointDuTriangleEnY[] = {0,0,0} ;
		int nombreDePoints = 3;
		
		pointDuTriangleEnX[0]=xPixelVoiture; 
		pointDuTriangleEnX[1]=xPixelVoiture; 
		pointDuTriangleEnX[2]=xPixelVoiture+tailleVoiture;
		
		pointDuTriangleEnY[0]=yPixelVoiture-tailleVoiture/2;
		pointDuTriangleEnY[1]=yPixelVoiture+tailleVoiture/2; 
		pointDuTriangleEnY[2]=yPixelVoiture;

		Polygon affichageDeLaVoiture = new Polygon(pointDuTriangleEnX, pointDuTriangleEnY, nombreDePoints);  
	
		
		return affichageDeLaVoiture;
	}

	public static Point rotationPoint(Point pointA, Point pointCentrale,double angle) {
		
		double angleRad = (angle/180)*Math.PI;
	    double cosAngle = Math.cos(angleRad );
	    double sinAngle = Math.sin(angleRad );
	    double dx = (pointA.x-pointCentrale.x);
	    double dy = (pointA.y-pointCentrale.y);
	
	    Point pointResultant = new Point();
	    pointResultant.x = pointCentrale.x + (int) (dx*cosAngle-dy*sinAngle);
	    pointResultant.y = pointCentrale.y + (int) (dx*sinAngle+dy*cosAngle);
	    
	    return pointResultant;
	}

	

	
}

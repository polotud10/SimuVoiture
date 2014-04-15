package applicationSimulateur;

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

	
}

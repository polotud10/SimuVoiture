package applicationSimulateur;

import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;

public class DessinVoiture extends JFrame {

	
	public static final int TailleFenetreEnPixels = 500;
	
	private int xPixelVoiture;
	private int yPixelVoiture;

	public DessinVoiture() {
		super();
		this.setTitle("Simulateur de Voiture");
		this.setSize(TailleFenetreEnPixels, TailleFenetreEnPixels);
		this.setVisible(true);
		this.xPixelVoiture = 0;
		this.yPixelVoiture = 0;
	}

	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		dessinerVoiture(this.xPixelVoiture, this.yPixelVoiture, graphics);

	}

	public void dessinerVoiture(int xPixelVoiture, int yPixelVoiture, Graphics graphics) {
	
		int pointDuTriangleEnX[] = {0,0,0} ;
		int pointDuTriangleEnY[] = {0,0,0} ;
		int nombreDePoints = 3;
		
		int tailleVoiture = 50;
		
		pointDuTriangleEnX[0]=xPixelVoiture; 
		pointDuTriangleEnX[1]=xPixelVoiture; 
		pointDuTriangleEnX[2]=xPixelVoiture+tailleVoiture;
		
		pointDuTriangleEnY[0]=yPixelVoiture-tailleVoiture/2;
		pointDuTriangleEnY[1]=yPixelVoiture+tailleVoiture/2; 
		pointDuTriangleEnY[2]=yPixelVoiture;

		Polygon affichageDeLaVoiture = new Polygon(pointDuTriangleEnX, pointDuTriangleEnY, nombreDePoints);  
		
		graphics.fillPolygon(affichageDeLaVoiture);
		
	}

	public void setXPixelVoiture(int xPixelVoiture) {
		this.xPixelVoiture = xPixelVoiture;
	}
	
	public void setYPixelVoiture(int yPixelVoiture) {
		this.yPixelVoiture = yPixelVoiture;
	}

}

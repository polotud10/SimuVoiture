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
	
		Polygon affichageDeLaVoiture = CalculateurVoiture.creeTriangleEnFonctionAngle(xPixelVoiture,yPixelVoiture,50,120);
	
		graphics.fillPolygon(affichageDeLaVoiture);
		
	}

	public void setXPixelVoiture(int xPixelVoiture) {
		this.xPixelVoiture = xPixelVoiture;
	}
	
	public void setYPixelVoiture(int yPixelVoiture) {
		this.yPixelVoiture = yPixelVoiture;
	}

}

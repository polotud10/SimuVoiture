package applicationSimulateur;

import java.awt.Graphics;

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
		graphics.fillRect(xPixelVoiture, yPixelVoiture, 40, 20);

	}

	public void setXPixelVoiture(int xPixelVoiture) {
		this.xPixelVoiture = xPixelVoiture;
	}
	
	public void setYPixelVoiture(int yPixelVoiture) {
		this.yPixelVoiture = yPixelVoiture;
	}

}

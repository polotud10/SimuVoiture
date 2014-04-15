package applicationSimulateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

import domaineConduite.Voiture;


public class SimulateurVoiture {

	public static final int dureeUneSecondeEnMilliSecondes = 200;

	public static void main(String[] args) {
		
		DessinVoiture dessinVoiture = new DessinVoiture();
		final Voiture voiture = new Voiture(100,10,10);
		voiture.setAngle(80);
		voiture.setTaille(30);
		final VueVoiture triangle = new VueVoiture(voiture, dessinVoiture);
		
		Timer timerAvancer = new Timer(dureeUneSecondeEnMilliSecondes, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				voiture.avancerEnFonctionDeLaVitesse();
				
			}
		});
		
		timerAvancer.start();
		
		
		dessinVoiture.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					voiture.accelerer();
				}
				
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					voiture.decelerer();
				}
				
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					voiture.tournerDroite();
				}
				
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					voiture.tournerGauche();
				}
			}
		});
		
		while(true){
		}
	}
}

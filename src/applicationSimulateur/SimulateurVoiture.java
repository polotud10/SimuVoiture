package applicationSimulateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

import domaineConduite.Voiture;


public class SimulateurVoiture {

	public static final int dureeUneSecondeEnMilliSecondes = 1000;

	public static void main(String[] args) {
		
		DessinVoiture dessinVoiture = new DessinVoiture();
		final Voiture voiture = new Voiture(100,10,50);
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
					System.out.println("fleche du haut");
				}
				
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					System.out.println("fleche du bas");
				}
				
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					System.out.println("fleche de droite");
				}
				
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					System.out.println("fleche de gauche");
				}
			}
		});
		
		while(true){
		}
	}
}

package animated.nothreads;

import static animated.nothreads.Constants.*;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnimatedBalls {

	public static void main(String[] args) {
		
		//Her oppretter vi et ball-objekt med gitt farge
		Ball roedBall = new Ball(Color.RED);
		Ball groennBall = new Ball(Color.GREEN);
		Ball blaaBall = new Ball(Color.BLUE);
		
		//Her oppretter vi en tegneflate og legger til ballobjektet
		JPanel tegneflate = new JPanel();
		tegneflate.setLayout(null);
		tegneflate.add(roedBall);
		tegneflate.add(groennBall);
		tegneflate.add(blaaBall);

		//Her oppretter vi selve 2D-grafikk-vinduet legger til tegneflaten
		JFrame grafikkvinduet = new JFrame();
		grafikkvinduet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		grafikkvinduet.setLayout(new BorderLayout());
		grafikkvinduet.setSize(PANE_SIZE, PANE_SIZE);
		grafikkvinduet.add(tegneflate);
		
		//Her starter vi applikasjonen ved å gjøre grafikkvinduet synlig
		//og be ballen om å gjøre animasjonen, dvs. bevege og tegne seg 
		//på nytt i evig løkke.
		grafikkvinduet.setVisible(true);
		new Thread(roedBall).start();
		new Thread(blaaBall).start();
		new Thread(groennBall).start();
	}

}
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@SuppressWarnings("serial")
public class testFramework extends Applet implements Runnable, KeyListener, MouseListener, MouseMotionListener {
	
	Thread t = new Thread(this);
	
	Terrain terrain;
	
	Dragon dragon = new Dragon();

	
public void init() {
		
		addKeyListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);

		requestFocus();
		
		t.start();

	}

	@Override
	public void run() {
		
		terrain = new Terrain(1500);
		
		for(int i = 0; i < 1500; i+=25){
			
			terrain.addLine(new Point(i,450+(int)(100*Lookup.sin[i%360])));

		}
		
		while (true) {

			repaint();

			try {t.sleep(16);} 
			catch (Exception x) {}
		}
	}

	public void paint(Graphics g) {
		
		terrain.draw(g);
		dragon.draw(g);

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}

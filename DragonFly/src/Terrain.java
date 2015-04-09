import java.awt.Graphics;
import java.awt.Point;


public class Terrain {
	
	int length;
	
	Point startpoint = new Point(-10,600);
	
	Line[] surface = new Line[50];
	int end = 0;
	
	public Terrain (int length){

		this.length = length;
		
	}
	
	public void addLine(Point endpoint){
		
		if (startpoint.x < length){
			
			surface[end++] = new Line (startpoint, endpoint);
			
			startpoint = endpoint;
			
			System.out.println(startpoint.x*100/length+"completed");
			
		} else { 
			
			System.out.println("terrain complete");
		
		}
		
		System.out.println("terrain consists of:");
		for (int i = 0; i < end; i++){
			
			System.out.println("("+surface[i].x1 + ", " + surface[i].y1 + ")  to  (" + surface[i].x2 + ", " + surface[i].y2 + ")");
			
		}
		
	}
	
	public void draw (Graphics g){
		
		
		
		for (int i = 0; i < end; i++){
			
			surface[i].draw(g);
			
		}
		
	}
}

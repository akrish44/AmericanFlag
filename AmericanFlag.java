import java.awt.*;
import java.applet.*;

public class AmericanFlag extends Applet {
        
        private AmericanFlag flag;
        private int width;
        private int height;


        public AmericanFlag(int width, int height) {
        	setHeight(height);
			setWidth(width);
		}

		public void setWidth(int width) {
			if (width > 0) {
				this.width = width;
			}
		}
		public void setHeight(int height) {
			if (height>0) {
				this.height = height;
			}
		}


        public void draw(Graphics g, int width, int height) {
               
        
			// g.setColor(Color.RED);
			// g.fillRect(0.0, 0.0, width, height);

			// g.setColor(Color.WHITE);

		for (int i=0; i<13; i++) {
			if (i%2==0) {
				g.setColor(Color.RED);
				g.fillRect(0, 2*i*height/13 + height/13, width, height/13);	
			} else {
				g.setColor(Color.RED);
				g.fillRect(0, 2*i*height/13 + height/13, width, height/13);
			}
		}
			

        }
        public static void main(String[] args) {
        	AmericanFlag flag = new AmericanFlag(0, 50);

        	// flag.draw(g);
        }
        

}


    



// 	private Rectangle stripe;
// 	private int width;
// 	private int height;
// 	private Rectangle union;
	

// 	//constuction
// 	public AmericanFlag(int height, int width) {
// 		setHeight(height);
// 		setWidth(width);
// 		draw();
// 	}

// 	public void setWidth(int width) {
// 		if (width > 0) {
// 			this.width = width;
// 		}
// 	}
// 	public void setHeight(int height) {
// 		if (height>0) {
// 			this.height = height;
// 		}
// 	}


	
	
// }

// //stripe.draw
// one fill rect
// each object should be able to draw itself
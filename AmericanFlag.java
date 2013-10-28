import java.awt.*;
import java.applet.*;

public class AmericanFlag {
        
        private int width;
        private int height;
        private int x;
        private int y;
        private Rectangle union;

        private Rectangle[] stripes = new Rectangle[13];
        // private Star[] stars;
        private int scale;


        public AmericanFlag(int x, int y, int scale) {
            this.width = 338;
            this.height = 169;
            for (int i=0; i<13; i++) {
                    if (i%2==0) {
                             this.stripes[i] = new Rectangle(new Point(x, y+(height/13*i)*scale), width*scale, (height/13)*scale, Color.RED);
                            

                    } else {

                            this.stripes[i] = new Rectangle(new Point(x, y+(i*height/13)*scale), width*scale, (height/13)*scale, Color.WHITE);
                            

                    }
            }
            this.union = new Rectangle(new Point(x, y), width*2/5*scale, height*7/13*scale, Color.BLUE);
               

        }



        public void draw(Graphics g) {
            for (int i=0; i<13; i++) {
                this.stripes[i].draw(g);
                
            }
            this.union.draw(g);

        }



}
                        
//         private Rectangle stripe;
//         private int width;
//         private int height;
//         private Rectangle union;
        

//         //constuction
//         public AmericanFlag(int height, int width) {
//                 setHeight(height);
//                 setWidth(width);
//                 draw();
//         }

//         public void setWidth(int width) {
//                 if (width > 0) {
//                         this.width = width;
//                 }
//         }
//         public void setHeight(int height) {
//                 if (height>0) {
//                         this.height = height;
//                 }
//         }

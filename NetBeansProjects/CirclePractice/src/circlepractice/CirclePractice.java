/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlepractice;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 *
 * @author Ramborux
 */
public class CirclePractice extends Application {
    
    @Override
    public void start(Stage primaryStage) {}
            // circle center xi,yi and point on circle xf,yf  
    public void circle(int xi, int yi, int xf, int yf){  
        // calculate radius of circle  
        int radius=(int)(Math.sqrt((xf-xi)*(xf-xi)+(yf-yi)*(yf-yi)));  
      
        int d1 = 3 - (2 * radius);  
        int x = 0,i1=x1,i2=x2;  
      
        int y = radius;  
        boolean rov=true;  
      
        // for one eights, while x is not >= y  
        while (rov){  
            if (x>=y){rov=false;}  
            if (d1 < 0) { d1 = d1 + (4 * x) + 6; }  
            else{ d1 = d1 + 4 * (x - y) + 10; // (1)  
                y = y - 1;  
            }  
          
            // draw following circle points   
            setpix((x1+x),(y1+y));  
            setpix((x1+x),(y1-y));  
            setpix((x1-x),(y1+y));  
            setpix((x1-x),(y1-y));  
              
            setpix((x1+y),(y1+x));  
            setpix((x1+y),(y1-x));  
            setpix((x1-y),(y1+x));  
            setpix((x1-y),(y1-x));  
            x++;  
        }  
    }  
    }
    /**
     * @param args the command line arguments
     */
    

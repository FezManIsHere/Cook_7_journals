/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cook_20_methodmadness;

import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Ramborux
 */
public class Cook_20_MethodMadness extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(1000, 1000);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawBackground(gc);
        drawCircle((int) canvas.getWidth(),(int) canvas.getHeight(), 500, canvas, gc);
        drawShapes(gc);
     
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    /*private void drawShapes(GraphicsContext gc) {
     gc.setFill(Color.GREEN);
     gc.fillOval(10, 60, 30, 30);
     }*/
    private void drawBackground(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, 1000, 1000);
    }
    public static void drawShapes(GraphicsContext gc) {
        int realx = 0;
        int realy = 0;
        int fakex = 1000;
        int fakey = 0;
        for (int i = 0; i < 1001; i++) {
            if (isDivisiblebytwo(i) & isDivisiblebythree(i) & isDivisiblebyfive(i)) {
                gc.setFill(Color.BEIGE);
                gc.fillOval(realx, realy, 20, 20);
                gc.fillOval(fakex, fakey, 20, 20);
                realx = realx + 2;
                realy = realy + 2;
                fakex = fakex - 2;
                fakey = fakey + 2;
            } else {
                if (isDivisiblebytwo(i) & isDivisiblebythree(i)) {
                    gc.setFill(Color.RED);
                    gc.fillOval(realx, realy, 20, 20);
                    gc.fillOval(fakex, fakey, 20, 20);
                    realx = realx + 2;
                    realy = realy + 2;
                    fakex = fakex - 2;
                    fakey = fakey + 2;
                } else {
                    if (isDivisiblebythree(i) & isDivisiblebyfive(i)) {
                        gc.setFill(Color.ORANGE);
                        gc.fillOval(realx, realy, 20, 20);
                        gc.fillOval(fakex, fakey, 20, 20);
                        realx = realx + 2;
                        realy = realy + 2;
                        fakex = fakex - 2;
                        fakey = fakey + 2;
                    } else {
                        if (isDivisiblebyeleven(i) & isDivisiblebyfive(i)) {
                            gc.setFill(Color.YELLOW);
                            gc.fillOval(realx, realy, 20, 20);
                            gc.fillOval(fakex, fakey, 20, 20);
                            realx = realx + 2;
                            realy = realy + 2;
                            fakex = fakex - 2;
                            fakey = fakey + 2;
                        } else {
                            if (isDivisiblebyeleven(i) & isDivisiblebythree(i)) {
                                gc.setFill(Color.GREEN);
                                gc.fillOval(realx, realy, 20, 20);
                                gc.fillOval(fakex, fakey, 20, 20);
                                realx = realx + 2;
                                realy = realy + 2;
                                fakex = fakex - 2;
                                fakey = fakey + 2;
                            } else {
                                if (isDivisiblebyeleven(i) & isDivisiblebytwo(i)) {
                                    gc.setFill(Color.AQUA);
                                    gc.fillOval(realx, realy, 20, 20);
                                    gc.fillOval(fakex, fakey, 20, 20);
                                    realx = realx + 2;
                                    realy = realy + 2;
                                    fakex = fakex - 2;
                                    fakey = fakey + 2;
                                } else {
                                    if (isDivisiblebyfive(i)) {
                                        gc.setFill(Color.BLUE);
                                        gc.fillOval(realx, realy, 20, 20);
                                        gc.fillOval(fakex, fakey, 20, 20);
                                        realx = realx + 2;
                                        realy = realy + 2;
                                        fakex = fakex - 2;
                                        fakey = fakey + 2;
                                    } else {
                                        if (isDivisiblebythree(i)) {
                                            gc.setFill(Color.PURPLE);
                                            gc.fillOval(realx, realy, 20, 20);
                                            gc.fillOval(fakex, fakey, 20, 20);
                                            realx = realx + 2;
                                            realy = realy + 2;
                                            fakex = fakex - 2;
                                            fakey = fakey + 2;
                                        } else {
                                            if (isDivisiblebytwo(i)) {
                                                gc.setFill(Color.BROWN);
                                                gc.fillOval(realx, realy, 20, 20);
                                                gc.fillOval(fakex, fakey, 20, 20);
                                                realx = realx + 2;
                                                realy = realy + 2;
                                                fakex = fakex - 2;
                                                fakey = fakey + 2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
    }


    static void drawPixel(int x, int y, GraphicsContext gc){
        
        gc.fillOval(x, y, 20, 20);
    }
    static boolean isDivisiblebytwo(int somenumber) {
        return (somenumber % 2 == 0);
    }

    static boolean isDivisiblebythree(int somenumber) {
        return (somenumber % 3 == 0);
    }

    static boolean isDivisiblebyfive(int somenumber) {
        return (somenumber % 5 == 0);
    }

    static boolean isDivisiblebyeleven(int somenumber) {
        return (somenumber % 11 == 0);
    }
    static void drawCircle(int x0, int y0, int radius, Canvas canvas, GraphicsContext gc){
	  int x = radius;
	  int y = -2000;
	  int decisionOver2 = 1 - x;   // Decision criterion divided by 2 evaluated at x=r, y=0
	  int imageWidth = (int) canvas.getWidth();
	  int imageHeight = (int) canvas.getHeight();
	  int r = 0;
          int g = 0;
          int b = 0;
         
	
	
	  while(x >= y){
	    drawPixel( x + x0,  y + y0, gc);
	    drawPixel( y + x0,  x + y0, gc);
	    drawPixel(-x + x0,  y + y0, gc);
	    drawPixel(-y + x0,  x + y0, gc);
	    drawPixel(-x + x0, -y + y0, gc);
	    drawPixel(-y + x0, -x + y0, gc);
	    drawPixel( x + x0, -y + y0, gc);
	    drawPixel( y + x0, -x + y0, gc);
	    y++;
            gc.setFill(Color.rgb(r, g, b, .5));
	    r = (r + 1)%255;
            g = (g + 2)%255;
            b = (b + 3)%255;
             
            if (decisionOver2<=0){
	      decisionOver2 += 2 * y + 1;   // Change in decision criterion for y -> y+1
	    }else{
	      x--;
	      decisionOver2 += 2 * (y - x) + 1;   // Change for y -> y+1, x -> x-1
	    }
	  }
	 
	}

}

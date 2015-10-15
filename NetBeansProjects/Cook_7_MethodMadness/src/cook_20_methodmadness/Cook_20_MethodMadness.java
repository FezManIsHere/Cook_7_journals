/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cook_20_methodmadness;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import java.util.Random;
import java.util.Scanner;

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
    public static void drawShapes(GraphicsContext gc) {
        int realx = 0;
        int realy = 0;
        for (int i = 0; i < 1001; i++) {
            if (isDivisiblebytwo(i) & isDivisiblebythree(i) & isDivisiblebyfive(i)) {
                gc.setFill(Color.BEIGE);
                gc.fillOval(realx, realy, 20, 20);
                realx = realx + 2;
                realy = realy + 2;
            } else {
                if (isDivisiblebytwo(i) & isDivisiblebythree(i)) {
                    gc.setFill(Color.RED);
                    gc.fillOval(realx, realy, 20, 20);
                    realx = realx + 2;
                    realy = realy + 2;
                } else {
                    if (isDivisiblebythree(i) & isDivisiblebyfive(i)) {
                        gc.setFill(Color.ORANGE);
                        gc.fillOval(realx, realy, 20, 20);
                        realx = realx + 2;
                        realy = realy + 2;
                    } else {
                        if (isDivisiblebyeleven(i) & isDivisiblebyfive(i)) {
                            gc.setFill(Color.YELLOW);
                            gc.fillOval(realx, realy, 20, 20);
                            realx = realx + 2;
                            realy = realy + 2;
                        } else {
                            if (isDivisiblebyeleven(i) & isDivisiblebythree(i)) {
                                gc.setFill(Color.GREEN);
                                gc.fillOval(realx, realy, 20, 20);
                                realx = realx + 2;
                                realy = realy + 2;
                            } else {
                                if (isDivisiblebyeleven(i) & isDivisiblebytwo(i)) {
                                    gc.setFill(Color.AQUA);
                                    gc.fillOval(realx, realy, 20, 20);
                                    realx = realx + 2;
                                    realy = realy + 2;
                                } else {
                                    if (isDivisiblebyfive(i)) {
                                        gc.setFill(Color.BLUE);
                                        gc.fillOval(realx, realy, 20, 20);
                                        realx = realx + 2;
                                        realy = realy + 2;
                                    } else {
                                        if (isDivisiblebythree(i)) {
                                            gc.setFill(Color.PURPLE);
                                            gc.fillOval(realx, realy, 20, 20);
                                            realx = realx + 2;
                                            realy = realy + 2;
                                        } else {
                                            if (isDivisiblebytwo(i)) {
                                                gc.setFill(Color.BROWN);
                                                gc.fillOval(realx, realy, 20, 20);
                                                realx = realx + 2;
                                                realy = realy + 2;
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
}

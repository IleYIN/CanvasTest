package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
 
public class FxCanvasExample4 extends Application
{
    public static void main(String[] args) 
    {
        Application.launch(args);
    }
     
    @Override
    public void start(Stage stage) 
    {
        // Create the Canvas
        Canvas canvas = new Canvas(400, 200);
        // Get the graphics context of the canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();
        // Set line width
        gc.setLineWidth(2.0);
        // Set the Color
        gc.setStroke(Color.GREEN);
        // Set fill color
        gc.setFill(Color.LIGHTCYAN);
 
        // Start the Path
        gc.beginPath();
        // Make different Paths
        gc.moveTo(50, 50);
        gc.quadraticCurveTo(30, 150, 300, 200);
        gc.fill();
        // End the Path
        gc.closePath();
        // Draw the Path
        gc.stroke();
         
        // Create the Pane
        Pane root = new Pane();
        // Set the Style-properties of the Pane
        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");
         
        // Add the Canvas to the Pane
        root.getChildren().add(canvas);
        // Create the Scene
        Scene scene = new Scene(root);
        // Add the Scene to the Stage
        stage.setScene(scene);
        // Set the Title of the Stage
        stage.setTitle("Drawing Paths on a Canvas");
        // Display the Stage
        stage.show();       
    }   
}
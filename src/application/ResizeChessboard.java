package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ResizeChessboard extends Application {
    GridPane root = new GridPane();
    final int size = 10;

    public void start(Stage primaryStage) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                Rectangle square = new Rectangle();
                
             
                
                Color color;
                if ((row + col) % 2 == 0) color = Color.WHITE;
                else color = Color.BLUE;
                square.setFill(color);
                
                Text text = new Text("...");
                StackPane stack = new StackPane();
                stack.getChildren().addAll(square, text);
                
                root.add(stack, col, row);
                square.widthProperty().bind(root.widthProperty().divide(size));
                square.heightProperty().bind(root.heightProperty().divide(size));
            }
        }
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
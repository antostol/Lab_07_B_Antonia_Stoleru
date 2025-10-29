/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_07_b_antonia_stoleru;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.image.*;
import java.util.Random;

/**
 *
 * @author 2484936
 */
public class Lab_07_B_Antonia_Stoleru extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
       BorderPane root = new BorderPane();
       Scene sc = new Scene(root, 250, 300);
       stage.setTitle("Java Games");
       
       Label lblImage = new Label("");
       StackPane middle = new StackPane(lblImage);
       Label top = new Label("Random game");
       Label bottom = new Label("Waiting...");
       
       root.setTop(top);
       root.setBottom(bottom);
       root.setCenter(middle);
       
       Random r = new Random();
       int rand = r.nextInt(20) + 101;
       
       String link = "file:images/" + rand + ".jpg";
       
       Image image = new Image(link);
       
       lblImage.setGraphic(new ImageView(image));
       
       stage.setScene(sc);
       stage.show();
    }
    
}

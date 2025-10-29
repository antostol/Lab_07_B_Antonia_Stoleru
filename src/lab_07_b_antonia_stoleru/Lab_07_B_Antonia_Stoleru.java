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
import javafx.animation.FadeTransition;
import javafx.animation.SequentialTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.util.Duration;

/**
 *
 * @author 2484936
 */
public class Lab_07_B_Antonia_Stoleru extends Application {
    String link = "file:images/";
    int idx = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
       BorderPane root = new BorderPane();
       
       Button play = new Button("Play");
       Button speedPlus = new Button("Speed +");
       Button speedMinus = new Button("Speed -");
 
       int[] numb = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
                     111, 112, 113, 114, 115, 116, 117, 118, 119, 120};
       
       Image image1 = new Image(link);
              
       FadeTransition fade = new FadeTransition(Duration.millis(2000), new ImageView(image1));
       fade.setFromValue(1);
       fade.setFromValue(0);
       
       play.setOnAction(e -> {
           if (idx < 20) {
               link += numb[idx] + ".jpg";
                idx++;
           } else {
               idx = 0;
               link += numb[idx] + ".jpg";
               idx++;
           }
           
           if (play.getText() == "Play") {
               play.setText("Pause");
               fade.play();
           } else {
               play.setText("Play");
               fade.stop();
           }
       });
       
       speedPlus.setOnAction(e -> {
           
       });
       
       speedMinus.setOnAction(e -> {
           
       });
       
       Scene sc = new Scene(root, 250, 300);
       stage.setScene(sc);
       stage.show();
    }
    
}

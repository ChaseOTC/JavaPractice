/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chpt14myjavafx;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author cd0860807
 */
public class Chpt14MyJavaFX extends Application
{
   @Override        // Override the start method in the Application class
   public void start(Stage primaryStage)
   {
       // Create a button and place it in the scene
       Button btOK = new Button("OK");
       Scene scene = new Scene(btOK, 200, 250);
       primaryStage.setTitle("MyJavaFX");   //Sets stage titel
       primaryStage.setScene(scene);        //Place the scene in the stage
       primaryStage.show();                 //Display the stage
   }
    
    
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}

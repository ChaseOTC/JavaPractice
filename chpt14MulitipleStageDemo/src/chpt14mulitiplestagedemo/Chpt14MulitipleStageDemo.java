/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chpt14mulitiplestagedemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
/**
 *
 * @author cd0860807
 */
public class Chpt14MulitipleStageDemo extends Application
{
    
    @Override
    public void start(Stage primaryStage)
    {
        //Create a scene and place a button in the scene
        
        Scene scene = new Scene(new Button("OK"), 200, 250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        //Creates a new stage
        Stage stage = new Stage();
        stage.setTitle("Second Stage");
        stage.setScene(new Scene(new Button("New Stage"), 100, 100));
        stage.show();
    }
    
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}

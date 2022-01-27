package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        System.out.println("START_main");
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));//this is also good
        //Scene scene = new Scene(fxmlLoader.load());
        Scene scene = new Scene(root);

        scene.setFill(Color.BLUE);
        stage.setTitle("CALCULATOR");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
        Button node = (Button)scene.lookup("#Btn1") ;
        System.out.println("Button node: "+ node.getText());
        try {
            File file = new File(HelloApplication.class.getResource("com/example/calculator/hello-view.fxml").getFile());
            String absolutePath = file.getAbsolutePath();
            String path = file.getPath();
            System.out.println("absolute path: "+ absolutePath);
            System.out.println("path: "+path);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("ERROR: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch();
    }
}

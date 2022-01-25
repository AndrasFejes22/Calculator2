package com.example.calculator;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.testfx.api.*;
import org.testfx.framework.junit.*;


import java.io.IOException;

import static org.testfx.api.FxAssert.verifyThat;


public class HelloApplicationTest extends ApplicationTest{

    @Before
    public void setUp () throws Exception{
        ApplicationTest.launch(HelloApplication.class);
    }

    @After
    public void tearDown() throws Exception{
        FxToolkit.hideStage();
        release(new KeyCode[]{});
        release((new MouseButton[]{}));
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));//felig mukodoo, ezzel: import org.junit.Test;
        Scene scene = new Scene(fxmlLoader.load());
        scene.setFill(Color.BLUE);
        stage.setTitle("CALCULATOR");
        stage.setScene(scene);
        stage.show();
    }



    @org.junit.jupiter.api.Test
    public void buttonExists(){
        FxAssert.verifyThat("#Btn2", (Button btn) -> btn.isVisible());
    }

    @Test
    public void answer() throws FxRobotException, InterruptedException {

        //clickOn("#processLabel").write("3 x 2 ");
        clickOn("#Btn2");
        Thread.sleep(700);
        clickOn("#Btn2");
        Thread.sleep(700);
        clickOn("#BtnMultiplication");
        Thread.sleep(700);
        clickOn("#Btn2");
        Thread.sleep(700);
        clickOn("#BtnAnswer");
        Thread.sleep(700);
        Label label  = lookup("#answerLabel").query();
        //Label label = (Label) alert;
        //org.testfx.assertions.api.Assertions.assertThat(label).isVisible();
        org.testfx.assertions.api.Assertions.assertThat(label.getText()).hasToString("44");
    }
}
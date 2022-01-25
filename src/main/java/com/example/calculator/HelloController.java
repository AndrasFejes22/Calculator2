package com.example.calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    public HelloController(){

    }

    //@FXML
    public Label answerLabel;
    public Button Btn1;
    //@FXML
    public Button Btn2;
    public Button Btn3;
    public Button Btn4;
    public Button Btn5;
    public Button Btn6;
    public Button Btn7;
    public Button Btn8;
    public Button Btn9;
    public Button Btn0;
    public Button BtnClear;
    //@FXML
    public Button BtnMultiplication;
    public Button BtnSubtraction;
    public Button BtnAdd;
    public Button BtnDivide;
    public Button BtnPercent;
    public Button BtnXPerA;
    public Button BtnSquare;
    public Button BtnAMultipleA;
    public Button BtnFactorial;
    public Button BtnComma;
    public Button BtnDelete;
    public Button BtnPlusMinus;
    //public Label processLabel = new Label();
    public Label processLabel;
    public Label processLabel2;
    public String process = "";
    //public TextField processLabel;
    //@FXML
    public Button BtnAnswer;
    //@FXML
    public GridPane gridPane;
    //@FXML
    public BorderPane borderPane;
    boolean boolMinus = false;
    List<Label> MyLabels = new ArrayList<>();
    List<Button> MyButtons = new ArrayList<>();
    private static final String IDLE_BUTTON_STYLE = "-fx-background-color: transparent;";
    private static final String HOVERED_BUTTON_STYLE = "-fx-background-color: yellow ;"; //mouse moved
    private static final String HOVERED_BUTTON_STYLE2 = "-fx-font-size: 25 ;"; //exited target
    //a gombok az ures kepernyore ne szemeteljenek
    public boolean bool_plusMinus = false;
    public static boolean bool_AMultipleA = false;
    public static boolean bool_XPerA = false;
    public static boolean bool_root = false;
    public static boolean bool_percent = false;
    public static boolean bool_fact = false;
    public static boolean bool_ans = false;
    public static boolean bool_Sub = false;
    public static boolean bool_Div = false;
    public static boolean bool_operations = true;




    //@FXML
    public void click_Btn1(ActionEvent actionEvent) {
        Operations.click_NumberButtons(Btn1, setProcessLabel());

    }

    public void click_Btn2(ActionEvent actionEvent) {
        Operations.click_NumberButtons(Btn2, setProcessLabel());
    }

    public void click_Btn3(ActionEvent actionEvent) {
        Operations.click_NumberButtons(Btn3, setProcessLabel());
    }

    public void click_Btn4(ActionEvent actionEvent) {
        Operations.click_NumberButtons(Btn4, setProcessLabel());
    }

    public void click_Btn5(ActionEvent actionEvent) {
        Operations.click_NumberButtons(Btn5, setProcessLabel());
    }

    public void click_Btn6(ActionEvent actionEvent) {
        Operations.click_NumberButtons(Btn6, setProcessLabel());
    }

    public void click_Btn7(ActionEvent actionEvent) {
        Operations.click_NumberButtons(Btn7, setProcessLabel());
    }

    public void click_Btn8(ActionEvent actionEvent) {
        Operations.click_NumberButtons(Btn8, setProcessLabel());
    }

    public void click_Btn9(ActionEvent actionEvent) {
        Operations.click_NumberButtons(Btn9, setProcessLabel());
    }

    public void click_Btn0(ActionEvent actionEvent) {
        Operations.click_NumberButtons(Btn0, setProcessLabel());
    }

    public void click_BtnClear(ActionEvent actionEvent) {
        MyLabels.stream().forEach(a -> a.setText(""));
        bool_ans = false;
        answerLabel.setFont(Font.font(30.0));
    }
    //@FXML
    public void click_BtnMultiplication(ActionEvent actionEvent) {
        Operations.myFalse();
        String str = setProcessLabel().getText();
        String[] strSplit  =str.split(" ");
        System.out.println("strSplit.length_mult : " + strSplit.length);
        System.out.println("str_click_Btn_mult : " + str);
        //System.out.println("str.charAt(str.length()-1)_eleje_mult : " + str.charAt(str.length()-1));

        if(Operations.checkProcessLabel(processLabel)) {
            if (strSplit.length > 1) {//&& str.charAt(str.length()-1) == '-'
                System.out.println("str.charAt(str.length()-1) : " + str.charAt(str.length() - 1));
                //System.out.println("ctn : " + ctn);

                click_Answer();
                setProcessLabel().setText(answerLabel.getText() + " x ");
                //cnt_plusMinus = false;
            } else {
                String str2 = " " + BtnMultiplication.getText() + " ";
                setProcessLabel().setText(str.concat(str2));
            }
        }

    }

    //a számok ELŐŐT legyen space* az HÜLYESÉG mert pl. 11 helyett 1 1 lesz...



    public void click_BtnDivide(ActionEvent actionEvent) {
        Operations.myFalse();
        String str = setProcessLabel().getText();
        String[] strSplit  =str.split(" ");
        System.out.println("strSplit.length_divide : " + strSplit.length);
        System.out.println("str_click_Divide : " + str);
        //System.out.println("str.charAt(str.length()-1)_eleje : " + str.charAt(str.length()-1));

        if(Operations.checkProcessLabel(processLabel)) {
            if (strSplit.length > 1) {//&& str.charAt(str.length()-1) == '-'
                System.out.println("str.charAt(str.length()-1) : " + str.charAt(str.length() - 1));
                //System.out.println("ctn : " + ctn);
                click_Answer();
                setProcessLabel().setText(answerLabel.getText() + " / ");
                //cnt_plusMinus = false;
            } else {
                String str2 = " " + BtnDivide.getText() + " ";
                setProcessLabel().setText(str.concat(str2));
            }
        }
    }



    public void click_BtnSubtraction(ActionEvent actionEvent) {
        Operations.myFalse();
        String str = setProcessLabel().getText();
        String[] strSplit = str.split(" ");
        System.out.println("strSplit.length_sub : " + strSplit.length);
        System.out.println("str_click_Btn_sub : " + str);
        //System.out.println("str.charAt(str.length()-1)_eleje_sub : " + str.charAt(str.length() - 1));


        if(Operations.checkProcessLabel(processLabel)) {
            if (strSplit.length > 1) {//&& str.charAt(str.length()-1) == '-'
                System.out.println("str.charAt(str.length()-1) : " + str.charAt(str.length() - 1));
                //System.out.println("ctn : " + ctn);
                System.out.println("str_before_answer: " + str);
                str = str.substring(0, str.length() - 2);
                System.out.println("str_after_substring: " + str);
                click_Answer();
                setProcessLabel().setText(answerLabel.getText() + " - ");
                //cnt_plusMinus = false;
            } else {
                String str2 = " " + BtnSubtraction.getText() + " ";
                setProcessLabel().setText(str.concat(str2));
            }
        }
    }


    public void click_BtnAdd(ActionEvent actionEvent) {
        Operations.myFalse();
        String str = setProcessLabel().getText();
        String[] strSplit = str.split(" ");
        System.out.println("strSplit.length_mult : " + strSplit.length);
        System.out.println("str_click_Btn_mult : " + str);

        if(Operations.checkProcessLabel(processLabel)) {//EZT a többihez is
            if (strSplit.length > 1) {//&& str.charAt(str.length()-1) == '-'
                System.out.println("str.charAt(str.length()-1) : " + str.charAt(str.length() - 1));
                //System.out.println("ctn : " + ctn);
                System.out.println("str_before_answer: " + str);
                str = str.substring(0, str.length() - 2);
                System.out.println("str_after_substring: " + str);
                click_Answer();
                setProcessLabel().setText(answerLabel.getText() + " + ");//uj
                //cnt_plusMinus = false;
            } else {
                String str2 = " " + BtnAdd.getText() + " ";
                setProcessLabel().setText(str.concat(str2));
            }
        }
    }


    public void click_BtnComma(ActionEvent actionEvent) {
        if(Operations.checkProcessLabel(processLabel)) {
            String str2 = setProcessLabel().getText();
            String str = BtnComma.getText();
            setProcessLabel().setText(str2.concat(str));
        }
    }

    public void click_BtnPlusMinus(ActionEvent actionEvent) {
        bool_plusMinus = true;
        boolean bool = Operations.checkDisplay(setProcessLabel());
        if(bool) {
            Operations.clearDisplay(setProcessLabel(), answerLabel);
            String str = setProcessLabel().getText();
            String minus = "-";
            String plus = "";
            for (int i = 0; i < str.length(); i++) {

                if (!(str.charAt(0) == '-')) {

                    setProcessLabel().setText(minus.concat(str));
                } else {
                    setProcessLabel().setText(plus.concat(str).replace("-", ""));
                }
            }
        }

    }

    public void click_BtnDelete(ActionEvent actionEvent) {
        //kell egy előzetes if a hibaüzenet miatt
        String str = setProcessLabel().getText();
        String str2 = str.substring(0, str.length() - 1);
        //processLabel.setText(str.substring(1));//elejét törli
        setProcessLabel().setText(str2);//végét törli

    }

    //2*3+6 és tsai még nem megoldott
    //@FXML
    public String click_Answer() {
        bool_ans = true;
        System.out.println("click_Answer started");
        System.out.println("bool_AMultipleA :" + bool_AMultipleA);
        System.out.println("bool_XPerA :" + bool_XPerA);
        //String str = getProcessLabel().getText();
        String str = processLabel.getText();
        //boolean bool = true;

        System.out.println("str_click_Answer :" + str);


        for(int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'x') {

                //str = str.substring(1); //vezérlőjelek ( s, A, R) eltavolitasa
                System.out.println("str_click_Answer2 :" + str);
                System.out.println("str.length()_answer :" + str.length());
                str = str.replace("P", "");//(P, F (% és n!) vezérlojelek eltavolitasa, de ezek a string elejen vannak)
                str = str.replace("F", "");
                str = str.replace("s", "");
                str = str.replace("A", "");
                str = str.replace("R", "");

                System.out.println("str_click_Answer2 :" + str);

                String[] strSplit = str.split("x");//multiplication
                Double d1 = Double.valueOf(strSplit[0].trim());
                Double d2 = Double.valueOf(strSplit[1].trim());
                System.out.println("res1_szorzas : " + Operations.multipleDouble(d1, d2));
                if(bool_AMultipleA){
                    String resString = String.valueOf(Operations.multipleDouble(d1, Operations.a_multiple_a(d2)));//main operation (a*a)
                    Operations.printResult(resString , setProcessLabel(), processLabel2, answerLabel);
                    bool_AMultipleA = false;
                }else if (bool_XPerA){
                    String resString = String.valueOf(Operations.multipleDouble(d1, (Double) Operations.x_per_a(d2)));//main operation (1/x)
                    Operations.printResult(resString , setProcessLabel(), processLabel2, answerLabel);
                    bool_XPerA = false;
                }else if (bool_root){
                    String resString = String.valueOf(Operations.multipleDouble(d1, Operations.square(d2)));//main operation (root)
                    Operations.printResult(resString , setProcessLabel(), processLabel2, answerLabel);
                    bool_root = false;
                }else if (bool_percent){
                    String resString = String.valueOf(Operations.multipleDouble(d1, Operations.percent(d2)));//main operation (%)
                    Operations.printResult(resString , setProcessLabel(), processLabel2, answerLabel);
                    bool_percent = false;
                }else if (bool_fact){
                    String resString = String.valueOf(Operations.multipleDouble(d1, Operations.factorial(d2)));//main operation (%)
                    Operations.printResult(resString , setProcessLabel(), processLabel2, answerLabel);
                    bool_fact = false;
                }else {
                    String resString = String.valueOf(Operations.multipleDouble(d1, d2));//main operation (multiple)
                    Operations.printResult(resString, setProcessLabel(), processLabel2, answerLabel);
                }

            }

            if (str.charAt(i) == '+') {//add

                //str = str.substring(1); //vezérlőjelek ( s, A, R) eltavolitasa
                System.out.println("str_click_Answer2 :" + str);
                str = str.replace("P", "");//vezérlojelek eltavolitasa
                str = str.replace("F", "");
                str = str.replace("s", "");
                str = str.replace("A", "");
                str = str.replace("R", "");

                String[] strSplit = str.split("\\+");
                strSplit[0] = strSplit[0].replace('/', ' ');
                strSplit[1] = strSplit[1].replace('/', ' ');
                Double d1 = Double.valueOf(strSplit[0].trim());
                Double d2 = Double.valueOf(strSplit[1].trim());
                System.out.println("res1_add : " + Operations.add(d1, d2));
                System.out.println("cnt_AMultipleA_add :" + bool_AMultipleA);
                System.out.println("cnt_XPerA_add :" + bool_XPerA);
                System.out.println("cnt_root_add :" + bool_root);
                System.out.println("cnt_percent_add :" + bool_percent);
                if(bool_AMultipleA){
                    String resString = String.valueOf(Operations.add(d1, Operations.a_multiple_a(d2)));//main operation (a*a)
                    Operations.printResult(resString , setProcessLabel(), processLabel2, answerLabel);
                    bool_AMultipleA = false;
                }else if (bool_XPerA){
                    String resString = String.valueOf(Operations.add(d1, (Double) Operations.x_per_a(d2)));//main operation (1/x)
                    Operations.printResult(resString , setProcessLabel(), processLabel2, answerLabel);
                    bool_XPerA = false;
                }else if (bool_root){
                    String resString = String.valueOf(Operations.add(d1, Operations.square(d2)));//main operation (root)
                    Operations.printResult(resString , setProcessLabel(), processLabel2, answerLabel);
                    bool_root = false;
                }else if (bool_percent){
                    String resString = String.valueOf(Operations.add(d1, Operations.percent(d2)));//main operation (%)
                    Operations.printResult(resString , setProcessLabel(), processLabel2, answerLabel);
                    bool_percent = false;
                }else if (bool_fact){
                    String resString = String.valueOf(Operations.add(d1, Operations.factorial(d2)));//main operation (%)
                    Operations.printResult(resString , setProcessLabel(), processLabel2, answerLabel);
                    bool_fact = false;
                }else {
                    String resString = String.valueOf(Operations.add(d1, d2));//main operation (multiple)
                    Operations.printResult(resString, setProcessLabel(), processLabel2, answerLabel);
                }
            }
            if (str.charAt(i) == '-' ) {
                System.out.println("str_click_Answer2 :" + str);
                str = str.replace("P", "");//vezérlojelek eltavolitasa
                str = str.replace("F", "");
                str = str.replace("s", "");
                str = str.replace("A", "");
                str = str.replace("R", "");

                String[] strSplit = str.split("- ");
                //if(strSplit.length == 2) {
                    strSplit[0] = strSplit[0].replace('/', ' ');
                    strSplit[1] = strSplit[1].replace('/', ' ');
                    Double d1 = Double.valueOf(strSplit[0].trim());
                    Double d2 = Double.valueOf(strSplit[1].trim());
                    System.out.println("res1_kivonas : " + Operations.subtraction(d1, d2));
                if(bool_AMultipleA){
                    String resString = String.valueOf(Operations.subtraction(d1, Operations.a_multiple_a(d2)));//main operation (a*a)
                    Operations.printResult(resString , setProcessLabel(), processLabel2, answerLabel);
                    bool_AMultipleA = false;
                }else if (bool_XPerA){
                    String resString = String.valueOf(Operations.subtraction(d1, (Double) Operations.x_per_a(d2)));//main operation (1/x)
                    Operations.printResult(resString , setProcessLabel(), processLabel2, answerLabel);
                    bool_XPerA = false;
                }else if (bool_root){
                    String resString = String.valueOf(Operations.subtraction(d1, Operations.square(d2)));//main operation (root)
                    Operations.printResult(resString , setProcessLabel(), processLabel2, answerLabel);
                    bool_root = false;
                }else if (bool_percent){
                    String resString = String.valueOf(Operations.subtraction(d1, Operations.percent(d2)));//main operation (%)
                    Operations.printResult(resString , setProcessLabel(), processLabel2, answerLabel);
                    bool_percent = false;
                }else if (bool_fact){
                    String resString = String.valueOf(Operations.subtraction(d1, Operations.factorial(d2)));//main operation (%)
                    Operations.printResult(resString , setProcessLabel(), processLabel2, answerLabel);
                    bool_fact = false;
                }else {
                    String resString = String.valueOf(Operations.subtraction(d1, d2));//main operation (multiple)
                    Operations.printResult(resString, setProcessLabel(), processLabel2, answerLabel);
                }
               //}else{
                  //  str.concat("-");
                //}
            }
            if(str.charAt(i) == '/') {
                System.out.println("str_click_Answer2 :" + str);
                str = str.replace("P", "");//vezérlojelek eltavolitasa
                str = str.replace("F", "");
                str = str.replace("s", "");
                str = str.replace("A", "");
                str = str.replace("R", "");

                String[] strSplit = str.split("/");
                //strSplit[0] = strSplit[0].replace('/', ' ');
                //strSplit[1] = strSplit[1].replace('/', ' ');
                Double d1 = Double.valueOf(strSplit[0].trim());
                Double d2 = Double.valueOf(strSplit[1].trim());
                System.out.println("res1_divide : " + Operations.divide(d1, d2));
                if(bool_AMultipleA){
                    String resString = String.valueOf(Operations.divide(d1, Operations.a_multiple_a(d2)));//main operation (a*a)
                    Operations.printResult(resString , setProcessLabel(), processLabel2, answerLabel);
                    bool_AMultipleA = false;
                }else if (bool_XPerA){
                    String resString = String.valueOf(Operations.divide(d1, (Double) Operations.x_per_a(d2)));//main operation (1/x)
                    Operations.printResult(resString , setProcessLabel(), processLabel2, answerLabel);
                    bool_XPerA = false;
                }else if (bool_root){
                    String resString = String.valueOf(Operations.divide(d1, Operations.square(d2)));//main operation (root)
                    Operations.printResult(resString , setProcessLabel(), processLabel2, answerLabel);
                    bool_root = false;
                }else if (bool_percent){
                    String resString = String.valueOf(Operations.divide(d1, Operations.percent(d2)));//main operation (%)
                    Operations.printResult(resString , setProcessLabel(), processLabel2, answerLabel);
                    bool_percent = false;
                }else if (bool_fact){
                    String resString = String.valueOf(Operations.divide(d1, Operations.factorial(d2)));//main operation (%)
                    Operations.printResult(resString , setProcessLabel(), processLabel2, answerLabel);
                    bool_fact = false;
                }else {
                    String resString = String.valueOf(Operations.divide(d1, d2));//main operation (multiple)
                    System.out.println("resString_answer_divide: "+resString);
                    Operations.printResult(resString, setProcessLabel(), processLabel2, answerLabel);
                }
            }

            //if(str.charAt(i) == 's') {
            if (str.charAt(i) == 's') {//s = vezérlő jel (sqr)
                String res2 = str.substring(1);
                System.out.println("res2_sqr :" + res2);
                try {
                    Double d1 = Double.parseDouble(res2);

                System.out.println("d1 :" + d1);
                String resString = String.valueOf(Operations.a_multiple_a(d1));
                System.out.println("resString_sqr :" + resString);
                Operations.printResult(resString, setProcessLabel(), processLabel2, answerLabel);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            if (str.charAt(i) == 'A') {//A = vezérlő jel (xPerA)
                String res2 = str.substring(1);
                try {
                    Double d1 = Double.parseDouble(res2);
                    System.out.println("d1 :" + d1);
                    String resString = String.valueOf(Operations.x_per_a(d1));
                    System.out.println("resString_sqr :" + resString);
                    Operations.printResult(resString, setProcessLabel(), processLabel2, answerLabel);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            if (str.charAt(i) == 'R') {//R = vezérlő jel (Root, gyök)
                String res2 = str.substring(1);
                try {
                    Double d1 = Double.parseDouble(res2);
                    System.out.println("d1 :" + d1);
                    String resString = String.valueOf(Operations.square(d1));
                    System.out.println("resString_sqr :" + resString);
                    Operations.printResult(resString, setProcessLabel(), processLabel2, answerLabel);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            if (str.charAt(i) == 'P') {//P = vezérlő jel (percent %)
                String res2 = str.substring(0, str.length() - 1);
                try {
                    Double d1 = Double.parseDouble(res2);
                    System.out.println("d1 :" + d1);
                    String resString = String.valueOf(Operations.percent(d1)) ;
                    System.out.println("resString_sqr :" + resString);
                    //String resString2 = resString.concat(".0");
                    //System.out.println("resString_sqr_concat :" + resString2);
                    Operations.printResult(resString, setProcessLabel(), processLabel2, answerLabel);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            if (str.charAt(i) == 'F') {//F = vezérlő jel (factorial)
                String res2 = str.substring(0, str.length() - 1);
                try {
                    Double d1 = Double.parseDouble(res2);
                    System.out.println("d1 :" + d1);
                    String resString = String.valueOf(Operations.factorial(d1));
                    System.out.println("resString_sqr :" + resString);
                    Operations.printResult(resString, setProcessLabel(), processLabel2, answerLabel);
                    return resString;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }


        }
        return null;
    }

    public void click_XPerA() {
        if(Operations.checkProcessLabel(processLabel)) {
            bool_XPerA = true;
            String str = setProcessLabel().getText();
            setProcessLabel().setText("A" + str);
            click_Answer();
        }
    }

    public void percent() {
        if(Operations.checkProcessLabel(processLabel)) {//ha pl ilyen kinn van hogy 6 + akkor a % gombot ne lehessen lenyomni/plusminus?
            System.out.println("percent_if :" + (Operations.checkProcessLabel(processLabel)));
            System.out.println("percent_if2 :" + (Operations.checkDisplay(processLabel)));
            bool_percent = true;
            String str = setProcessLabel().getText();
            setProcessLabel().setText(" " + str + "P");
            click_Answer();
        }
    }

    public void click_AMultipleA() {//3 a négyzeten egyenlő valami, és utána hozzáadunk valamit nemjó a nyitvahagyott booleanok miatt
        if(Operations.checkProcessLabel(processLabel)) {
            bool_AMultipleA = true;
            String str = setProcessLabel().getText();
            setProcessLabel().setText("s" + str);
            click_Answer();
        }
    }

    public void click_square() {//root
        if(Operations.checkProcessLabel(processLabel)) {
            bool_root = true;
            String str = setProcessLabel().getText();
            setProcessLabel().setText("R" + str);
            click_Answer();
        }

    }

    public void click_Factorial() {
        if(Operations.checkProcessLabel(processLabel)) {
            bool_fact = true;
            String str = setProcessLabel().getText();
            setProcessLabel().setText(" " + str + "F");
            click_Answer();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //borderPane.getChildren().add(gridPane);
        //gridPane.getChildren().add(Btn2);
        Btn2.setVisible(true);
        Btn2.setDisable(false);
        BtnMultiplication.setVisible(true);
        BtnAnswer.setVisible(true);
        processLabel2.setText("");
        setProcessLabel().setText("");
        answerLabel.setText("");
        setProcessLabel().setFont(Font.font(20.0));
        answerLabel.setFont(Font.font(30.0));
        //List of labels
        MyLabels.add(setProcessLabel());
        MyLabels.add(processLabel2);
        MyLabels.add(answerLabel);

        MyButtons.add(Btn1);
        MyButtons.add(Btn2);
        MyButtons.add(Btn3);
        MyButtons.add(Btn4);
        MyButtons.add(Btn5);
        MyButtons.add(Btn6);
        MyButtons.add(Btn7);
        MyButtons.add(Btn8);
        MyButtons.add(Btn9);
        MyButtons.add(Btn0);
        //operation Buttons:
        //MyButtons.add(BtnDivide);
        MyButtons.add(BtnAdd);
        MyButtons.add(BtnMultiplication);
        MyButtons.add(BtnSubtraction);
        MyButtons.add(BtnComma);
        MyButtons.add(BtnPlusMinus);
        MyButtons.add(BtnPlusMinus);
        MyButtons.add(BtnAnswer);
        MyButtons.add(BtnXPerA);
        MyButtons.add(BtnPercent);
        MyButtons.add(BtnSquare);
        MyButtons.add(BtnAMultipleA);

        MyLabels.stream().forEach(a -> a.setText(""));
        Operations.setButtonStyle(MyButtons);
    }
        //private static final String HOVERED_BUTTON_STYLE = "-fx-background-color: gray, -fx-font-size: 25 ;";
        //private static final String HOVERED_BUTTON_STYLE2 = "-fx-font-size: 25;";
        //method
        public static void setButtonStyle (Button btn){
            btn.addEventHandler(MouseEvent.MOUSE_MOVED,
                    e -> btn.setStyle(HOVERED_BUTTON_STYLE));

            btn.addEventHandler(MouseEvent.MOUSE_EXITED_TARGET,
                    e -> btn.setStyle(HOVERED_BUTTON_STYLE2));
        }






    public Label setProcessLabel() {
        return processLabel;
    }

    public void setProcessLabel(Label processLabel) {
        this.processLabel = processLabel;
    }

    public void labelSetText(String str){
        processLabel.setText(str);
    }
}



package com.example.calculator;

//import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;

import java.math.BigInteger;
import java.util.List;

public class Operations {
    private static final String HOVERED_BUTTON_STYLE = "-fx-background-color: yellow ;"; //mouse moved
    private static final String HOVERED_BUTTON_STYLE2 = "-fx-font-size: 25 ;"; //exited target

    public static double multipleDouble(double a, double b){
        return a*b;
    }
    public static double multipleInt(double a, double b){
        return a*b;
    }

    public static double factorial(Double n) {
        BigInteger result = BigInteger.ONE;    // = valueOf(1)
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
            double result2 = result.doubleValue();
        return result2;
    }

    public static double divide(double a, double b){
        return a/b;
    }

    public static double subtraction(double a, double b){
        return a-b;
    }

    public static double add(double a, double b){
        return a+b;
    }

    public static double percent(double a){
        return a/100;
    }

    public static double x_per_a(double a){
        if(a == 0){
            return 0;
        }
        return 1/a;
    }

    public static double square(double a){//gyök
        return Math.sqrt(a);
    }

    public static double a_multiple_a(double a){
        return a*a;
    }

    public static void click_OperationButton(Button btn, Label proc) {
        int ctn = 0;
        String str = proc.getText();
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-'){//ha vann már kinn - jel
                ctn ++;
            }
        }
        if(ctn == 0){
            String str2 = " " + btn.getText(); //- gomb pl
            proc.setText(str.concat(str2));
        }
    }
    //@FXML
    public static void click_NumberButtons(Button btn, Label proc) {
        boolean b1 = false;
        int ctn = 0;

        //String str = proc.getText();
        /*
        System.out.println("str_checkProcessLabel : " + str );
        for(int i = 0; i < str.length(); i++) {
            boolean b2 = false;
            if (str.charAt(i) == 'x' || str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '/') {
                b2 = true;
                b1 = true;
                ctn++;
            }
        }
        */
        //if(!HelloController.bool_ans) {
            String str2 = proc.getText();
            String str3 = btn.getText();
            proc.setText(str2.concat(str3));
        //}
    }

    public static void printResult(String res, Label proc, Label proc2, Label ans){
        System.out.println("printResult started");
        System.out.println("printResult_res: "+res);
            String[] strSplit = res.split("\\.");
            System.out.println("strSplit.length: " + strSplit.length);
            for (int j = 0; j < strSplit.length; j++) {
                System.out.println(j + " = " + strSplit[j]);
            }
            if (strSplit[0].equals("Infinity")) {
                ans.setFont(Font.font(15.0));
                ans.setText("Error: division by zero.");
            }
            else if (strSplit[1].equals("0")) {
                String res2 = res.substring(0, res.length() - 2);
                //res2 = res2.replace("P", "%");
                proc2.setText(proc.getText() + " =");
                ans.setText(res2);

                proc.setText(proc.getText().replace("P", "%"));
                proc.setText(proc.getText().replace("A", "1/"));
                proc.setText(proc.getText().replace("s", "sqr"));
                proc.setText(proc.getText().replace("R", "√"));
                proc.setText(proc.getText().replace("F", "!"));
                proc2.setText(proc.getText() + " =");

                proc.setText(res2);//uj
            } else {//ide csak valódi tizedestört esetén megyünk be, pl.: 23.45611
                ans.setText(res);
                System.out.println("printResult_string");

                proc.setText(proc.getText().replace("P", "%"));
                proc.setText(proc.getText().replace("A", "1/"));
                proc.setText(proc.getText().replace("s", "sqr"));
                proc.setText(proc.getText().replace("R", "√"));
                proc.setText(proc.getText().replace("F", "!"));
                proc2.setText(proc.getText() + " =");

                proc.setText(res);
            }
        //}//

    }


    public static void clearDisplay(Label proc, Label ans) {//plusminus, es a comma hasznalja
        boolean bool = false;
        for (int j = 0; j < proc.getText().length(); j++) {
            //System.out.print(str.charAt(i) + ", ");

            if (proc.getText().charAt(j) == '=') {
                bool = true;
            }
        }
        if (bool) {
            proc.setText("");
            ans.setText("");
        }
        //HelloController.bool_ans = true;
    }

    public static boolean checkDisplay(Label proc){//plusminus, es a comma hasznalja
        if(proc.getText()==""){
            return false;
        }
        return true;
    }

    public static boolean checkProcessLabel(Label proc) {
        boolean b1 = true;
        String str = proc.getText().trim();
        String[] strSplit = str.split(" ");
        System.out.println("str_checkProcessLabel : " + str);
        System.out.println("strSplit.length_checkProcessLabel : " + strSplit.length);
        //egy nulla ("") stringnek bármilyen splittel előálított StringArray-ének a hossza 1!
        //for (int i = 0; i < str.length(); i++) {
            //boolean b1 = true;
            //if (str.charAt(i) == 'x' || str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '/') {
            if (strSplit.length == 2 || str.equals("")) {//ha bármelyik igaz, térjen vissza false val: üres label, vagy pl 3 x
                b1 = false;

            }
        //}
        System.out.println("!str.equals(\"\") : " + (!str.equals("")));
        System.out.println("strSplit.length == 0 : " + (strSplit.length == 0));
        System.out.println("strSplit.length == 2  : " + (strSplit.length == 2 ));
        System.out.println("(strSplit.length == 0 || strSplit.length == 2 || !str.equals(\"\"))  : " + (strSplit.length == 0 || strSplit.length == 2 || !str.equals("")));
        System.out.println("b1_checkProcessLabel : " + b1);
        return b1;
    }

    public static void setButtonStyle(List<Button> MyButtons){
        for(int i = 0; i < MyButtons.size(); i++) {
            int finalI = i;
            MyButtons.get(i).addEventHandler(MouseEvent.MOUSE_MOVED,
                    e -> MyButtons.get(finalI).setStyle(HOVERED_BUTTON_STYLE));

            int finalI1 = i;
            MyButtons.get(i).addEventHandler(MouseEvent.MOUSE_EXITED_TARGET,
                    e -> MyButtons.get(finalI1).setStyle(HOVERED_BUTTON_STYLE2));
        }
    }

    public static void myFalse(){
        HelloController.bool_XPerA = false;
        HelloController.bool_percent = false;
        HelloController.bool_AMultipleA = false;
        HelloController.bool_root= false;
        HelloController.bool_fact= false;

    }

}

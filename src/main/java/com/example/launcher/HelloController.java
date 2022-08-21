package com.example.launcher;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class HelloController {

    @FXML
    private Pane mainPane;

    @FXML
    private Label label1;

    @FXML
    private Slider slider1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private Label label4;

    @FXML
    private Label label5;

    @FXML
    private Slider slider2;

    @FXML
    private Label label6;

    @FXML
    private Label label7;

    @FXML
    private Label label8;

    @FXML
    private Label label9;

    @FXML
    private Label label10;

    @FXML
    private RadioButton rb1;

    @FXML
    private RadioButton rb2;

    @FXML
    private RadioButton rb3;

    @FXML
    private RadioButton rb4;

    @FXML
    private Label label11;

    @FXML
    private Label label12;

    @FXML
    private Label label13;

    @FXML
    private Slider slider3;

    @FXML
    private Label label14;

    @FXML
    private RadioButton rb5;

    @FXML
    private RadioButton rb6;

    @FXML
    private Label label15;

    @FXML
    private RadioButton rb7;

    @FXML
    private RadioButton rb8;

    @FXML
    private RadioButton rb9;

    @FXML
    private Button runButton;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        int perk = 0;
        if (rb2.isSelected()) {
            perk = 1;
        } else if (rb3.isSelected()) {
            perk = 2;
        } else if (rb4.isSelected()) {
            perk = 3;
        }
        int drink = rb5.isSelected() ? 0 : 1;
        int type =  0;
        if (rb7.isSelected()) {
            type = 1;
        } else if (rb8.isSelected()) {
            type = 2;
        }

        LevelGenerator.createJson2((int)slider1.getValue(), (int)slider2.getValue(), perk, (int)slider3.getValue(), drink, type);
        System.out.println("уровень сложности: " + (int)slider1.getValue());
        System.out.println("уровень настроения: " + (int)slider2.getValue());
        System.out.println("уровень суперспособность: " + perk);
        System.out.println("уровень времени: " + (int)slider3.getValue());
        System.out.println("уровень напиток: " + drink);
        System.out.println("уровень тип: " + type);


    }

    @FXML
    protected void onShow() {
        mainPane.setBackground(new Background(new BackgroundImage(new Image(HelloApplication.class.getResourceAsStream("fox.png")),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
        InputStream fontStream = HelloApplication.class.getResourceAsStream("PixeloidSans-Bold.ttf");
        if (fontStream != null) {
            Font bgFont = Font.loadFont(fontStream, 18);
            try {
                fontStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            label1.setFont(bgFont);
            label2.setFont(bgFont);
            label2.setStyle("-fx-text-fill: blue;");
            label3.setFont(bgFont);
            label3.setStyle("-fx-text-fill: blue;");
            label4.setFont(bgFont);
            label4.setStyle("-fx-text-fill: blue;");
            label5.setFont(bgFont);
            label6.setFont(bgFont);
            label6.setStyle("-fx-text-fill: blue;");
            label7.setFont(bgFont);
            label7.setStyle("-fx-text-fill: blue;");
            label8.setFont(bgFont);
            label8.setStyle("-fx-text-fill: blue;");
            label9.setFont(bgFont);
            label9.setStyle("-fx-text-fill: blue;");
            label10.setFont(bgFont);
            rb1.setFont(bgFont);
            rb1.setStyle("-fx-text-fill: blue;");
            rb2.setFont(bgFont);
            rb2.setStyle("-fx-text-fill: blue;");
            rb3.setFont(bgFont);
            rb3.setStyle("-fx-text-fill: blue;");
            rb4.setFont(bgFont);
            rb4.setStyle("-fx-text-fill: blue;");
            label11.setFont(bgFont);
            label12.setFont(bgFont);
            label12.setStyle("-fx-text-fill: blue;");
            label13.setFont(bgFont);
            label13.setStyle("-fx-text-fill: blue;");
            label14.setFont(bgFont);
            rb5.setFont(bgFont);
            rb6.setFont(bgFont);
            label15.setFont(bgFont);
            rb7.setFont(bgFont);
            rb7.setStyle("-fx-text-fill: blue;");
            rb8.setFont(bgFont);
            rb8.setStyle("-fx-text-fill: blue;");
            rb9.setFont(bgFont);
            rb9.setStyle("-fx-text-fill: blue;");
            runButton.setFont(bgFont);
            runButton.setStyle("-fx-text-fill: blue;");
        }
    }
}
package com.example.fxdice;

import com.example.dice.Dice;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        //welcomeText.setText("がはは");

        Dice dice =new Dice();
        dice.rollDice();;
        welcomeText.setText("さいころの目は"+dice.getNumber());
    }
}
package com.example.zarchat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextArea tipArea;
    @FXML
    private TextField AnswerField;


    public void sending(ActionEvent actionEvent) {
        final String answer = AnswerField.getText();
        if(answer != null && !answer.isEmpty()){
            tipArea.requestFocus();
            tipArea.appendText(answer +"\n");
        }
        AnswerField.clear();
    }

}
package exercise.controller;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class ExerciseVievController {


    @FXML
    private TextArea oryginalTextArea;

    @FXML
    private TextArea replacedTextArea;

    @FXML
    private Button clearButton;

    public void initialize() {
        clearButton.setOnAction(actionEvent -> {
            oryginalTextArea.clear();
            replacedTextArea.clear();
        });
    oryginalTextArea.addEventHandler(KeyEvent.KEY_RELEASED, x->{
        StringBuffer sb = (new StringBuffer(oryginalTextArea.getText())).reverse();
        replacedTextArea.setText(sb.toString());

    });
    }


}

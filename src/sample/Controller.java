package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea; // внимание! иногда цепляется не та библиотека - AWT
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea mainArea;

    @FXML
    TextField msgField;


    public void sendMsgAction(ActionEvent actionEvent) {
        mainArea.appendText(msgField.getText() + "\n");
        msgField.clear();
        msgField.requestFocus();
    }

    public void sendMsg(String textMsg) {
        mainArea.appendText(textMsg + "\n");
        msgField.requestFocus();
    }

}

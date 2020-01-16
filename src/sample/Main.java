package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Client_FX");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {

        // javaFX
        launch(args);
//        как отправить текст в окно java fx ??? ((
//        Controller controller = new Controller();
//        controller.sendMsg("тест отправки текста из мейна");


        // Swing
        GUI_Swing gui_Swing = new GUI_Swing();
        gui_Swing.setNewText("тест отправки текста из мейна");
    }
}

package exercise.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainExercise extends Application {
    public static void main(String[] args) {
launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/ExerciseView.fxml"));
        Scene scene = new Scene(anchorPane);
        stage.setScene(scene);
        stage.show();


}
}

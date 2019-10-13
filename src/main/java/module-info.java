module exercise{
requires javafx.graphics;
requires javafx.fxml;
requires  javafx.controls;
opens exercise.controller to javafx.fxml;
exports exercise.main to javafx.graphics;
}
package loginassignment;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Login.startGUI();
    }

    public static void main(String[] args) {
        launch();
    }

}

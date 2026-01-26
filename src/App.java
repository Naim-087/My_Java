import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        // Create a simple UI component
        Label label = new Label("Hello, JavaFX!");

        // Layout the component in the center of the window
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 400, 200);

        // Configure and show the window
        stage.setTitle("My First JavaFX App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // the Stage is the main window of the application
        primaryStage.setTitle("Hello, JavaFX");

        // a StackPane is a layout container/manager used to configure and organize everything visible.
        StackPane root = new StackPane();

        // a Scene is what is displayed on the stage.
        // there can be many Scenes, but only one on the stage at a time
        Scene mainScene = new Scene(root, 300, 250);

        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Scene scene1 = new Scene(root);
        //Parent root = loader.load();
        //Controller controller = loader.getController();
        //controller.setMainWindow(primaryStage);
        primaryStage.setTitle("GomiNote");
        primaryStage.setScene(scene1);  
        primaryStage.show();
        } catch (Exception e) {
        }
    }

    // public static void notesPage(Stage stage) {
    //     TextArea editor = new TextArea();
    //     BorderPane root = new BorderPane(editor);
    //     Scene scene = new Scene(root, 800, 600);
    //     stage.setScene(scene);
    //     stage.show();
    // };

    public static void main(String[] args) {
        launch(args);
    }
}

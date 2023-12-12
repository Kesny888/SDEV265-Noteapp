
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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


    public static void main(String[] args) {
        launch(args);
    }
}

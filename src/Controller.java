import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private TextField tfName;
    private Scene scene;
    private Parent root;
    private Stage stage;


    //  private Stage mainWindow; // Define mainWindow as a variable of type Stage

    // public void setMainWindow(Stage mainWindow) {
    //     this.mainWindow = mainWindow;
    // }
    // public void switchToScene1(ActionEvent event) throws IOException {
    //     Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
    //     stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    //     scene = new Scene(root);
    //     stage.setScene(scene);
    // }

    // public void switchToScene2(ActionEvent event) throws IOException {
    //     Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
    //     stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    //     scene = new Scene(root);
    //     stage.setScene(scene);
    // }

     public void productPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("product.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }

    public void LoginPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }

    public void SignUpPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }

     public void NotePage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }

    // @FXML
    // void OnbtnClick(ActionEvent event) {
    //     // Stage mainWindow = (Stage) tfName.getScene().getWindow();
    //     // String title = tfName.getText();
    //     // mainWindow.setTitle(title);

    // }
    // @FXML
    // void Onbtnlogin(ActionEvent event) throws IOException {



    // }

    // @FXML
    // void OnbtnHome(ActionEvent event) throws IOException {
    //     // Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
    //     // mainWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
    //     // scene = new Scene(root);
    //     // mainWindow.setScene(scene);
    //     // mainWindow.show();
        

    // }


    // private Node mainWindowage(Node source) {
    //     return null;
    // }

}


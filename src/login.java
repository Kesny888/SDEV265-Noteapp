import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class login {

    @FXML
    private Button createAccount;
    @FXML
    private Scene scene;
    private Stage stage;


        @FXML
    private Label status;

    @FXML
    private TextField loginEmail;

    @FXML
    private AnchorPane loginPage;

    @FXML
    private PasswordField loginPassword;

    @FXML
    private Button signIn;

    @FXML
    private Button signInButton;

    @FXML
    private Button signUpButton;

    @FXML
    private AnchorPane signUpPage;

    @FXML
    private TextField tfEmail;

    @FXML
    private PasswordField tfPassword;

    @FXML
    private PasswordField tfconfirmpw;

    @FXML
    void SignIn(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

    }
    @FXML
    void btnCreateaccount(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }

    @FXML
    void Signup(ActionEvent event) throws IOException {
        String user = tfEmail.getText();
        String pass = tfPassword.getText();
        String cpass = tfconfirmpw.getText();
        if(user.isEmpty() || pass.isEmpty() || cpass.isEmpty()) {
            status.setText("All field are necessary to be filled");
            status.setStyle("-fx-text-fill:red");
        } else if(pass.length() < 6) {
            //check if the length of password value is less than to 6
            status.setText("Invalid Password, at least 6 characters needed");
            status.setStyle("-fx-text-fill:red");
        } else if (cpass == pass) { //check if the value of password is equal to confirm password
            status.setText("Password does not match");
            status.setStyle("-fx-text-fill:red");
        
        } else {
             alert.successMessage("Congratulation! You are successfully registered.");
             System.out.println(user);
             System.out.println(pass);
             Parent root = FXMLLoader.load(getClass().getResource("note.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
             
        }
        

    }

    @FXML
    void home(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }

    alertMessage alert = new alertMessage();

    @FXML
    void switchToScene1(ActionEvent event) {     

    }

    @FXML
    public void btnSignIn(ActionEvent event) throws IOException {
        

        String user = loginEmail.getText();
        String pass = loginPassword.getText();

        if (user.isEmpty() || pass.isEmpty()) {
            status.setText("Username and Password is Not correct");
            status.setStyle("-fx-text-fill:red");
        }

        else if(user.equals("team") && pass.equals("123")) {
            status.setText("Username and Password is correct");
            status.setStyle("-fx-text-fill:green");
            Parent root = FXMLLoader.load(getClass().getResource("note.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        }
        else {
            status.setText("Username and Password is Not correct");
            status.setStyle("-fx-text-fill:red");
        }
    }


   
}
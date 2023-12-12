import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.control.ColorPicker;
import javafx.event.ActionEvent;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class note implements Initializable{

    @FXML
    private AnchorPane Noteopen;
        @FXML
    private Spinner<Integer> spinner;

    @FXML
    private Button exit;
     @FXML
    private Label counter;
    @FXML
    private Scene scene;
    private Stage stage;

   @FXML
    private Button newNote;
    @FXML
    private TextArea textArea;
    @FXML
    private ColorPicker colorPicker;

    @FXML
    private Tab newTab;
    @FXML
    private Button save;
    @FXML
    private Button saveAs;
    @FXML
    private Button newPage;
    @FXML
    private Button openNote;
    @FXML
    private AnchorPane startNote;
    @FXML
    private Tab startTab;
    @FXML
    private AnchorPane TextArea;

    FileChooser fileChooser = new FileChooser();
    int currentValue;



    @FXML
    void clickedSave(MouseEvent event) {
        fileChooser.setTitle("Save Myfile");
        File file = fileChooser.showSaveDialog(stage);
        
        if (file != null){
            saveSysytem(file,  textArea.getText());                      
        }
        
    }

    @FXML
    void clickedNew(MouseEvent event){
    
    Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("New Note");
        alert.setHeaderText("Do you want to open a new Note?");

        if(alert.showAndWait().get() == ButtonType.OK){
            textArea.clear();
        }
        

    }

    private Object clickedSave() {
        return null;
    }

    @FXML
    void btnNewNote(ActionEvent event) {
        startNote.setVisible(false);
        TextArea.setVisible(true);
        Noteopen.setVisible(false);

    }

    public void saveSysytem(File file, String content){
        try {
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.write(content);
        printWriter.close();
        }
     catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}
    @FXML
    void btnCreateNote(ActionEvent event) {
    }

    @FXML
    void btnOpenNote(ActionEvent event) throws IOException { 

    }

    @FXML
    void homePage(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }


    @FXML
    void TabNew(ActionEvent event) {
        startTab.setContextMenu(null);

    }

    @FXML
    void TabStart(ActionEvent event) {

    }

      @FXML
    void textAreaType(KeyEvent event) {
        ObservableList<CharSequence> list = textArea.getParagraphs();
        int par = list.size();
        String[] words = textArea.getText().split("\\s+");
        counter.setText("Paragraph: "+ par +" | Words: " + words.length + " | Characters: " + textArea.getLength());

    }

    @FXML
    void clickedExit(MouseEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("Do you want to save before exiting?:");

        if(alert.showAndWait().get() == ButtonType.OK){
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            stage.close();
        }

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        textArea.setWrapText(true);
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100);
        valueFactory.setValue(12);
        spinner.setValueFactory(valueFactory);
        
        // currentValue = spinner.getValue();
        // textArea.setText(Integer.toString(currentValue));
        spinner.valueProperty().addListener(new ChangeListener<Integer>() {

            @Override
            public void changed(ObservableValue<? extends Integer> arg0, Integer arg1, Integer arg2) {
                
                // TODO Auto-generated method stub
                   
                    textArea.setFont(new Font(textArea.getFont().getFamily(),spinner.getValue()));
                }
            
        });
    }

}
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private Button btnEN;
    @FXML
    private Button btnFR;
    @FXML
    private Button btnJP;
    @FXML
    private Button btnIR;

    @FXML
    private Label welcomeText;

    @FXML
    private Label lbl;

    private ResourceBundle resourceBundle;

    private Locale locale;

    private final String NAME = "Mikael";



    @FXML
    protected void onHelloButtonClick(){
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private void loadLanguage(String lang, String country){
        locale = new Locale(lang, country);
        resourceBundle = ResourceBundle.getBundle("message", locale);
        lbl.setText(resourceBundle.getString("greeting") + " " + NAME);
    }

    @FXML
    public void onbtnENClick(ActionEvent actionEvent) {
        loadLanguage("en", "UK");
    }

    @FXML
    public void onbtnFRClick(ActionEvent actionEvent) {
        loadLanguage("fr", "FR");
    }

    @FXML
    public void onbtnJPClick(ActionEvent actionEvent) {
        loadLanguage("ja", "JP");
    }

    @FXML
    public void onbtnIRClick(ActionEvent actionEvent) {
        loadLanguage("fa", "IR");
    }
}

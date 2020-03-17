package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	private AlienDictionary dizionario;
	

   /* @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private Button btnTranslate;
    
    @FXML
    private Button btnReset;

    @FXML
    void doTranslate(ActionEvent event) {
    	// TODO - add the button and complete this    	
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	// TODO - add the button and complete this 
    }
    
    
    @FXML
    void initialize() {

    }*/
	

	

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private TextField txtParola;

	    @FXML
	    private Button btnTranslate;

	    @FXML
	    private TextArea txtArea;

	    @FXML
	    private Button btnReset;

	    @FXML
	    void doReset(ActionEvent event) {
	    	dizionario.getWordList().clear();
	    	txtArea.clear();

	    }

	    @FXML
	    void doTranslate(ActionEvent event) {
	  
	    String parola=txtParola.getText().toLowerCase();
	    for (int i=0;i<parola.length();i++) {
	    	char c=parola.charAt(i);
	    	if (!Character.isLetter(c) && c!=' ') {
	    	txtArea.setText("Inserisci parole valide!\n");
	    	return;
	    }
	    }
	    String parole[]=parola.split(" ");
	    if (parole.length>2) {
	    	txtArea.setText("Inserisci al massimo due parole!\n");
	    }
	    if (parole.length>1) {
	    	String alienWord=parole[0];
	    	String translation=parole[1];
	    	
	    	dizionario.addWord(alienWord,translation);
	    }
	    else
	    {
	    	if (dizionario.translateWord(parola)!=null)
	    	txtArea.appendText(dizionario.translateWord(parola)+"\n");
	    	else {
	    	txtArea.appendText("Parola non esistente!\n");
	    	}
	    }
	    
	    }

	    @FXML
	    void initialize() {
	        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
	        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
	        assert txtArea != null : "fx:id=\"txtArea\" was not injected: check your FXML file 'Scene.fxml'.";
	        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
	        this.dizionario=new AlienDictionary();
	    }
	}


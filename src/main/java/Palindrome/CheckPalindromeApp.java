package Palindrome;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckPalindromeApp extends Application {
	private TextField PalindromoText;
	private Button CheckButton;
	private Label PalindromoLabel;

	@Override
	public void start(Stage primaryStage) throws Exception {

		PalindromoText = new TextField();
		PalindromoText.setPromptText("Introduce una sentencia");
		PalindromoText.setMaxWidth(150);

		PalindromoLabel = new Label("Aqui saldra la comprobación de palindromo");

		CheckButton = new Button("Comprobar");
		CheckButton.setDefaultButton(true);
		CheckButton.setOnAction(e -> onButtonAction(e));

		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(CheckButton, PalindromoText, PalindromoLabel);

		Scene scene = new Scene(root, 320, 200);
		primaryStage.setTitle("CheckPalindrome");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void onButtonAction(ActionEvent e) {
		// TODO Auto-generated method stub
		String Sentencia = PalindromoText.getText();

		if (checkPalindrome(Sentencia) == true) {
			PalindromoLabel.setText("Es Palindromo");
			PalindromoLabel.setStyle("-fx-text-fill: green; -fx-font: Italic bold 30 consolas");
		} else {
			PalindromoLabel.setText("No es Palindromo");
			PalindromoLabel.setStyle("-fx-text-fill: red; -fx-font: Italic bold 30 consolas");
		}

	}
	boolean checkPalindrome(String inputString) {
		  int length  = inputString.length();
		    int i, inicio, fin, mitad;
		  inicio = 0;
		    fin    = length - 1;
		    mitad = (inicio + fin)/2;
		   for (i = inicio; i <= mitad; i++) {
		      if (inputString.charAt(inicio) == inputString.charAt(fin)) {
		        inicio++;
		        fin--;
		      }
		      else {
		        break;
		      }
		   }
		  if (i == mitad + 1) {
		return true;
		  }
		   
		    else {
		      return false;
		    }
		               
		                                      
		                            
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	
}

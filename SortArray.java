import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SortArray extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		VBox vbox = new VBox();
		Scene scene = new Scene(vbox);
		String [] List = new String[10];
		TextField[] text = new TextField[10];
		Button btn = new Button("Enter");
		
		for (int i=0; i<text.length; i++) {
			text [i] = new TextField ("" + (i+1));
			vbox.getChildren().add(text[i]);	
		
		}
		vbox.getChildren().add(btn);
		btn.setOnAction(e-> {
			
			String preSort = "Before Order: \n";
			String postSort = "\nAfter Order: \n";
			
			for (int i=0; i<text.length; i++) {
				List[i] = text[i].getText();
				preSort += List[i] + "\t";
				
			}
			
			SortMethod.sort(List);
			
			for (int i=0; i<text.length; i++) {
				postSort += List[i] + "\t";
			}
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText(preSort + postSort);
			alert.showAndWait();
			
		});
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}

package services;

import javafx.application.Application;
import javafx.event.";
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BeginningEvent extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		Button btkBegin = new Button("Begin");
		
		ButtonHandler handle = new ButtonHandler();
		
		btkOk.setOnAction( handle );
		
		Scene scene = new Scene(btkBegin, 250 , 250);
		primaryStage.setTitle("Beginning");
		primaryStage.setScene(scene);
		primaryStage.show;
		
	}
	public static void main(String[]args) {
		launch(args);
	}
		
}
class ButtonHandler implements EventHandler<ActionEvent>{
	@Override
	public void handle(ActionEvent args) {
		System.out.println("The game started");
		//kati pou na syndeei me to paixnidi mas
	}
}
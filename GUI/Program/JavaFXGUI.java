import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class JavaFXGUI extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox vBox = new VBox();
		
		Scene scene = new Scene(vBox);
		Label label = new Label("Enter 2 numbers to find the sum: ");
		TextField num1 = new TextField();
		TextField num2 = new TextField();
		Button button = new Button("Mathematicalize!");
		button.setOnAction(e -> {
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("The total number of two numbers is: " + (Double.parseDouble(num1.getText())+Double.parseDouble(num2.getText())));
			
			alert.showAndWait();
			
			
		});
		
		vBox.getChildren().addAll(label, num1, num2, button);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}

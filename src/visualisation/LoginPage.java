package visualisation;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginPage  {

	static boolean answer = false;
	
	public static boolean display(String title)  {
		
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);
		grid.setHgap(10);

		// Name label
		Label nameLabel = new Label("Username:");
		GridPane.setConstraints(nameLabel, 0, 0);

		// Name Input
		TextField nameInput = new TextField("Name");
		GridPane.setConstraints(nameInput, 1, 0);

		// Name label
		Label passLabel = new Label("Password:");
		GridPane.setConstraints(passLabel, 0, 1);

		// Name Input
		TextField passInput = new TextField("Pass");
		passInput.setPromptText("password");
		GridPane.setConstraints(passInput, 1, 1);
		
		//Login Button
		Button loginButton = new Button("Log In");
		loginButton.setOnAction(e -> {
			answer = true;
			window.close();
		});
		GridPane.setConstraints(loginButton, 1, 2);
		
		grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);
		
		Scene scene = new Scene(grid, 300, 200);
		window.setScene(scene);

		window.showAndWait();
		
		return answer;
	}

}

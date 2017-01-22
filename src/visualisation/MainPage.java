package visualisation;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainPage extends Application{

	private final String TITLE = "Ksi¹¿ka kucharska";
	Stage window;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle(TITLE);
		window.setOnCloseRequest(e -> {
			e.consume();
			closeProgram();
		});
		
		/*Tworzê górne menu w u³o¿eniu Horyzontalnym*/
		HBox topMenu = new HBox();
		Button button1 = new Button("Kot 1");
		Button button2 = new Button("Kot 2");
		Button button3 = new Button("Logowanie");
		
		button3.setOnAction(e -> {
			// zwraca informacje: true - logowanie sie powiod³o, false - logowanie sie nie powiod³o
			boolean logedIn = LoginPage.display("Logowanie do panelu Administracyjnego");
		});
		topMenu.getChildren().addAll(button1, button2, button3);
		
		/*Tworzê menu po lewej stronie w u³o¿êniu Vertykalnym*/
		VBox leftMenu = new VBox();
		Button button4 = new Button("Kot 4");
		Button button5 = new Button("Kot 5");
		Button button6 = new Button("Kot 6");
		leftMenu.getChildren().addAll(button4, button5, button6);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(topMenu);
		borderPane.setLeft(leftMenu);
		
		//StackPane layout = new StackPane();
		Scene scene = new Scene(borderPane, 800, 650);
		window.setScene(scene);
		window.show();
	}
	
	private void closeProgram(){
		boolean closeWindow = CloseBox.display("Potwierdzenie");
		if(closeWindow)
			window.close();
	}

}

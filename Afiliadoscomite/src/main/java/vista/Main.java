package vista;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		login(primaryStage); // carga el login
    }
	

	public static void main(String[] args) {
		launch(args);
	}
	
	public void login(Stage primaryStage) {
		try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/vista/Login.fxml"));
            // Cargo la ventana
            Pane ventana = (Pane) loader.load();
 
            // Cargo el scene
            Scene scene = new Scene(ventana);
            
 
            // Seteo la scene y la muestro
            primaryStage.setTitle("Control de acceso");
            primaryStage.centerOnScreen();
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
	}
}

	
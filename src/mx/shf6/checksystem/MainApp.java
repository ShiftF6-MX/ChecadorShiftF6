package mx.shf6.checksystem;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import mx.shf6.checksystem.MainApp;


public class MainApp extends Application {
	
	//PANTALLAS PRINCIPALES
	private  Stage escenarioPrincipal;
	private BorderPane pantallaBase;

	@Override
	public void start(Stage primaryStage) {
		//INICIA ESCENARIO PRINCIPAL
		this.configurarEscenarioPrincipal(primaryStage);
		
		iniciarEscenarioPrincipal();
		//iniciarPantallaInicio();
	}
	
	private void configurarEscenarioPrincipal(Stage primaryStage) {
		this.escenarioPrincipal = primaryStage;
		this.escenarioPrincipal.setMaximized(true);
		this.escenarioPrincipal.setResizable(false);
		this.escenarioPrincipal.initStyle(StageStyle.DECORATED);
		this.escenarioPrincipal.setAlwaysOnTop(true);
	}//FIN METODO
	
	public Stage getEscenarioPrincipal() {
		return this.escenarioPrincipal;
	}//FIN METODO
	
	public void iniciarEscenarioPrincipal() {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader();
			fxmlLoader.setLocation(MainApp.class.getResource("view/PantallaBase.fxml"));
			this.pantallaBase = (BorderPane) fxmlLoader.load();
			Scene escenaPrincipal = new Scene(this.pantallaBase);
			escenaPrincipal.setFill(Color.BLACK);
			this.escenarioPrincipal.setScene(escenaPrincipal);
			this.escenarioPrincipal.show();			
		} catch (IOException | IllegalStateException ex) {
			System.out.println(ex);
		}//FIN TRY/CATCH
	}//FIN METODO
	
	/*private void iniciarPantallaInicio() {
		//MODIFICAR ESCENARIO PRINCIPAL
		this.escenarioPrincipal.setMaximized(false);
		this.escenarioPrincipal.setResizable(false);
		this.escenarioPrincipal.setAlwaysOnTop(true);
		

		
		//MUESTRA PANTALLA
		Rectangle2D limitePantalla = Screen.getPrimary().getVisualBounds();
		this.escenarioPrincipal.setX(limitePantalla.getWidth() - this.escenarioPrincipal.getWidth() - 25);
		this.escenarioPrincipal.setY(20);
		
		try {
			FXMLLoader fxmlLoader = new FXMLLoader();
			fxmlLoader.setLocation(MainApp.class.getResource("view/PantallaBase.fxml"));
			
			this.pantallaInicio = (AnchorPane) fxmlLoader.load();
			
		}catch (IOException |IllegalStateException ex){
			
		}
	}*/


	public static void main(String[] args) {
		launch(args);
	}
}

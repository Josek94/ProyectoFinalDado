package proyectofinal.dado;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import proyectofinal.clases.Tipos;


public class MenuController {
	
	private static Tipos tipoDado;
	
	@FXML
	private ImageView imagenDelPrograma;
	
	
	
	@FXML
	private void generarD6() throws IOException{
		tipoDado = Tipos.D6;
		App.setRoot("lanzamiento");
		
		
	}
	
	@FXML
	private void generarD4() throws IOException{
		tipoDado = Tipos.D4;
		App.setRoot("lanzamiento");
		
		
	}
	
	@FXML
	private void generarD8() throws IOException{
		tipoDado = Tipos.D8;
		App.setRoot("lanzamiento");
		
		
	}
	
	@FXML
	private void generarD10() throws IOException{
		tipoDado = Tipos.D10;
		App.setRoot("lanzamiento");
		
		
	}
	
	@FXML
	private void generarD12() throws IOException{
		tipoDado = Tipos.D12;
		App.setRoot("lanzamiento");
		
		
	}
	
	@FXML
	private void generarD20() throws IOException{
		tipoDado = Tipos.D4;
		App.setRoot("lanzamiento");
		
		
	}
	
	@FXML
	private void salir() throws IOException {
		System.exit(0);
	}
	
	@FXML
	private void volverAlMenu() throws IOException {
		App.setRoot("menu");
	}

	public static Tipos getTipoDado() {
		return tipoDado;
	}
	
}

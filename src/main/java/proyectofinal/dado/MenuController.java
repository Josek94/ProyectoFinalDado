package proyectofinal.dado;

import java.io.IOException;

import javafx.fxml.FXML;
import proyectofinal.clases.Tipos;


public class MenuController {
	
	private static Tipos tipoDado;
	
	
	
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

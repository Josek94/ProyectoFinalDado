package proyectofinal.dado;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import proyectofinal.clases.Dado;
import proyectofinal.clases.Tipos;

public class MenuController {
	
	@FXML
	private void generarD6() throws IOException{
		Dado d6 = new Dado(Tipos.D6);
		Alert dadoD6 = new Alert(AlertType.INFORMATION);
		dadoD6.setTitle(d6.getTipo().getNombreCompleto());
		dadoD6.setHeaderText(null);
		dadoD6.setContentText("Se ha lanzado el " + d6.getTipo().getNombreCompleto() +"...\n" + d6.lanzarDado());
		dadoD6.showAndWait();
		
	}
	
	@FXML
	private void generarD4() throws IOException{
		Dado d4 = new Dado(Tipos.D4);
		Alert dadoD4 = new Alert(AlertType.INFORMATION);
		dadoD4.setTitle(d4.getTipo().getNombreCompleto());
		dadoD4.setHeaderText(null);
		dadoD4.setContentText("Se ha lanzado el " + d4.getTipo().getNombreCompleto() +"...\n" + d4.lanzarDado());
		dadoD4.showAndWait();
		
	}
	
	@FXML
	private void generarD8() throws IOException{
		Dado d8 = new Dado(Tipos.D8);
		Alert dadoD8 = new Alert(AlertType.INFORMATION);
		dadoD8.setTitle(d8.getTipo().getNombreCompleto());
		dadoD8.setHeaderText(null);
		dadoD8.setContentText("Se ha lanzado el " + d8.getTipo().getNombreCompleto() +"...\n" + d8.lanzarDado());
		dadoD8.showAndWait();
		
	}
	
	@FXML
	private void generarD10() throws IOException{
		Dado d10 = new Dado(Tipos.D10);
		Alert dadoD10 = new Alert(AlertType.INFORMATION);
		dadoD10.setTitle(d10.getTipo().getNombreCompleto());
		dadoD10.setHeaderText(null);
		dadoD10.setContentText("Se ha lanzado el " + d10.getTipo().getNombreCompleto() +"...\n" + d10.lanzarDado());
		dadoD10.showAndWait();
		
	}
	
	@FXML
	private void generarD12() throws IOException{
		Dado d12 = new Dado(Tipos.D12);
		Alert dadoD12 = new Alert(AlertType.INFORMATION);
		dadoD12.setTitle(d12.getTipo().getNombreCompleto());
		dadoD12.setHeaderText(null);
		dadoD12.setContentText("Se ha lanzado el " + d12.getTipo().getNombreCompleto() +"...\n" + d12.lanzarDado());
		dadoD12.showAndWait();
		
	}
	
	@FXML
	private void generarD20() throws IOException{
		Dado d20 = new Dado(Tipos.D20);
		Alert dadoD20 = new Alert(AlertType.INFORMATION);
		dadoD20.setTitle(d20.getTipo().getNombreCompleto());
		dadoD20.setHeaderText(null);
		dadoD20.setContentText("Se ha lanzado el " + d20.getTipo().getNombreCompleto() +"...\n" + d20.lanzarDado());
		dadoD20.showAndWait();
		
	}
	
	@FXML
	private void salir() throws IOException {
		System.exit(0);
	}
}

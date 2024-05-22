package proyectofinal.dado;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import proyectofinal.clases.Dado;
import proyectofinal.clases.Tipos;

public class DadoController {
	/*private Dado d6 = new Dado(Tipos.D6);
	private Dado d4 = new Dado(Tipos.D4);
	private Dado d8 = new Dado(Tipos.D8);
	private Dado d10 = new Dado(Tipos.D10);
	private Dado d12 = new Dado(Tipos.D12);
	private Dado d20 = new Dado(Tipos.D20);*/
	@FXML
	private void volverAlMenuDado() throws IOException {
		App.setRoot("menu");
	}
	
	@FXML
	private void salirDado() throws IOException {
		System.exit(0);
	}
	@FXML
	private void generarDado() throws IOException{
		Dado dado = new Dado(MenuController.getTipoDado());
		Alert dadoD = new Alert(AlertType.INFORMATION);
		dadoD.setTitle(dado.getTipo().getNombreCompleto());
		dadoD.setHeaderText(null);
		dadoD.setContentText("Se ha lanzado el " + dado.getTipo().getNombreCompleto() +"...\n" + dado.lanzarDado());
		dadoD.showAndWait();
		
	}
	
	
	
}

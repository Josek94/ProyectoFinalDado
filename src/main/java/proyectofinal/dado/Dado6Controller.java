package proyectofinal.dado;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import proyectofinal.clases.Dado;
import proyectofinal.clases.Tipos;

public class Dado6Controller {
	
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
		Dado d6 = new Dado(Tipos.D6);
		Alert dadoD6 = new Alert(AlertType.INFORMATION);
		dadoD6.setTitle(d6.getTipo().getNombreCompleto());
		dadoD6.setHeaderText(null);
		dadoD6.setContentText("Se ha lanzado el " + d6.getTipo().getNombreCompleto() +"...\n" + d6.lanzarDado());
		dadoD6.showAndWait();
		
	}
}

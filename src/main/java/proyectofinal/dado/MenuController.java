package proyectofinal.dado;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import proyectofinal.clases.Dado;

public class MenuController {
	
	@FXML
	private void generarD6() throws IOException{
		Dado d6 = new Dado();
		Alert dadoD6 = new Alert(AlertType.INFORMATION);
		dadoD6.setTitle(d6.getTipo().getNombreCompleto());
		dadoD6.setHeaderText(null);
		dadoD6.setContentText("Se ha lanzado el dado...\n" + d6.lanzarDado());
		dadoD6.showAndWait();
		
	}
	
	@FXML
	private void salir() throws IOException {
		System.exit(0);
	}
}

package proyectofinal.dado;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import proyectofinal.clases.Dado;
import proyectofinal.clases.Tipos;

public class DadoController {

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
		int lanzamiento = dado.lanzarDado();	
		ImageView img = new ImageView(dado.devuelveImagenDado(lanzamiento));
		
		/*Alert dadoD = new Alert(AlertType.INFORMATION);
		dadoD.setTitle(dado.getTipo().getNombreCompleto());
		dadoD.setHeaderText(null);
		dadoD.setContentText("Se ha lanzado el " + dado.getTipo().getNombreCompleto() +"...\n" + dado.lanzarDado());
		dadoD.showAndWait();*/
		
	}
	
	
	
}

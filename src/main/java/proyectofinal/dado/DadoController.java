package proyectofinal.dado;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import proyectofinal.clases.Dado;

public class DadoController {
	
	@FXML
	private ImageView dadoImagenView;

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
		dadoImagenView.setImage(dado.devuelveImagenDado(lanzamiento,dado.getTipo()));
		if(lanzamiento == 20) {
			Alert dadoD = new Alert(AlertType.INFORMATION);
			dadoD.setTitle("¡CRITICO!");
			dadoD.setHeaderText(null);
			dadoD.setContentText("¡Que suerte!¡Ha sido un critico!");
			dadoD.showAndWait();
		} else if(lanzamiento == 1) {
			Alert dadoD = new Alert(AlertType.WARNING);
			dadoD.setTitle("PIFIA..");
			dadoD.setHeaderText(null);
			dadoD.setContentText("ugh.. mala pata...");
			dadoD.showAndWait();
		}
		
		
	}
	
	
	
}

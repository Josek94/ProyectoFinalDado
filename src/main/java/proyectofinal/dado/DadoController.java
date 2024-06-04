package proyectofinal.dado;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import proyectofinal.clases.Dado;

public class DadoController {
	
	private Dado dado;
	
	@FXML
	private ImageView dadoImagenView;
	
	@FXML
	private Button botonGenerar;
	
	@FXML
	private Button botonLanzar;
	
	

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
		dado = new Dado(MenuController.getTipoDado());
		dadoImagenView.setImage(dado.devuelveImagenDado(1, dado.getTipo()));
		botonGenerar.setVisible(false);
		botonLanzar.setVisible(true);
	}
	
	@FXML
	private void lanzarDado() throws IOException{
		
		int lanzamiento = dado.lanzarDado();	
		dadoImagenView.setImage(dado.devuelveImagenDado(lanzamiento,dado.getTipo()));
		if(lanzamiento == 20) {
			Alert dadoD = new Alert(AlertType.INFORMATION);
			dadoD.setTitle("¡CRITICO!");
			dadoD.setHeaderText(null);
			dadoD.setContentText("¡Que suerte!¡Ha sido un critico!");
			dadoD.showAndWait();
		}
	}
	
	
	
}

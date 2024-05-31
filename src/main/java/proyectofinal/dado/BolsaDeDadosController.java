package proyectofinal.dado;

import java.awt.Image;
import java.io.IOException;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import proyectofinal.clases.Dado;
import proyectofinal.clases.Tipos;

public class BolsaDeDadosController {
	private List<Dado> dadosIncluidosEnLaBolsa;
	
	@FXML
	private ImageView dado1;
	
	@FXML
	private ImageView dado2;
	
	@FXML
	private ImageView dado3;
	
	@FXML
	private ImageView dado4;
	
	@FXML
	private ImageView dado5;
	
	@FXML
	private ImageView dado6;
	
	@FXML
	private void anadirDadoD4ALaBolsa() {
		Dado D4 = new Dado(Tipos.D4);
		dadosIncluidosEnLaBolsa.add(D4);
		D4.devuelveImagenDado(1, D4.getTipo());
		if(dado1.contains(null)) {
			
		}
	}
	
	@FXML
	private void anadirDadoD6ALaBolsa() {
		Dado D6 = new Dado(Tipos.D6);
		dadosIncluidosEnLaBolsa.add(D6);
		D6.devuelveImagenDado(1, D6.getTipo());
	}
	
	@FXML
	private void anadirDadoD8ALaBolsa() {
		Dado D8 = new Dado(Tipos.D8);
		dadosIncluidosEnLaBolsa.add(D8);
		D8.devuelveImagenDado(1, D8.getTipo());
	}
	
	@FXML
	private void anadirDadoD10ALaBolsa() {
		Dado D10 = new Dado(Tipos.D10);
		dadosIncluidosEnLaBolsa.add(D10);
		D10.devuelveImagenDado(1, D10.getTipo());
	}
	
	@FXML
	private void anadirDadoD12ALaBolsa() {
		Dado D12 = new Dado(Tipos.D12);
		dadosIncluidosEnLaBolsa.add(D12);
		D12.devuelveImagenDado(1, D12.getTipo());
	}
	
	@FXML
	private void anadirDadoD20ALaBolsa() {
		Dado D20 = new Dado(Tipos.D20);
		dadosIncluidosEnLaBolsa.add(D20);
		D20.devuelveImagenDado(1, D20.getTipo());
	}
	
	@FXML
	private void LanzarbolsaDeDados() {
		
		/*Alert bolsaDeDados = new Alert(AlertType.INFORMATION);
		bolsaDeDados.setTitle("Bolsa de dados");
		bolsaDeDados.setHeaderText(null);
		bolsaDeDados.setContentText("¡Que suerte!¡Ha sido un critico!");
		bolsaDeDados.showAndWait();*/
	}
	
	@FXML
	private void salir() throws IOException {
		System.exit(0);
	}
	
	@FXML
	private void volverAlMenu() throws IOException {
		App.setRoot("menu");
	}
}

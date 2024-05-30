package proyectofinal.dado;

import java.io.IOException;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import proyectofinal.clases.Dado;
import proyectofinal.clases.Tipos;

public class BolsaDeDadosController {
	private List<Dado> dadosIncluidosEnLaBolsa;
	
	
	@FXML
	private void anadirDadoD4ALaBolsa() {
		dadosIncluidosEnLaBolsa.add(new Dado(Tipos.D4));
	}
	
	@FXML
	private void anadirDadoD6ALaBolsa() {
		dadosIncluidosEnLaBolsa.add(new Dado(Tipos.D6));
	}
	
	@FXML
	private void anadirDadoD8ALaBolsa() {
		dadosIncluidosEnLaBolsa.add(new Dado(Tipos.D8));
	}
	
	@FXML
	private void anadirDadoD10ALaBolsa() {
		dadosIncluidosEnLaBolsa.add(new Dado(Tipos.D10));
	}
	
	@FXML
	private void anadirDadoD12ALaBolsa() {
		dadosIncluidosEnLaBolsa.add(new Dado(Tipos.D12));
	}
	
	@FXML
	private void anadirDadoD20ALaBolsa() {
		dadosIncluidosEnLaBolsa.add(new Dado(Tipos.D20));
	}
	
	@FXML
	private void LanzarbolsaDeDados() {
		dadosIncluidosEnLaBolsa.forEach(d -> d.lanzarDado());
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

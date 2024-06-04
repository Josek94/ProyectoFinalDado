package proyectofinal.dado;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import proyectofinal.clases.Dado;
import proyectofinal.clases.Tipos;

public class BolsaDeDadosController {
	private List<Dado> dadosIncluidosEnLaBolsa = new ArrayList<Dado>();
	
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
	private Label label;
	
	
	 private void establecerImagenEnProximaDisponible(Image dadoImagen) {
	        if (dado1.getImage() == null) {
	            dado1.setImage(dadoImagen);
	        } else if (dado2.getImage() == null) {
	            dado2.setImage(dadoImagen);
	        } else if (dado3.getImage() == null) {
	            dado3.setImage(dadoImagen);
	        } else if (dado4.getImage() == null) {
	            dado4.setImage(dadoImagen);
	        } else if (dado5.getImage() == null) {
	            dado5.setImage(dadoImagen);
	        } else if (dado6.getImage() == null) {
	            dado6.setImage(dadoImagen);
	        } else {
	            label.setText("Todos los espacios de dados \n están llenos.");
	        }
	 }
	
	
	@FXML
	private void anadirDadoD4ALaBolsa() {
		Dado D4 = new Dado(Tipos.D4);
		dadosIncluidosEnLaBolsa.add(D4);
		establecerImagenEnProximaDisponible(D4.devuelveImagenDado(1, D4.getTipo()));
		
	}
	
	@FXML
	private void anadirDadoD6ALaBolsa() {
		Dado D6 = new Dado(Tipos.D6);
		dadosIncluidosEnLaBolsa.add(D6);
		establecerImagenEnProximaDisponible(D6.devuelveImagenDado(1, D6.getTipo()));
		
	}
	
	@FXML
	private void anadirDadoD8ALaBolsa() {
		Dado D8 = new Dado(Tipos.D8);
		dadosIncluidosEnLaBolsa.add(D8);
		establecerImagenEnProximaDisponible(D8.devuelveImagenDado(1, D8.getTipo()));
		
	}
	
	@FXML
	private void anadirDadoD10ALaBolsa() {
		Dado D10 = new Dado(Tipos.D10);
		dadosIncluidosEnLaBolsa.add(D10);
		establecerImagenEnProximaDisponible(D10.devuelveImagenDado(1, D10.getTipo()));
		
	}
	
	@FXML
	private void anadirDadoD12ALaBolsa() {
		Dado D12 = new Dado(Tipos.D12);
		dadosIncluidosEnLaBolsa.add(D12);
		establecerImagenEnProximaDisponible(D12.devuelveImagenDado(1, D12.getTipo()));
		
	}
	
	@FXML
	private void anadirDadoD20ALaBolsa() {
		Dado D20 = new Dado(Tipos.D20);
		dadosIncluidosEnLaBolsa.add(D20);
		establecerImagenEnProximaDisponible(D20.devuelveImagenDado(1, D20.getTipo()));
		
	}
	
	@FXML
	private void LanzarbolsaDeDados() {
		if(dadosIncluidosEnLaBolsa.isEmpty()) {
			label.setText("La bolsa esta vacia, introduce algun dado");
		}
	    List<Integer> resultados = new ArrayList<>();
	    for (Dado dado : dadosIncluidosEnLaBolsa) {
	        resultados.add(dado.lanzarDado());
	    }
	    actualizarImagenes(resultados);
	}
	
	private void actualizarImagenes(List<Integer> resultados) {
	    dado1.setImage(null);
	    dado2.setImage(null);
	    dado3.setImage(null);
	    dado4.setImage(null);
	    dado5.setImage(null);
	    dado6.setImage(null);
	    
	    for (int i = 0; i < resultados.size() && i < 6; i++) {
	        Image dadoImagen = dadosIncluidosEnLaBolsa.get(i).devuelveImagenDado(resultados.get(i), dadosIncluidosEnLaBolsa.get(i).getTipo());
	        switch (i) {
	            case 0:
	                dado1.setImage(dadoImagen);
	                break;
	            case 1:
	                dado2.setImage(dadoImagen);
	                break;
	            case 2:
	                dado3.setImage(dadoImagen);
	                break;
	            case 3:
	                dado4.setImage(dadoImagen);
	                break;
	            case 4:
	                dado5.setImage(dadoImagen);
	                break;
	            case 5:
	                dado6.setImage(dadoImagen);
	                break;
	        }
	    }
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

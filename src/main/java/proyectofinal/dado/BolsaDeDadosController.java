package proyectofinal.dado;





import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
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
	private final Random random = new Random();
	
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
	private void anadirDadoD4ALaBolsa()throws IOException {
		Dado D4 = new Dado(Tipos.D4);
		dadosIncluidosEnLaBolsa.add(D4);
		establecerImagenEnProximaDisponible(D4.devuelveImagenDado(1, D4.getTipo()));
		
	}
	
	@FXML
	private void anadirDadoD6ALaBolsa()throws IOException {
		Dado D6 = new Dado(Tipos.D6);
		dadosIncluidosEnLaBolsa.add(D6);
		establecerImagenEnProximaDisponible(D6.devuelveImagenDado(1, D6.getTipo()));
		
	}
	
	@FXML
	private void anadirDadoD8ALaBolsa()throws IOException {
		Dado D8 = new Dado(Tipos.D8);
		dadosIncluidosEnLaBolsa.add(D8);
		establecerImagenEnProximaDisponible(D8.devuelveImagenDado(1, D8.getTipo()));
		
	}
	
	@FXML
	private void anadirDadoD10ALaBolsa()throws IOException {
		Dado D10 = new Dado(Tipos.D10);
		dadosIncluidosEnLaBolsa.add(D10);
		establecerImagenEnProximaDisponible(D10.devuelveImagenDado(1, D10.getTipo()));
		
	}
	
	@FXML
	private void anadirDadoD12ALaBolsa()throws IOException {
		Dado D12 = new Dado(Tipos.D12);
		dadosIncluidosEnLaBolsa.add(D12);
		establecerImagenEnProximaDisponible(D12.devuelveImagenDado(1, D12.getTipo()));
		
	}
	
	@FXML
	private void anadirDadoD20ALaBolsa()throws IOException {
		Dado D20 = new Dado(Tipos.D20);
		dadosIncluidosEnLaBolsa.add(D20);
		establecerImagenEnProximaDisponible(D20.devuelveImagenDado(1, D20.getTipo()));
		
	}
	
    @FXML
    private void lanzarBolsaDeDados() throws IOException {
        if (dadosIncluidosEnLaBolsa.isEmpty()) {
            label.setText("La bolsa esta vacia, introduce algun dado");
            return;
        }

        List<ImageView> imageViews = new ArrayList<>();
        imageViews.add(dado1);
        imageViews.add(dado2);
        imageViews.add(dado3);
        imageViews.add(dado4);
        imageViews.add(dado5);
        imageViews.add(dado6);

        for (int i = 0; i < dadosIncluidosEnLaBolsa.size(); i++) {
            Dado dado = dadosIncluidosEnLaBolsa.get(i);
            ImageView imageView = imageViews.get(i);
            animacionTirada(dado, imageView);
        }
    }

    private void animacionTirada(Dado dado, ImageView imageView) {
        Timeline timeline = new Timeline();
        int numFrames = 20;
        for (int i = 0; i < numFrames; i++) {
            int lanzamientoAleatorio = random.nextInt(dado.getTipo().getNumMax()) + dado.getTipo().getNumMin();
            KeyFrame keyFrame = new KeyFrame(
                Duration.millis(i * 50),
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        imageView.setImage(dado.devuelveImagenDado(lanzamientoAleatorio, dado.getTipo()));
                        imageView.setRotate(imageView.getRotate() + 18);
                        imageView.setTranslateX(random.nextInt(10) - 5);
                        imageView.setTranslateY(random.nextInt(10) - 5);
                    }
                }
            );
            timeline.getKeyFrames().add(keyFrame);
        }

        timeline.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mostrarResultadoFinal(dado, imageView);
            }
        });

        timeline.play();
    }

    private void mostrarResultadoFinal(Dado dado, ImageView imageView) {
        int lanzamiento = dado.lanzarDado();
        imageView.setImage(dado.devuelveImagenDado(lanzamiento, dado.getTipo()));
        imageView.setRotate(0);
        imageView.setTranslateX(0);
        imageView.setTranslateY(0);

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

package proyectofinal.dado;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.io.IOException;

import java.util.Random;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import proyectofinal.clases.Dado;

public class DadoController {
	
	private Dado dado;
	private final Random random = new Random();
	
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
	private void lanzarDado() throws IOException {
        Timeline timeline = new Timeline();
        int numFrames = 20;
        for (int i = 0; i < numFrames; i++) {
            int lanzamientoAleatorio = random.nextInt(dado.getTipo().getNumMax()) + dado.getTipo().getNumMin();
            KeyFrame keyFrame = new KeyFrame(
                Duration.millis(i * 50),
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        dadoImagenView.setImage(dado.devuelveImagenDado(lanzamientoAleatorio, dado.getTipo()));
                        dadoImagenView.setRotate(dadoImagenView.getRotate() + 18);
                        dadoImagenView.setTranslateX(random.nextInt(10) - 5);
                        dadoImagenView.setTranslateY(random.nextInt(10) - 5); 
                    }
                }
            );
            timeline.getKeyFrames().add(keyFrame);
        }

        // Al finalizar la animación, mostrar el resultado del dado
        timeline.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	try {
					resultadoLanzarDado();
				} catch (IOException e) {
					e.printStackTrace();
				}
            }
        });

        // Iniciar la animación
        timeline.play();
    }
	
	
	private void resultadoLanzarDado() throws IOException{
		int lanzamiento = dado.lanzarDado();	
		dadoImagenView.setImage(dado.devuelveImagenDado(lanzamiento,dado.getTipo()));
	}
	
	
	
}

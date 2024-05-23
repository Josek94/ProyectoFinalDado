package proyectofinal.clases;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javafx.scene.image.Image;

public class Dado {

	private Colores color;
	private Tipos tipo;
	private int contadorDeTiradas;
	private Map<Integer, Integer> cantidadDeLanzamientosAlamacenados;

	public Dado(Colores color, Tipos tipo) {
		this.color = color;
		this.tipo = tipo;
		contadorDeTiradas = 0;
		cantidadDeLanzamientosAlamacenados = new HashMap<>();
		/*for (int i = 0; i < tipo.getNumMax(); i++) {
			if (!(tipo.getNumMax() == 10)) {
				cantidadDeLanzamientosAlamacenados.put(i + 1, 0);
			} else {
				cantidadDeLanzamientosAlamacenados.put(i, 0);
			}
		}*/
	}

	public Dado() {
		this(Colores.BL, Tipos.D6);
	}

	public Dado(Tipos tipo) {
		this(Colores.BL, tipo);
	}

	public int lanzarDado() {
		Random random = new Random();
		int lanzamiento = random.nextInt(tipo.getNumMax()) + tipo.getNumMin();
		contadorDeTiradas++;
		//cantidadDeLanzamientosAlamacenados.put(lanzamiento, cantidadDeLanzamientosAlamacenados.get(lanzamiento)+1);
		cantidadDeLanzamientosAlamacenados.compute(lanzamiento, (Integer key, Integer value) -> (value == null)? 1 : value+1);
		return lanzamiento;
	}
	
	public Image devuelveImagenDado(int lanzamiento) {
		
		if(this.tipo == Tipos.D6) {
			switch(lanzamiento) {
			case 1:
				return new Image("/img/dados1");
			
			case 2:
				return new Image("/img/dados2");
		
			case 3:
				return new Image("/img/dados3");
			
			case 4:
				return new Image("/img/dados4");
				
			case 5:
				return new Image("/img/dados5");
				
			case 6:
				return new Image("/img/dados6");
				
			default:
				return new Image("/img/dados6");
			}
		}
		else {
			return null;
		}
	}

	@Override
	public String toString() {
		return "Dado [color=" + color.getNombreCompleto() + ", tipo=" + tipo + "]";
	}

	public Colores getColor() {
		return color;
	}

	public Tipos getTipo() {
		return tipo;
	}

	public int getContadorDeTiradas() {
		return contadorDeTiradas;
	}

}

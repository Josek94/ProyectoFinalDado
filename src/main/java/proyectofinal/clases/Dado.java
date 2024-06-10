package proyectofinal.clases;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javafx.scene.image.Image;
import proyectofinal.dado.MenuController;

public class Dado {
	
	private Tipos tipo;
	private int contadorDeTiradas = 0;
	private Map<Integer, Integer> cantidadDeLanzamientosAlamacenados;

	public Dado(Tipos tipo) {
		this.tipo = tipo;
		contadorDeTiradas = 0;
		cantidadDeLanzamientosAlamacenados = new HashMap<>();
		MenuController.getDadosTotales().add(this);
		for (int i = 0; i < tipo.getNumMax(); i++) {
			if ((tipo == Tipos.D10)) {
				cantidadDeLanzamientosAlamacenados.put(i + 1, 0);
			} else {
				cantidadDeLanzamientosAlamacenados.put(i, 0);
			}
		}
	}

	public Dado() {
		this(Tipos.D6);
	}

	public int lanzarDado() {
		Random random = new Random();
		int lanzamiento;
		if(this.tipo == Tipos.D10) {
		lanzamiento = random.nextInt(tipo.getNumMax()+1) + tipo.getNumMin();
		} else {
		lanzamiento = random.nextInt(tipo.getNumMax()) + tipo.getNumMin();
		}
		contadorDeTiradas++;
		//cantidadDeLanzamientosAlamacenados.put(lanzamiento, cantidadDeLanzamientosAlamacenados.get(lanzamiento)+1);
		cantidadDeLanzamientosAlamacenados.compute(lanzamiento, (Integer key, Integer value) -> (value == null)? 1 : value+1);
		
		return lanzamiento;
	}
	
	public Image devuelveImagenDado(int lanzamiento, Tipos tipo) {
			
			return new Image(getClass().getResource("/proyectofinal/img/dados"+ lanzamiento + tipo.getNombreSimple() +".png").toExternalForm());
		
	}
	
	

	@Override
	public String toString() {
		return "Dado [tipo=" + tipo + "]";
	}

	

	public Tipos getTipo() {
		return tipo;
	}

	public int getContadorDeTiradas() {
		return contadorDeTiradas;
	}

	public Map<Integer, Integer> getCantidadDeLanzamientosAlamacenados() {
		return cantidadDeLanzamientosAlamacenados;
	}
	
}

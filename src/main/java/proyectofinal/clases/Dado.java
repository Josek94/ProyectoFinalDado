package proyectofinal.clases;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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

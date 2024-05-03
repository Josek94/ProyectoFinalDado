package proyectofinal.clases;

import java.util.Random;

public class Dado {
	
	private Colores color;
	private Tipos tipo;
	private static int contadorDeTiradas = 0;
	
	public Dado(Colores color, Tipos tipo) {
		this.color = color;
		this.tipo = tipo;
	}

	public Dado() {
		this(Colores.BL,Tipos.D6);
	}
	
	public Dado(Tipos tipo) {
		this(Colores.BL,tipo);
	}
	
	public int lanzarDado() {
		Random random = new Random();
		int lanzamiento = random.nextInt(tipo.getNumMax())+ tipo.getNumMin();
		contadorDeTiradas++;
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

	
	
	
	
	
}

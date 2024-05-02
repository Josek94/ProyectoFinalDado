package proyectofinal.clases;

public enum Tipos {
	D6("Dado de 6 caras",6,1),
	D4("Dado de 4 caras",4,1),
	D8("Dado de 8 caras",8,1),
	D10("Dado de 10 caras",9,0),
	D12("Dado de 12 caras",12,1),
	D20("Dado de 20 caras",20,1);
	
	
	private String nombreCompleto;
	private int numMax;
	private int numMin;
	
	
	private Tipos(String nombreCompleto, int numMax, int numMin) {
		this.nombreCompleto = nombreCompleto;
		this.numMax = numMax;
		this.numMin = numMin;
	}


	public String getNombreCompleto() {
		return nombreCompleto;
	}


	public int getNumMax() {
		return numMax;
	}


	public int getNumMin() {
		return numMin;
	}
	
	
	@Override
	public String toString() {
		return "Tipo [nombre=" + nombreCompleto  + ", resultado maximo: " + numMax + ", resultado minimo: " + numMin + "]";
	}
	
}

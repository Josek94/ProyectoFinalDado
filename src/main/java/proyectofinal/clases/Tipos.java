package proyectofinal.clases;

public enum Tipos {
	D6("Dado de 6 caras",6,1,"D6"),
	D4("Dado de 4 caras",4,1,"D4"),
	D8("Dado de 8 caras",8,1,"D8"),
	D10("Dado de 10 caras",9,0,"D10"),
	D12("Dado de 12 caras",12,1,"D12"),
	D20("Dado de 20 caras",20,1,"D20");
	
	
	private String nombreCompleto;
	private int numMax;
	private int numMin;
	private String nombreSimple;
	
	
	private Tipos(String nombreCompleto, int numMax, int numMin,String nombreSimple) {
		this.nombreCompleto = nombreCompleto;
		this.numMax = numMax;
		this.numMin = numMin;
		this.nombreSimple = nombreSimple;
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
	
	
	
	public String getNombreSimple() {
		return nombreSimple;
	}


	public void setNombreSimple(String nombreSimple) {
		this.nombreSimple = nombreSimple;
	}


	@Override
	public String toString() {
		return "Tipo [nombre=" + nombreCompleto  + ", resultado maximo: " + numMax + ", resultado minimo: " + numMin + "]";
	}
	
}

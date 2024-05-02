package proyectofinal.clases;

public enum Colores {
	RO("Rojo"),AZ("Azul"),BL("Blanco"),NE("Negro");
	
	private String nombreCompleto;

	private Colores(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}
	
	
	
}

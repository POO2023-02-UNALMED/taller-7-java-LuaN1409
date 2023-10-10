package comunicacion;

public class Fabula extends Escrito {

	private String ensenanza;
	private String interpretacion;
	
public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
	super(origen, titulo, autor, paginas);
	this.ensenanza = ensenanza;
	this.interpretacion = interpretacion;
}

public String getEnsenanza() {
	return ensenanza;
}

public void setEnsenanza(String ensenanza) {
	this.ensenanza = ensenanza;
}

public String getInterpretacion() {
	return interpretacion;
}

public void setInterpretacion(String interpretacion) {
	this.interpretacion = interpretacion;
}

public int palabrasTotales(int palabrasTotales) {
	
	int total = super.getPaginas() * palabrasTotales * 1;
	return total;
}

public String interpretacion() {
	return interpretacion;
}

public String toString() {
	
	String valores = super.getOrigen() + "\n";
	valores += super.getTitulo() + "\n";
	valores += super.getAutor() + "\n";
	valores += super.getPaginas() + "\n";
	valores += this.getEnsenanza();
	return valores;
}

}

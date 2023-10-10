package comunicacion;

public class Periodico extends Escrito{

	private String fecha;
	private String primicia;
	private String interpretacion;
	
public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
	super(origen, titulo, autor, paginas);
	this.fecha = fecha;
	this.primicia = primicia;
	this.interpretacion = interpretacion;
}

public String getFecha() {
	return fecha;
}

public void setFecha(String fecha) {
	this.fecha = fecha;
}

public String getPrimicia() {
	return primicia;
}

public void setPrimicia(String primicia) {
	this.primicia = primicia;
}

public String getInterpretacion() {
	return interpretacion;
}

public void setInterpretacion(String interpretacion) {
	this.interpretacion = interpretacion;
}

public int palabrasTotales(int palabrasTotales) {
	
	int total = super.getPaginas() * palabrasTotales * 10;
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
	valores += this.getFecha() + "\n";
	valores += this.getPrimicia();
	return valores;
}
}
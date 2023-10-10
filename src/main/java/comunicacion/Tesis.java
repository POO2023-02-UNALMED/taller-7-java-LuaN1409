package comunicacion;

public class Tesis extends Escrito{

	private String idea;
	private static String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
	super(origen, titulo, autor, paginas);
	this.idea = idea;
	Tesis.argumentos = argumentos;
	this.conclusion = conclusion;
	this.referencias = referencias;
	this.interpretacion = interpretacion;
}

public String getIdea() {
	return idea;
}

public void setIdea(String idea) {
	this.idea = idea;
}

public String[] getArgumentos() {
	return argumentos;
}

public void setArgumentos(String[] argumentos) {
	Tesis.argumentos = argumentos;
}

public String getConclusion() {
	return conclusion;
}

public void setConclusion(String conclusion) {
	this.conclusion = conclusion;
}

public String getReferencias() {
	return referencias;
}

public void setReferencias(String referencias) {
	this.referencias = referencias;
}

public String getInterpretacion() {
	return interpretacion;
}

public void setInterpretacion(String interpretacion) {
	this.interpretacion = interpretacion;
}

public int palabrasTotales(int palabrasTotales) {
	
	int total = super.getPaginas() * palabrasTotales * 5;
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
	valores += this.getIdea() + "\n";
	valores += Tesis.argumentos.length + "\n";
	valores += this.getConclusion() + "\n";
	valores += this.getReferencias();
	return valores;
}

}

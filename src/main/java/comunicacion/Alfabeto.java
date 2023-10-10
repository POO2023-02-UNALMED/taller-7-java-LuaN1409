package comunicacion;

public class Alfabeto extends Pictograma{

	private static String[] letras;
	private String interpretacion;
	
	
public Alfabeto(String origen, String[] letras, String interpretacion) {
	super(origen);
	this.interpretacion = interpretacion;
	Alfabeto.letras = letras;
}

public String[] getLetras() {
	return letras;
}

public void setLetras(String[] letras) {
	Alfabeto.letras = letras;
}

public String getInterpretacion() {
	return interpretacion;
}

public void setInterpretacion(String interpretacion) {
	this.interpretacion = interpretacion;
}

public int cantidadLetras() {
	return Alfabeto.letras.length;
}

public String interpretacion() {
	return interpretacion;
}

public String toString() {
	String alfabeto = "";
	for (int i = 0; i < Alfabeto.letras.length; i++) {
		if (i < Alfabeto.letras.length - 1) {
		alfabeto += Alfabeto.letras[i] + ", ";
	}
	else {
		alfabeto += Alfabeto.letras[i] + ", ";
	}
}
	return alfabeto;
	}
}
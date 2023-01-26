package stream2;

import java.util.ArrayList;
import java.util.List;

public class StreamssApp {
	private List<String> lista;
	private List<String> numeros;
	
	public StreamssApp() {
		lista = new ArrayList<>();
		lista.add("Mito");
		lista.add("Code");
		lista.add("Jaime");
		lista.add("Mitode");
		
		numeros = new ArrayList<>();
		numeros.add("1");
		numeros.add("2");
		
	}
	public void filtrar() {
		lista.stream().filter(x ->x.startsWith("M")).forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		StreamssApp app = new StreamssApp();
		app.filtrar();
		
	}
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SistemaCanchas {
private ArrayList<Socio> socios;

public SistemaCanchas() {
	this.socios = new ArrayList<>();
}

public void agregarSocio(Socio s) {
	this.socios.add(s);
}

public void buscar(Filtro f, Comparator<Socio> c){
	ArrayList<Socio> resultados = new ArrayList<>();
	for(Socio s : this.socios) {
		if(f.cumple(s)) {
			resultados.add(s.getCopia());
		}
	}
	Collections.sort(resultados, c);
	for(Socio s : resultados) {
		System.out.println(s.getNombre());
		System.out.println(s.getEdad());
	}
}
}

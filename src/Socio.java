import java.util.ArrayList;

public class Socio {
private String nombre;
private String apellido;
private boolean cuotaPaga;
private int edad;
private ArrayList<Alquiler> alquileres;

public Socio(String n, String a, int e) {
	setNombre(n);
	setApellido(a);
	setEdad(e);
	this.alquileres = new ArrayList<>();
}


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public boolean isCuotaPaga() {
	return cuotaPaga;
}
public void setCuotaPaga(boolean cuotaPaga) {
	this.cuotaPaga = cuotaPaga;
}
public ArrayList<Alquiler> getAlquileres() {	
	return alquileres;
}


public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}

public int getCanchaMasCara() {
	int var = 0;
	for(Alquiler a : this.alquileres) {
		if(a.getDinero() > var) {
			var = a.getDinero();
		}
	}
	return var;
}

public void alquilarCancha(Alquiler a) {
	this.alquileres.add(a);
}

public Socio getCopia() {
	Socio resultado = new Socio(this.getNombre(), this.getApellido(), this.getEdad());
	for(Alquiler a : this.alquileres) {
		resultado.alquilarCancha(a);
	}
	return resultado;
}



}

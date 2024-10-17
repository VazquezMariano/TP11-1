import java.time.LocalDate;

public class Alquiler {
private LocalDate fecha;
private int id;
private int dinero;

public Alquiler(int y, int m, int d, int dinero, int id) {
	setFecha(LocalDate.of(d, m, y));
	setId(id);
	setDinero(dinero);
}





public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getDinero() {
	return dinero;
}
public void setDinero(int dinero) {
	this.dinero = dinero;
}

public boolean equals(Object o) {
	try {
		Alquiler alq = (Alquiler)o;
		return alq.getId() == this.getId();
		
	} catch (Exception e) {
		return false;
	}
}


}

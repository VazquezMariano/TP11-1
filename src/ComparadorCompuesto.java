import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Socio> {
	Comparator<Socio> c1;
	Comparator<Socio> c2;
	
	public ComparadorCompuesto(Comparator<Socio> com1, Comparator<Socio> com2) {
		this.c1 = com1;
		this.c2 = com2;
	}

	@Override
	public int compare(Socio o1, Socio o2) {
		int respuesta = c1.compare(o1, o2);
		if(respuesta == 0) {
			return c2.compare(o1, o2);
		}
		return respuesta;
	}

}

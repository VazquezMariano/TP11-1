
public class FiltroMenoresEdad extends Filtro {
	private final int edad = 18;

	@Override
	public boolean cumple(Socio s) {
		// TODO Auto-generated method stub
		return s.getEdad() < edad;
	}

}

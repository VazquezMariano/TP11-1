
public class FiltroCanchaEspecifica extends Filtro {
	private Alquiler cancha;
	
	public FiltroCanchaEspecifica(Alquiler a) {
		this.cancha = a;
	}

	@Override
	public boolean cumple(Socio s) {
		return s.getAlquileres().contains(cancha);
	}

}

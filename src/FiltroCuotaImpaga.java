
public class FiltroCuotaImpaga extends Filtro {

	@Override
	public boolean cumple(Socio s) {
		return s.isCuotaPaga();
	}

}

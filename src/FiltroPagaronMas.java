
public class FiltroPagaronMas extends Filtro {
private final int var = 500;

public boolean cumple(Socio s) {
	return s.getCanchaMasCara() > var;
}
}

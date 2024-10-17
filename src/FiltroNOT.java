
public class FiltroNOT extends Filtro {
private Filtro f1;

public FiltroNOT(Filtro ff1) {
	this.f1 = ff1;
}

@Override
public boolean cumple(Socio s) {
	return !(f1.cumple(s));
}


}

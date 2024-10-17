
public class FiltroOR extends Filtro {
private Filtro f1;
private Filtro f2;

public FiltroOR(Filtro ff1, Filtro ff2) {
	this.f1 = ff1;
	this.f2 = ff2;
}

@Override
public boolean cumple(Socio s) {
	return f1.cumple(s) || f2.cumple(s);
}


}
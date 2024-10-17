
public class prueba111 {

	public static void main(String[] args) {
		Socio s1 = new Socio("Andres", "guga", 10);
		Socio s2 = new Socio("Blas", "guga", 12);
		Socio s3 = new Socio("Cuco", "guga", 40);
		
		Filtro f1 = new FiltroMenoresEdad();
		
		SistemaCanchas sistem = new SistemaCanchas();
		sistem.agregarSocio(s1);
		sistem.agregarSocio(s2);
		sistem.agregarSocio(s3);
		
		sistem.buscar(f1, new ComparadorEdad());
		

	}

}

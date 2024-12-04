package principal;

public interface GestorClientes {
	Cliente agregar(String nombre,String email,String clave);
	boolean eliminar(String email);
	Cliente autenticar(String email,String clave);
	

	

}

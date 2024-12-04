package principal;

import java.util.ArrayList;
import java.util.List;

public class SistemaClientes implements GestorClientes{
	
	private static SistemaClientes sistemas=null;
	private List<Cliente> clientes;
	 
	
	private SistemaClientes() {
		clientes=new ArrayList<Cliente>();	
	}
	
	public static SistemaClientes obtenerSistema() {
		if(sistemas==null) {
			sistemas=new SistemaClientes();	
		}
		return sistemas;
	}
	
	@Override
	public Cliente agregar(String nombre, String email, String clave) {
		Cliente nuevoCliente=new Cliente(nombre, email, clave);
		clientes.add(nuevoCliente);
		
		return nuevoCliente;
		
	}

	@Override
	public boolean eliminar(String email) {
	    for (Cliente cliente : clientes) {
	        if (cliente.getEmail().equals(email)) {
	            clientes.remove(cliente);
	            return true;
	        }
	    }
	    return false;
	}

	@Override
	public Cliente autenticar(String email, String clave) {
		for(Cliente cliente:clientes) {
			if(cliente.iniciarSesion(email, clave)) {
				return cliente;
			}
		}
		return null;
		
	}
	
	
	
	

}

package principal;

public class Cliente {
	
	private String nombre;
	private String email;
	private String clave;
	
	
	public Cliente(String nombre, String email, String clave) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.clave = clave;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	
	public Cliente registrar(String nombre, String email, String clave) {
		return new Cliente(nombre,email,clave);
		
	}
	
	public boolean iniciarSesion(String email, String clave) {
		
		if(this.email.equals(email) && this.clave.equals(clave)){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
	

}

package conection.modelos;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class User {
	private Integer id;
	private String nombre;
	private String password;
	
	
	
	public User(String nombre, String password) {
		this.nombre = nombre;
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	




	
}

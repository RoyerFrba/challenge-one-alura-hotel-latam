package conection.modelos;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class Huesped {
	private Integer id;
	private String nombre;
	private String apellido;
	private Date fechadeNacimiento;
	private String nacionalidad;
	private String telefono;
	private Integer idReserva;
	private List<Reserva> reserva=new ArrayList<Reserva>();

	
	
	

	public Integer getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}

	public Huesped(String nombre, String apellido, Date fechadeNacimiento, String nacionalidad, String telefono,
			Integer idReserva) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechadeNacimiento = fechadeNacimiento;
		this.nacionalidad = nacionalidad;
		this.telefono = telefono;
		this.idReserva = idReserva;
	}

	public void addReserva(Reserva reserva) {
		this.reserva.add(reserva);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechadeNacimiento() {
		return fechadeNacimiento;
	}

	public void setFechadeNacimiento(Date fechadeNacimiento) {
		this.fechadeNacimiento = fechadeNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Reserva> getReserva() {
		return reserva;
	}

	@Override
	public String toString() {
		return "Huesped [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechadeNacimiento="
				+ fechadeNacimiento + ", nacionalidad=" + nacionalidad + ", telefono=" + telefono + ", reserva="
				+ reserva + "]";
	}
	
}

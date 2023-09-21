package conection.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conection.modelos.Huesped;

public class HuespedDao {
	
	private Connection con;
	
	public  HuespedDao(Connection con) 
	{
		this.con=con;
	}

	public void guardar(Huesped huesped) {
		// TODO Auto-generated method stub
		try{
	    	String into="INSERT INTO huespedes(nombre,apellido,fechaDeNacimiento,nacionalidad,telefono,idReserva)"+"VALUE(?,?,?,?,?,?)";

	    	final PreparedStatement st =con.prepareStatement(into,Statement.RETURN_GENERATED_KEYS);
		    
	    	try (st){
			        	ejecutarRegistro(huesped, st);
			}
    	} catch (SQLException e) {
				throw new RuntimeException();
			}
		
	}
	private void ejecutarRegistro(Huesped huesped, PreparedStatement st) throws SQLException {
		st.setString(1, huesped.getNombre());
		st.setString(2,huesped.getApellido());
		st.setDate(3, huesped.getFechadeNacimiento());
		st.setString(4, huesped.getNacionalidad());
		st.setString(5, huesped.getTelefono());
		st.setInt(6, huesped.getIdReserva());

    	
    	st.executeUpdate();
    	final ResultSet resultSet = st.getGeneratedKeys();
    	try(resultSet){
	    	while(resultSet.next()) 
	    	{	
	    		huesped.setId( resultSet.getInt(1));
	    		System.out.println(String.format("Fue insertado el producto de %s",huesped));
	    	}
	    }
	
	
	
	}
}

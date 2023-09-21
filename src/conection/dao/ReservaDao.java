package conection.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conection.modelos.Huesped;
import conection.modelos.Reserva;


public class ReservaDao {

	private Connection con;
	
	public  ReservaDao(Connection con) 
	{
		this.con=con;
	}

	public void reservar(Reserva reserva) {

			try{
		    	String into="INSERT INTO reservas (fechaEntrada,fechaSalida,valor,formaDePago)"+"VALUES(?,?,?,?)";

		    	final PreparedStatement st =con.prepareStatement(into,Statement.RETURN_GENERATED_KEYS);
			    
		    	
		    		st.setDate(1, reserva.getFechaEntrada());
		    		st.setDate(2, reserva.getFechaSalida());
		    		st.setDouble(3, reserva.getValor());
		    		st.setString(4, reserva.getFormaDePago());
		    		st.executeUpdate();
		    		
		    		
				
	    	} catch (SQLException e) {
					throw new RuntimeException();
				}
			
		
	}


	
	
}

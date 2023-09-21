package conection.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

	public List<Reserva> listar() {

		List<Reserva>res=new ArrayList<>();
		try {

					final PreparedStatement st = con.prepareStatement("SELECT * FROM reservas");
					try(st){
						st.execute();
						final ResultSet resulSet=st.getResultSet();
						try(resulSet){

							while(resulSet.next()) 
							{
								Reserva reserva=new Reserva(resulSet.getLong(1), resulSet.getDate(2),resulSet.getDate(3),resulSet.getDouble(4),resulSet.getString(5));
								
								res.add(reserva);
							}
								return res;
						}
					}
				
			} catch (SQLException e) {
				throw new RuntimeException();
		}
	}
	
	
}

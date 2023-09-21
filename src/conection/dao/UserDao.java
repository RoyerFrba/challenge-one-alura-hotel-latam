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
import conection.modelos.User;

public class UserDao {
	
	private Connection con;
	
	public  UserDao(Connection con) 
	{
		this.con=con;
	}

	public User login(User user) {

		try {

					final PreparedStatement st = con.prepareStatement("SELECT * FROM user WHERE user=? and password=?");
					try(st){
						st.setString(1, user.getNombre());
						st.setString(2, user.getPassword());

						st.execute();
						final ResultSet resulSet=st.getResultSet();
						try(resulSet){

							while(resulSet.next()) 
							{
								return new User(resulSet.getString("user"), resulSet.getString("password"));
							}

						}
					}
				
			} catch (SQLException e) {
				throw new RuntimeException();
		}
		return null;
	}


}

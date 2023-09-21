package conection.controller;

import java.util.List;

import conection.dao.HuespedDao;
import conection.dao.ReservaDao;
import conection.factory.ConnectionFactory;
import conection.modelos.Reserva;

public class ReservaController {
	
	ReservaDao reservaDao;
	public ReservaController() {	
		this.reservaDao=new ReservaDao(new ConnectionFactory().conectar());
	}
	
	public Integer reservar(Reserva reserva) {
		reservaDao.reservar(reserva);
		return 0;
	}
	public List<Reserva> listar() 
	{
		return reservaDao.listar();
	}

}

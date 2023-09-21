package conection.controller;

import java.util.List;

import conection.dao.HuespedDao;
import conection.factory.ConnectionFactory;
import conection.modelos.Huesped;

public class HuespedController {

	HuespedDao huespedDao;
	public HuespedController() {	
		this.huespedDao=new HuespedDao(new ConnectionFactory().conectar());
	}
	
	public void guardar(Huesped huesped) {
		huespedDao.guardar(huesped);
		
	}

	public List<Huesped> listar() {
		return huespedDao.listar();
	}

}

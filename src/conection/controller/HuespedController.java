package conection.controller;

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

}

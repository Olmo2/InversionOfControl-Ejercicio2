package com.olmo.ioC.Repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.olmo.ioC.Servicio.Iva;


@Repository
@Qualifier("Espana")
public class Espana implements Iva{

	@Override
	public double getIva() {
		// TODO Auto-generated method stub
		return 0.21;
	}

}

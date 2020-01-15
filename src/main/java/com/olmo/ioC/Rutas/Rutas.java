package com.olmo.ioC.Rutas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.olmo.ioC.Servicio.Iva;

@Controller
public class Rutas {

	@Autowired
	@Qualifier("francia")
	Iva francia;
	
	@Autowired
	@Qualifier("espana")
	Iva espana;
	
	
	@GetMapping("/precio/francia/{cantidad}")
	@ResponseBody
	public String rutaGabachos(@PathVariable double cantidad) {
		
		cantidad +=cantidad * francia.getIva();
		
		return "El precio final es: " + cantidad;
	}
	
	@GetMapping("/precio/espana/{cantidad}")
	@ResponseBody
	public String rutaEspanolitos(@PathVariable double cantidad) {
		
		cantidad +=cantidad * espana.getIva();
		
		return "El precio final es: " + cantidad;
	}
	
	
}

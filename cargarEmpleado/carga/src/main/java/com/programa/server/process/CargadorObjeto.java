package com.programa.server.process;

import java.util.ArrayList;
import java.util.List;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.programa.server.Dto.Empleado;


public class CargadorObjeto implements Processor {

	public void process(Exchange exchange) throws Exception {
	
		List<Object> informacion= exchange.getIn().getBody(ArrayList.class);
		Empleado empleado=new Empleado();
		empleado.setNombre((String) informacion.get(0));
		empleado.setApellidos((String) informacion.get(1));
		empleado.setTipoDocumento((String) informacion.get(2));
		empleado.setNumeroDocumento((String) informacion.get(3));
		empleado.setFechaNacimiento((String) informacion.get(4));
		empleado.setFechaVinculacionEmpresa((String) informacion.get(5));
		empleado.setCargo((String) informacion.get(6));
		empleado.setSalario( (Double) informacion.get(7));
		exchange.getOut().setBody(empleado);

	}

}
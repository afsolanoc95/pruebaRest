 package com.programa.server.process;


import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.programa.server.Dto.Empleado;


public class calculo implements Processor {

	public void process(Exchange exchange) throws Exception {
		Empleado empleado =  exchange.getIn().getBody(Empleado.class);
		String edad=calcularTiempo(empleado.getFechaNacimiento());
		String tiempovinculacion=calcularTiempo(empleado.getFechaVinculacion());
		int anio=calcularAnio(empleado.getFechaNacimiento());
		exchange.getOut().setBody(empleado);
		exchange.setProperty("edad", edad);
		exchange.setProperty("anio", anio);
		exchange.setProperty("tiempovinculacion", tiempovinculacion);
	}
	public  String calcularTiempo(Date fecha){
		LocalDate today = LocalDate.now();   
		Period period = Period.between(fecha.toInstant()
			      .atZone(ZoneId.systemDefault())
			      .toLocalDate(), today);
		
		return period.getYears()+ " anio "+period.getMonths()+" meses "+period.getDays()+" dias ";
	}
	public  int calcularAnio(Date fecha){
		LocalDate today = LocalDate.now();   
		Period period = Period.between(fecha.toInstant()
			      .atZone(ZoneId.systemDefault())
			      .toLocalDate(), today);
		
		return period.getYears();
	}
}
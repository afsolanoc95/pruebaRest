package com.programa.server.process;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.programa.server.Dto.Empleado;
import com.programa.server.Dto.response;
import com.programa.server.Dto.response2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.camel.Exchange;

import org.apache.camel.Processor;



public class Mapper implements Processor {


	public void process(Exchange exchange) throws Exception {
		int condicion=Integer.parseInt(exchange.getIn().getHeader("condicion").toString());
		if(condicion==1) {
			Empleado empleado = exchange.getIn().getBody(Empleado.class);
			String edad = (String) exchange.getIn().getHeader("edad");
			String tiempoEmpresa = (String) exchange.getIn().getHeader("tiempoEmpresa");
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
			response responseDTO = new response();
			responseDTO.setNombres(empleado.getNombres());
			responseDTO.setApellidos(empleado.getApellidos());
			responseDTO.setTipoDocumento(empleado.getTipoDocumento());
			responseDTO.setNumeroDocumento(empleado.getNumeroDocumento());
	        String fechaNacimiento = dateFormat.format(empleado.getFechaNacimiento());  
			responseDTO.setFechaNacimiento(fechaNacimiento);
			String fechaVinculacion = dateFormat.format(empleado.getFechaVinculacion());  
			responseDTO.setFechaVinculacion(fechaVinculacion);
			responseDTO.setCargo(empleado.getCargo());
			responseDTO.setSalario(Double.toString(empleado.getSalario()));
			responseDTO.setEdad(String.valueOf(edad));
			responseDTO.setTiempoEmpresa(String.valueOf(tiempoEmpresa));
			ObjectMapper objectMapper = new ObjectMapper();
			String jsonResponse = objectMapper.writeValueAsString(responseDTO);
			exchange.setProperty("jsonResponse", jsonResponse);
			exchange.getIn().setHeader("CamelAcceptContentType", "application/json; charset=UTF-8");
			exchange.getIn().setHeader("Content-Type", "application/json; charset=UTF-8");
			exchange.getIn().setBody(responseDTO, response.class);
		}else {

			response2 responseDTO = new response2();
			responseDTO.setRespuesta((String) exchange.getIn().getBody());
			ObjectMapper objectMapper = new ObjectMapper();
			String jsonResponse = objectMapper.writeValueAsString(responseDTO);

			exchange.setProperty("jsonResponse", jsonResponse);

			exchange.getIn().setHeader("CamelAcceptContentType", "application/json; charset=UTF-8");
			exchange.getIn().setHeader("Content-Type", "application/json; charset=UTF-8");

			exchange.getIn().setBody(responseDTO, response2.class);
		}
		
	}
}
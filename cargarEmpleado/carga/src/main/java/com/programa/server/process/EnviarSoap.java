package com.programa.server.process;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.programa.InputSOATest;
import com.programa.server.Dto.Empleado;

public class EnviarSoap implements Processor{

	public InputSOATest getBook(Empleado empleado,String edad,String tiempoEmpresa) throws DatatypeConfigurationException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
		InputSOATest request = new InputSOATest();
        request.setNombres(empleado.getNombres());
        request.setApellidos(empleado.getApellidos());
        request.setTipoDocumento(empleado.getTipoDocumento());
        request.setNumeroDocumento(empleado.getNumeroDocumento());
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(empleado.getFechaNacimiento());
        request.setFechaNacimiento(DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar));
        GregorianCalendar calendar2 = new GregorianCalendar();
        calendar2.setTime(empleado.getFechaVinculacion());
        request.setFechaVinculacion(DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar2));
        request.setCargo(empleado.getCargo());
        request.setSalario(empleado.getSalario());
        request.setEdad(edad);
        request.setTiempoEmpresa(tiempoEmpresa);
        return request;
    }

	@Override
	public void process(Exchange exchange) throws Exception {
		Empleado empleado = exchange.getIn().getBody(Empleado.class);
		String edad = (String) exchange.getIn().getHeader("edad");
		String tiempoEmpresa = (String) exchange.getIn().getHeader("tiempoEmpresa");
			
		exchange.getOut().setBody(getBook(empleado,edad,tiempoEmpresa));
	}

}
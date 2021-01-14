package com.programa.server.Dto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class Empleado implements Serializable{
	private static final long serialVersionUID = 5L;

	private String nombres,apellidos,tipoDocumento,numeroDocumento,cargo;
	private Date fechaNacimiento,fechaVinculacion;
	private Double salario;
	
	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		List<String> formatStrings = Arrays.asList("yyyyMMdd");
		for (String formatString : formatStrings)
	    { 
			try {
			        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatString);
			        Date date = simpleDateFormat.parse(fechaNacimiento);
			        this.fechaNacimiento = date;
			} 
			        catch (Exception e) {
			         e.printStackTrace();
			      }
	    }
	}

	public Date getFechaVinculacion() {
		return fechaVinculacion;
	}

	public void setFechaVinculacionEmpresa(String fechaVinculacion) {
		List<String> formatStrings = Arrays.asList("yyyyMMdd");
		for (String formatString : formatStrings)
	    { 
			try {
			        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatString);
			        Date date = simpleDateFormat.parse(fechaVinculacion);
			        this.fechaVinculacion = date;
			} 
			        catch (Exception e) {
			        	System.out.println(e.getMessage());
			      }
	    }
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombre(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}
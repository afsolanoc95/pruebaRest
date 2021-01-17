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
			try {
			        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
			        
			        if(isValidDate(fechaNacimiento)) {
			        	Date date = simpleDateFormat.parse(fechaNacimiento);
				        this.fechaNacimiento = date;
			        }else {
			        	this.fechaNacimiento = null;
			        	System.out.println("formato fecha incorrecta ");
			        }
			        
			} 
			        catch (Exception e) {
			        	this.fechaNacimiento = null;
			        	System.out.println("formato fecha incorrecta "+e.getMessage());
			      }

	}

	 public static boolean isValidDate(String dateString) {
	       if (dateString == null || dateString.length() != "yyyyMMdd".length()) {
	           return false;
	       }

	       int date;
	       try {
	           date = Integer.parseInt(dateString);
	       } catch (NumberFormatException e) {
	           return false;
	       }

	       int year = date / 10000;
	       int month = (date % 10000) / 100;
	       int day = date % 100;

	       // leap years calculation not valid before 1581
	       boolean yearOk = (year >= 1581) && (year <= 2500);
	       boolean monthOk = (month >= 1) && (month <= 12);
	       boolean dayOk = (day >= 1) && (day <= daysInMonth(year, month));

	       return (yearOk && monthOk && dayOk);
	}

	private static int daysInMonth(int year, int month) {
	       int daysInMonth;
	       switch (month) {
	           case 1: 
	           case 3: 
	           case 5: 
	           case 7: 
	           case 8: 
	           case 10: 
	           case 12:
	               daysInMonth = 31;
	               break;
	           case 2:
	               if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
	                   daysInMonth = 29;
	               } else {
	                   daysInMonth = 28;
	               }
	               break;
	           default:
	               daysInMonth = 30;
	       }
	       return daysInMonth;
	}
	
	public Date getFechaVinculacion() {
		return fechaVinculacion;
	}

	public void setFechaVinculacionEmpresa(String fechaVinculacion) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

			try {
				
				
				 if(isValidDate(fechaVinculacion)) {
			        	Date date = simpleDateFormat.parse(fechaVinculacion);
				        this.fechaVinculacion = date;
			        }else {
			        	this.fechaVinculacion = null;
			        	System.out.println("formato fecha incorrecta ");
			        }

			} 
			catch (Exception e) {
			        	this.fechaVinculacion = null;
			        	System.out.println("formato fecha incorrecta "+e.getMessage());
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

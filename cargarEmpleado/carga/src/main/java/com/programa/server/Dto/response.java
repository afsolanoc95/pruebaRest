package com.programa.server.Dto;

import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonAutoDetect
@JsonSerialize
public class response implements Serializable{
	private static final long serialVersionUID = 2L;
	@JsonProperty("Nombres")
	private String nombres;
	
	@JsonProperty("Apellidos")
	private String apellidos;
	
	@JsonProperty("Tipo_de_documento")
	private String tipoDocumento;
	
	@JsonProperty("Numero_de_documento")
	private String numeroDocumento;
	
	@JsonProperty("fecha_de_nacimiento")
	private String fechaNacimiento;
	
	@JsonProperty("fecha_de_vinculacion_en_la_empresa")
	private String fechaVinculacion;
	
	@JsonProperty("Cargo")
	private String cargo;
	
	@JsonProperty("Salario")
	private String salario;
	
	@JsonProperty("Edad")
	private String edad;
	
	@JsonProperty("Tiempo_en_la_empresa")
	private String tiempoEmpresa;

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

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

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getFechaVinculacion() {
		return fechaVinculacion;
	}

	public void setFechaVinculacion(String fechaVinculacion) {
		this.fechaVinculacion = fechaVinculacion;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getTiempoEmpresa() {
		return tiempoEmpresa;
	}

	public void setTiempoEmpresa(String tiempoEmpresa) {
		this.tiempoEmpresa = tiempoEmpresa;
	}
	



}

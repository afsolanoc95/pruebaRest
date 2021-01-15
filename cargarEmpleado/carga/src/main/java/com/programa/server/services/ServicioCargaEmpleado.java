package com.programa.server.services;




import java.util.List;



import io.swagger.annotations.Api;

@Api("/")
public class ServicioCargaEmpleado implements RestServices {

	@Override
	public List<String> getEmployee(String nombres, String apellidos, String tipoDocumento, String numeroDocumento,
			String fechaNacimiento, String fechaVinculacion, String cargo, Double salario) {
		// TODO Auto-generated method stub
		return null;
	}	
}

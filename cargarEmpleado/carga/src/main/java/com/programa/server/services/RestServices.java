package com.programa.server.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Path("/")
public interface RestServices {


	@GET
	@Path("names={nombres}&lastnames={apellidos}&typeId={tipoDocumento}&numberId={numeroDocumento}&birthdate={fechaNacimiento}&companydate={fechaVinculacion}&businessRole={cargo}&salary={salario}/")
	@Produces({"application/json"})
	public List<String> getEmployee(@PathParam("nombres") String nombres,@PathParam("apellidos") String apellidos,
			@PathParam("tipoDocumento") String tipoDocumento,@PathParam("numeroDocumento") String numeroDocumento,
			@PathParam("fechaNacimiento") String fechaNacimiento,@PathParam("fechaVinculacion") String fechaVinculacion,
			@PathParam("cargo") String cargo,@PathParam("salario") Double salario);

}
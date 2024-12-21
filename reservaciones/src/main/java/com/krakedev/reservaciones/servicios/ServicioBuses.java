package com.krakedev.reservaciones.servicios;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.reservaciones.bdd.BusesBDD;
import com.krakedev.reservaciones.entidades.Buses;
import com.krakedev.reservaciones.excepciones.KrakeDevException;

@Path("buses")

public class ServicioBuses {
	@Path("recuperar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response obtenerDocumentos() {
		BusesBDD busesBDD = new BusesBDD();
		ArrayList<Buses> buses = null;
		try {
			buses = busesBDD.recuperarTodos();
			return Response.ok(buses).build();
		} catch (KrakeDevException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

}
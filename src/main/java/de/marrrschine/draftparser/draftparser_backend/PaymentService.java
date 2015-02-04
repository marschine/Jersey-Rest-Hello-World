package de.marrrschine.draftparser.draftparser_backend;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/payment")
public class PaymentService {

	@Autowired
	TransactionBo transactionBo;

	@GET
	@Path("/marschine")
	public Response savePayment() {
		String result = transactionBo.save();

		return Response.status(200).entity(result).build();
	}
}

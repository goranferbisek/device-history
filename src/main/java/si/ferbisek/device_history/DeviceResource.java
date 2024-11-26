package si.ferbisek.device_history;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("devices")
public class DeviceResource {

	/*@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Device getDevice(@QueryParam("externalId") String externalId) {
		return new Device(externalId);
	}*/

	@GET
	@Path("test")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response test() {
		return Response.ok("Deeeeeelllllaaaaa").build();
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public String testek() {
		return "Bravo, dela";
	}
}
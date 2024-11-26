package si.ferbisek.device_history;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.logging.Logger;

@Path("devices")
public class DeviceResource {
	public static final Logger logger = Logger.getLogger(DeviceResource.class.getName());

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

	@POST
	public Response collectData(Device device) {
		logger.info("Device data collected: " + device);
		return Response.ok().build();
	}
}
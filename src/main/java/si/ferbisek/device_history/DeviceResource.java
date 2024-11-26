package si.ferbisek.device_history;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.logging.Logger;

@Path("devices")
public class DeviceResource {
	private static final Logger logger = Logger.getLogger(DeviceResource.class.getName());

	@POST
	public Response collectData(Device device) {
		logger.info("Device data collected: " + device);
		return Response.ok().build();
	}

	@GET
	@Path("test")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response test() {
		return Response.ok("API is working!").build();
	}

}
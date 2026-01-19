package dbproject.resource;

import dbproject.service.LabsecService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

import java.math.BigInteger;

@Path("/labseq")
public class LabsecResource {

    @Inject
    LabsecService service;

    @GET
    @Path("/{n}")
    public BigInteger get(@PathParam("n") int n) {
        return service.calculate(n);
    }

}

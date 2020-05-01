package pl.dudus.rest;


import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import pl.dudus.model.Data;
import pl.dudus.repository.DataRepository;


/**
 *
 * @author Patryk Duduś
 */
@Path("/members")
public class DataRest {
   
    DataRepository member = new DataRepository();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Data> getAllMembers() {
        List<Data> result = member.findAll();
        return result;
    }
    
}
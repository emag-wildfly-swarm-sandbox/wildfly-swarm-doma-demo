package wildflyswarm.doma.api;

import wildflyswarm.doma.dao.EmployeeDao;
import wildflyswarm.doma.entity.Employee;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.List;

@Path("/")
public class EmployeeController {

  @Inject
  private EmployeeDao employeeDao;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Employee> getAll() {
    return employeeDao.selectAll();
  }

  @GET
  @Path("/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public Employee getById(@PathParam("id") Integer id) {
    return employeeDao.selectById(id);
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public Response create(@Context UriInfo uriInfo, Employee employee) {
    employeeDao.insert(employee);

    return Response
      .created(
        uriInfo.getAbsolutePathBuilder()
          .path(String.valueOf(employee.id))
          .build()
      ).build();
  }

}

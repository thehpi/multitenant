package nl.mrdm;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/projects/")
public class Project {

    @Inject
    @Any
    Instance<IMyBean> beans;

    @GET
    @Path("{project}")
    @Produces("text/plain")
    public String get(@PathParam("project") String project) {
        if (project == null) {
            throw new IllegalArgumentException("Please specify project");
        }

        StringBuilder buf = new StringBuilder();

        IMyBean bean = findProject(project);

        bean.init();

        buf.append("Data:\n\n");
        buf.append(bean.doit());

        return buf.toString();
    }

    private IMyBean findProject(String project) {
        for (IMyBean bean : beans) {
            if (project.equals(bean.getName())) {
                return bean;
            }
        }
        throw new IllegalArgumentException("Unknow project: " + project);
    }
}

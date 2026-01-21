package org.acme;



import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/some-page")
public class SomePage {

    @CheckedTemplate
    static class Templates {
        public static native TemplateInstance page();
        public static native TemplateInstance page$content();
    }
    
    private Service service;
    public SomePage() {
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        service.test();
        return Templates.page();
    }

}

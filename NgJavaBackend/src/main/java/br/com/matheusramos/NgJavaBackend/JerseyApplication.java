package br.com.matheusramos.NgJavaBackend;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by: Matheus Ramos - https://matheusramos.com/
 * */

@ApplicationPath("api")
public class JerseyApplication extends ResourceConfig {
    public JerseyApplication() {
        register(MultiPartFeature.class);
        register(CORSFilter.class);
    }
}

package br.com.matheusramos.NgJavaBackend;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;

/**
 * Created by: Matheus Ramos - https://matheusramos.com/
 * */

public class CORSFilter
implements ContainerResponseFilter {

	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {

		MultivaluedMap<String, Object> headers = responseContext.getHeaders();

		headers.add("Access-Control-Allow-Origin", "*");
		headers.add("Access-Control-Allow-Credentials", "true");
		//headers.add("Access-Control-Allow-Origin", "http://podcastpedia.org"); //allows CORS requests only coming from podcastpedia.org		
		headers.add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");		
		headers.add("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, X-Codingpedia, Accept, Authorization");
		
		
	}

}
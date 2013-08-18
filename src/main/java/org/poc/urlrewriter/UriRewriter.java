package org.poc.urlrewriter;

import org.poc.contentmapper.ContentMapperProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.net.URISyntaxException;

public class UriRewriter {
	private final static Logger log = LoggerFactory.getLogger(UriRewriter.class);
	final ContentMapperProvider contentMapperProvider;
	
	public UriRewriter( ContentMapperProvider contentMapperProvider ) {
		this.contentMapperProvider = contentMapperProvider;
	}
	
	public String rewriteUri(String urlRequest) throws URISyntaxException{
		
		URI inUri = new URI(urlRequest);
		
    String scheme = inUri.getScheme();
    String host = inUri.getHost();
    int port = inUri.getPort();
    String path = inUri.getPath();

		URI outURI = new URI(urlRequest);
		return outURI.toString();
	}
	
	public String rewriteBody(String body) {
		return body;
	}

}

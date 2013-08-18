package org.poc.urlrewriter;

import org.poc.contentmapper.ContentMapperProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class UrlRewriter {
	private final static Logger log = LoggerFactory.getLogger(UrlRewriter.class);
	final ContentMapperProvider contentMapperProvider;
	
	public UrlRewriter(ContentMapperProvider contentMapperProvider) {
		this.contentMapperProvider = contentMapperProvider;
	}
	
	public String rewriteUri(String urlRequest) throws URISyntaxException{
		
		URI inUri = new URI(urlRequest);
		

		URI outURI = new URI(urlRequest);
		return outURI.toString();
	}
	
	public String rewriteBody(String body) {
		return body;
	}

}

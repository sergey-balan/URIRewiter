package org.poc.contentmapper;

public interface ContentMapperProvider {
	void add(String key, String value);
	String getMap(String key);
}

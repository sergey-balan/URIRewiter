package org.poc.contentmapper;

import java.util.HashMap;
import java.util.Map;

public class ContentMapperImpl implements ContentMapperProvider {
	final Map<String, String> contentMap = new HashMap<String, String>();
	
	@Override
	public void add(String key, String value) {
		contentMap.put(key, value);
	}

	@Override
	public String getMap(String key) {
		return contentMap.get(key);
	}

}

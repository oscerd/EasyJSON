package com.easyjson.json.encoder.operation;

import java.io.IOException;
import java.io.Writer;

/**
 * 
 * @author Andrea Cosentino<ancosen@gmail.com>
 *
 */

public interface IJSONEncodingOperation {

	void addJSONElement(Object key, Object value, Writer out)
			throws IOException;
}
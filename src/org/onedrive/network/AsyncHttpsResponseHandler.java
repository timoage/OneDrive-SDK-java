package org.onedrive.network;

import io.netty.handler.codec.http.HttpResponse;
import org.onedrive.exceptions.ErrorResponseException;

/**
 * {@// TODO: Enhance javadoc}
 *
 * @author <a href="mailto:yoobyeonghun@gmail.com" target="_top">isac322</a>
 */
public interface AsyncHttpsResponseHandler {
	void handle(DirectByteInputStream resultStream, HttpResponse response) throws ErrorResponseException;
}

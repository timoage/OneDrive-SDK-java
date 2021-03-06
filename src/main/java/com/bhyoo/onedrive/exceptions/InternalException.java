package com.bhyoo.onedrive.exceptions;

/**
 * Exception that happens when SDK fails itself, in short <b>BUG</b>. So if you encounter with this kind of
 * exception, contact to <a href="mailto:bh322yoo@gmail.com" target="_top">author</a> with stack trace.
 *
 * @author <a href="mailto:bh322yoo@gmail.com" target="_top">isac322</a>
 */
public class InternalException extends RuntimeException implements OneDriveSDKException {
	private static final long serialVersionUID = 3298001219331142089L;

	public InternalException(String message, Throwable cause) {
		super(message, cause);
	}

	public InternalException(String message) {
		super(message);
	}
}

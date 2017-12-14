package com.hmh.util.dao;

public class AsyncMethodException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1131607243284633169L;

	private String error;
	private boolean systemError = false;
	
	public AsyncMethodException() {
		super();
	}
	
	public AsyncMethodException(String error) {
        super(error);
		//this.error = error;
    }
    
    public AsyncMethodException(String message, Throwable cause) {
        super(message, cause);
        systemError = true;
    }

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public boolean isSystemError() {
		return systemError;
	}

	public void setSystemError(boolean systemError) {
		this.systemError = systemError;
	}
}

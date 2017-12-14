package hmh.util;

public class ErrorException extends Throwable {

	private com.hmco.eai.Error error;
	
	public ErrorException() {
	}

	public ErrorException(String msg) {
		error = new com.hmco.eai.Error();
		error.setErrorMessage(msg);
	}

	
	public ErrorException(com.hmco.eai.Error error) {
		this.error = error;
	}

	public com.hmco.eai.Error getError() {
		return error;
	}

	public void setError(com.hmco.eai.Error error) {
		this.error = error;
	}
	
	
}

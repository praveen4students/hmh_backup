package hmh.rs.pojo;

public class ErrorException extends Exception {

	private Error error;
	
	public ErrorException() {
	}

	public ErrorException(String msg) {
		error = new Error();
		error.setErrorMessage(msg);
	}

	
	public ErrorException(Error error) {
		this.error = error;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}
	
	
}

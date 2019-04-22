package shoppee.com.utils;

import shoppee.com.entities.Admin;

public class AdminTokenResult {

	private String success;
	private String error;
	private Admin admin;

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public AdminTokenResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminTokenResult(String success, String error, Admin admin) {
		super();
		this.success = success;
		this.error = error;
		this.admin = admin;
	}

}

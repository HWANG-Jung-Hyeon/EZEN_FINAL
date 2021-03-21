package model;

public class AuthInfo {
	private String memId;
	private String memEmail;
	private String memName;
	public AuthInfo(String memId, String memEmail, String memName) {
		this.memId = memId;
		this.memEmail = memEmail;
		this.memName = memName;
	}

	public String getMemId() {
		return memId;
	}


	public String getMemEmail() {
		return memEmail;
	}

	public String getMemName() {
		return memName;
	}
 
}

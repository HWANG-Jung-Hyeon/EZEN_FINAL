package model;

public class AuthInfo {
 private String MEM_ID;
 private String MEM_NAME;
 public AuthInfo(String MEM_ID, String MEM_NAME) {
	 this.MEM_ID = MEM_ID;
	 this.MEM_NAME = MEM_NAME;
 }
 public String getMEM_ID() {
	return MEM_ID;
 }
 public void setMEM_ID(String mEM_ID) {
	MEM_ID = mEM_ID;
 }
 public String getMEM_NAME() {
 	return MEM_NAME;
 }
 public void setMEM_NAME(String mEM_NAME) {
	MEM_NAME = mEM_NAME;
 }
 
}

package java19;

public class UserVO {
	private int uNo;
	private String uId;
	private String uPwd;
	private String uName;
	private int uAge;
	
	public int getuNo() {
		return uNo;
	}
	public void setuNo(int uNo) {
		this.uNo = uNo;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getuPwd() {
		return uPwd;
	}
	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public int getuAge() {
		return uAge;
	}
	public void setuAge(int uAge) {
		this.uAge = uAge;
	}
	@Override
	public String toString() {
		return "UserVO [uNo=" + uNo + ", uId=" + uId + ", uPwd=" + uPwd + ", uName=" + uName + ", uAge=" + uAge + "]";
	}
}

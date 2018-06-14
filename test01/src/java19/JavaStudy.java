package java19;

public class JavaStudy {
	private String test;
	public String publTest;
	protected String protTest;
	
	public void setTest(String test) {
		this.test = test;
	}
	public String getTest() {
		return this.test;
	}
	public static void main(String[] args) {
		String test = "123";
		JavaStudy js = new JavaStudy();
		js.setTest(test);
		System.out.println(js.getTest()==test);
		
		test = null;
		System.out.println(js.getTest());
	}
}

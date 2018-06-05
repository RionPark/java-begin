package java14;

public class User {
	private int idx;
	private String name;
	
	public User(int idx, String name) {
		super();
		this.idx = idx;
		this.name = name;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [idx=" + idx + ", name=" + name + "]";
	}
	
}

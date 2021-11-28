package model;

public class Students {

	private String name;
	private int code;
	private Students next,prev;
	

	public Students(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Students getNext() {
		return next;
	}

	public void setNext(Students next) {
		this.next = next;
	}

	public Students getPrev() {
		return prev;
	}

	public void setPrev(Students prev) {
		this.prev = prev;
	}
	
}

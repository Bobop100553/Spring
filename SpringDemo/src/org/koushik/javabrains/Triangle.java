package org.koushik.javabrains;

public class Triangle {
	
	private String type;
	private int height;
	
	public Triangle(String type) {
		this.type = type;
	}

	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public int getHeight() {
		return height;
	}

	public void draw() {
		System.out.println(getType() + " Triangle drawn of height " + getHeight());
	}
	
}

package org.koushik.javabrains;

public class Triangle {
	
	private String type;
	private int height;
	
	public Triangle() {
		
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println(getType() + " Triangle drawn of height " + getHeight());
	}
	
}

package com.komasin4.cydownloader.model;


public class Folder {
	private String id;
	private String name;
	private String depth;
	private String depth1Name;
	private String depth2Name;
	private int postCount = 0;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepth() {
		return depth;
	}
	public void setDepth(String depth) {
		this.depth = depth;
	}
	
	
	public String getDepth1Name() {
		return depth1Name;
	}
	public void setDepth1Name(String depth1Name) {
		this.depth1Name = depth1Name;
	}
	public String getDepth2Name() {
		return depth2Name;
	}
	public void setDepth2Name(String depth2Name) {
		this.depth2Name = depth2Name;
	}
	public Folder(String id, String name, String depth) {
		super();
		this.id = id;
		this.name = name;
		this.depth = depth;
	}
	public Folder(String id, String name, String depth, String depth1Name, String depth2Name) {
		super();
		this.id = id;
		this.name = name;
		this.depth = depth;
		this.depth1Name = depth1Name;
		this.depth2Name = depth2Name;
	}
	@Override
	public String toString() {
		return "Folder [id=" + id + ", name=" + name + ", depth=" + depth + ", depth1Name=" + depth1Name
				+ ", depth2Name=" + depth2Name + "]";
	}
	public int getPostCount() {
		return postCount;
	}
	public void setPostCount(int postCount) {
		this.postCount = postCount;
	}
	
	
}

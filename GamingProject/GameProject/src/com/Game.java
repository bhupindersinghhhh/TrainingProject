package com;

public class Game {
	@Override
	public String toString() {
		return "GameName=" + gameName + ", AuthorName=" + authorName + ", Price=" + price;
	}

	private String gameName;
	private String authorName;
	private float price;

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public Game(String gameName, String authorName, float price) {
		super();
		this.gameName = gameName;
		this.authorName = authorName;
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}

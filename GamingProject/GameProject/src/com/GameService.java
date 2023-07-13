package com;

import java.util.ArrayList;
import java.util.List;

public class GameService {
	static ArrayList<Game> games = new ArrayList<Game>();

	public GameService() {
		games.clear();
		games.add(new Game("SnowBird", "Danny", 300));
		games.add(new Game("FreshFood", "Ram", 450));
		games.add(new Game("Batsman", "Kate", 400));
		games.add(new Game("Pokiman", "Steeve", 600));
		games.add(new Game("YammyTommy", "Narayan", 350));
	}

	List<Game> viewAll() {
		return games;
	}

	String authorSearch(String author) {
		String gameName = null;
		for(Game g:games) {
			if(g.getAuthorName().equalsIgnoreCase(author)) {
				return g.getGameName();
			}
		}
		return gameName;
	}

}

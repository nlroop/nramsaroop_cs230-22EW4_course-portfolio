package com.gamingroom;

/* Naomi Ramsaroop
 * CS-230 Module 3 - Project One
 * Southern New Hampshire University
 * March 20, 2022
 */

import java.util.ArrayList;
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;

	//Create an object of GamerService
	/* Purpose of Singleton Pattern: The purpose of the singleton pattern is to have a 
	 * single/ unique instance of a class and allows us to reuse the same object. In this 
	 * case we want to be able to access the array list of games with the same connection
	 * rather than creating multiple instances to access the same list.
	*/
	private static GameService service = null;
	
	//make the constructor private so that this it cannot be accessed from the outside. 
	private GameService() {}

	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */

	
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply return the existing instance
		if (getGame(name) != null) {
			game = getGame(name);
		}

		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same id
		// if found, simply assign that instance to the local variable
		/* Purpose of an Iterator Pattern:
		 * Iterators are useful when trying to iterate through a list of objects. In this case,
		 * we are iterating through a list to look for a specific ID. If gameId is found, then 
		 * we would assign the instance to the local variable. 
		 * */
		for (int i = 0; i < getGameCount(); i++) {
			if (games.get(i).getId() == id) {
				game = games.get(i);
			}
		}

		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply assign that instance to the local variable
		for (int i = 0; i < getGameCount(); i++) {
			if (games.get(i).getName() == name) {
				games = (List<Game>) games.get(i);
			}
		}

		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}

	public static GameService getInstance() {
		// TODO Auto-generated method stub
		if (service == null) {
			service = new GameService();
		}
		return service;
	}
}

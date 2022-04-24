package com.gamingroom;

/* Naomi Ramsaroop
 * CS-230 Module 3 - Project One
 * Southern New Hampshire University
 * March 20, 2022
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */

//Refactoring the game class to inherit from new Entity class
public class Game extends Entity {
	
	//Based on the UML, the game class now holds a list of active teams (private attribute)
	//Similar to the list of active games in the "GameService" class but instead of a least of games, its a list of teams.
	private List<Team> teams = new ArrayList<Team>();
	
	/**
	 * Constructor with an identifier and name
	 * Java's super keyword is used here to call the superclass method
	 * and access the superclass constructor
	 */
	
	public Game(long id, String name) {
		super(id, name);
	}
			
	/*Similar to the addGame iterator used in the GameService class, we will use the 
	 *iterator pattern to find existing teams with same name. 
	 */
			
	public Team addTeam(String name) {
			
		// a local team instance
		Team team = null;

		//Instantiate Iterator
		Iterator<Team> teamsIterator = teams.iterator();
			
		//Iterate over teams list
		while (teamsIterator.hasNext()) {
				
			Team teamInstance = teamsIterator.next();
				
			if (teamInstance.getName().equalsIgnoreCase(name)) {
					team = teamInstance;		
			}
				
			else {
					teams.add(team);
			}
				
		}
			
		return team;
		}
	
		
	public String toString() {
		return "Game [id=" + super.getId() + ", name=" + super.getName() + "]";
	}
	
}
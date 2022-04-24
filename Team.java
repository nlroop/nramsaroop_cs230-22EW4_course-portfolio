package com.gamingroom;

/* Naomi Ramsaroop
 * CS-230 Module 3 - Project One
 * Southern New Hampshire University
 * March 20, 2022
 */

//added to create a list and iterator through a list
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */

//Extending the class to derive from the Entity class as in the UML diagram
public class Team extends Entity {

	//Based on the UML, the game class now holds a list of active players (private attribute)
	//Similar to the list of active games in the "GameService" class but instead of a least of games, its a list of players.
	private static List<Player> players = new ArrayList<Player>();
	
	/**
	* Constructor with an identifier and name
	* Java's super keyword is used here to call the superclass method
	* and access the superclass constructor
	*/
	public Team(long id, String name) {
		super(id, name);
	}
	
	/*Similar to the addGame iterator used in the GameService class, we will use the 
	 *iterator pattern to find existing teams with same name. 
	*/
	
	public Player addPlayer(String name) {
		
		Player player = null;
		
		//Instantiate Iterator
		Iterator<Player> playersIterator = players.iterator();
		
		// Iterate through player list
		while (playersIterator.hasNext()) {
			
			Player playerInstance = playersIterator.next();
			
			if (playerInstance.getName().equalsIgnoreCase(name)) {
				player = playerInstance;
			}
			
			else {
				players.add(player);
			}
			
		}
		
		return player;
	}
	
	
	@Override
	public String toString() {
		return "Team [id=" + super.getId() + ", name=" + super.getName() + "]";
	}
}

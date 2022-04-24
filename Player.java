package com.gamingroom;

/* Naomi Ramsaroop
 * CS-230 Module 3 - Project One
 * Southern New Hampshire University
 * March 20, 2022
 */

/**
 * A simple class to hold information about a player
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a player is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */

//Extending the class to derive from the Entity class as in the UML diagram
public class Player extends Entity {
	
	//Public attribute "Player" using the "super" keyword to call superclass methods
	public Player(long id, String name) {
		super(id, name);
	}

	@Override
	//public toString to create a string of player id and name
	public String toString() {
		return "Player [id=" + super.getId() + ", name=" + super.getName() + "]";
	}
	
}

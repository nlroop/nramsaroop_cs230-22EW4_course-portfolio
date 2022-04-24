package com.gamingroom;

/* Naomi Ramsaroop
 * CS-230 Module 3 - Project One
 * Southern New Hampshire University
 * March 20, 2022
 */

public class Entity {
	
	//Based on the UML the following attributes are private
	private long id;
	private String name;
	
	//Default constructor --- Explain more about this
	private Entity() {
		
	}
	
	//Public attributes to get the id and name that were entered in either the Player, Team or Game class.
	//For example, when a player enters an Id and name in the player class, this constructor will call the 
	//information from that class with the id and name parameters.
	public Entity(long id, String name) {
		this(); // calls the default constructor
		this.id = id;
		this.name = name;
	}
	
	//returns the Player, Team or Game id that is called
	public long getId() {
		return id;
	}
	
	//returns the Player, Team or Game name that is called
	public String getName() {
		return name;
	}
	
	// this will create a string of the two called attributes. Example: id= 0000, name= Naomi 
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + "]";
		
	}

}

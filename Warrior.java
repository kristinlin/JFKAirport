//Team JFKAirport (Joanna Zhou, Fabiha Ahmed, Kristin Lin)
//APCS1 pd 05
//HW#31 -- Ye Olde Role Playing Game, Improved
//2016-11-17

public class Warrior extends Character {
    private String name;

    //default constructor
    public Warrior(){
	name = "pat";
	hp = 125;
	strength = 100;
	defense = 40;
	attackRating = 0.4;
    }

    //overloaded constructor with name
    public Warrior(String n) {
	this();
	name = n;
    }

}

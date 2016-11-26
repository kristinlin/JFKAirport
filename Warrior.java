public class Warrior extends Character {

    //default constructor
    public Warrior(){
	name = "pat";
	hp = 200;
	strength = 100;
	defense = 40;
	attackRating = 0.5;
    }

    //overloaded constructor with name
    public Warrior(String n) {
	this();
	name = n;
    }

    //sets defense and attackRating as normal
    public void normalize(){
	attackRating = 0.5;
	defense = 40;
    }

    //sets defense as 10 and attackRating as 1.6
    public void specialize(){
	attackRating = 1.0;
	defense = 20;
    }

    //about
    public String about(){
	return "1: Warrior- Strong, but not much else.";
    }
    
}

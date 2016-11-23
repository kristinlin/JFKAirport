public class Warrior extends Character {

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

    //sets defense and attackRating as normal
    public void normalize(){
	attackRating = 0.4;
	defense = 40;
    }

    //sets defense as 10 and attackRating as 1.6
    public void specialize(){
	attackRating = 1.6;
	defense = 10;
    }

    //about
    public String about(){
	return "1: Warrior- Strong, but not much else.";
    }
    
}

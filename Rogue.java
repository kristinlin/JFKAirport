public class Rogue extends Character {

    //default constructor
    public Rogue(){
	name = "pat";
	hp = 200;
	strength = 110;
	defense = 70;
	attackRating = 0.4;
    }

    //overloaded constructor with name
    public Rogue(String n) {
	this();
	name = n;
    }

    //sets defense and attackRating to normal
    public void normalize(){
	attackRating = 0.8;
	defense = 20;
    }

    //sets defense as 8 and attackRating as 2.0
    public void specialize(){
	attackRating = 0.8;
	defense = 35;
    }

    //about
    public String about(){
	return "3: Rogue- Sneaky, hard to hit but can't hit very hard.";
    }
}

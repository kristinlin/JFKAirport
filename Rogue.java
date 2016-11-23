public class Rogue extends Character {

    //default constructor
    public Rogue(){
	name = "pat";
	hp = 100;
	strength = 125;
	defense = 20;
	attackRating = 0.8;
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
	attackRating = 2.0;
	defense = 8;
    }

    //about
    public String about(){
	return "3: Rogue- Sneaky, hard hitting but can't take much damage.";
    }
}

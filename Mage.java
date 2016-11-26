public class Mage extends Character {

    //default constructor
    public Mage(){
	name = "pat";
	hp = 200;
	strength = 150;
	defense = 30;
	attackRating = 0.6;
    }

    //overloaded constructor with name
    public Mage(String n) {
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
	attackRating = 1.2;
	defense = 15;
    }

    //about
    public String about(){
	return "2: Mage- Powerful but weak.";
    }

}

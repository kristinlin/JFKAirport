public class Bard extends Character {

    //default constructor
    public Bard(){
	name = "pat";
	hp = 200;
	strength = 110;
	defense = 60;
	attackRating = 0.3;
    }

    //overloaded constructor with name
    public Bard(String n) {
	this();
	name = n;
    }

        //sets defense and attackRating as normal
    public void normalize(){
	attackRating = 0.3;
	defense = 60;
    }

    //sets defense as 10 and attackRating as 1.6
    public void specialize(){
	attackRating = 0.6;
	defense = 30;
    }

    //about
    public String about(){
	return "4: Bard- Creative, but not very strong.";
    }
}

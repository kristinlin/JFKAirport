public class Bard extends Character {

    //default constructor
    public Bard(){
	name = "pat";
	hp = 112;
	strength = 113;
	defense = 40;
	attackRating = 0.4;
    }

    //overloaded constructor with name
    public Bard(String n) {
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
	return "4: Bard- Creative, but not very strong.";
    }
}

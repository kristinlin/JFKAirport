public class Knight extends Character {

    //default constructor
    public Knight(){
	name = "pat";
	hp = 200;
	strength =175;
	defense = 75;
	attackRating = 0.2;
    }

    //overloaded constructor with name
    public Knight(String n) {
	this();
	name = n;
    }

    //sets defense and attackRating as normal
    public void normalize(){
	attackRating = 0.2;
	defense = 75;
    }

    //sets defense as 30 and attackRating as 0.6
    public void specialize(){
	attackRating = 0.4;
	defense = 38;
    }

    //about
    public String about(){
	return "5: Knight- Great armor, almost no attack strength.";
    }
    
}

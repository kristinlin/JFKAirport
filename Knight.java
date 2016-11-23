public class Knight extends Character {

    //default constructor
    public Knight(){
	name = "pat";
	hp = 150;
	strength = 75;
	defense = 60;
	attackRating = 0.3;
    }

    //overloaded constructor with name
    public Knight(String n) {
	this();
	name = n;
    }

    //sets defense and attackRating as normal
    public void normalize(){
	attackRating = 0.3;
	defense = 60;
    }

    //sets defense as 30 and attackRating as 0.6
    public void specialize(){
	attackRating = 0.6;
	defense = 30;
    }

    //about
    public String about(){
	return "5: Knight- Super high HP, almost no attack strength.";
    }
    
}

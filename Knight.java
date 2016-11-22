public class Knight extends Character {
    private String name;

    //default constructor
    public Knight(){
	name = "pat";
	hp = 200;
	strength = 25;
	defense = 40;
	attackRating = 0.4;
    }

    //overloaded constructor with name
    public Knight(String n) {
	this();
	name = n;
    }
    
}

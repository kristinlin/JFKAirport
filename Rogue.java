public class Rogue extends Character {
    private String name;

    //default constructor
    public Rogue(){
	name = "pat";
	hp = 100;
	strength = 125;
	defense = 40;
	attackRating = 0.4;
    }

    //overloaded constructor with name
    public Rogue(String n) {
	this();
	name = n;
    }

}

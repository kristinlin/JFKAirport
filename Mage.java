public class Mage extends Character {
    private String name;

    //default constructor
    public Mage(){
	name = "pat";
	hp = 175;
	strength = 50;
	defense = 40;
	attackRating = 0.4;
    }

    //overloaded constructor with name
    public Mage(String n) {
	this();
	name = n;
    }


}

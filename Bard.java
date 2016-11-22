public class Bard extends Character {
    private String name;

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

}

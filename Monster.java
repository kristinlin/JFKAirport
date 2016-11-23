public class Monster extends Character{

    //default constructor initializes attributes
    public Monster() {
	hp = 150;
	defense = 20;
	attackRating = 1;
	strength = (int)(Math.random() * 45) + 20;
    }
        //sets defense and attackRating as normal
    public void normalize(){
	attackRating = 1.0;
	defense = 20;
    }

    //sets defense as 10 and attackRating as 2.0
    public void specialize(){
	attackRating = 1.5;
	defense = 10;
    }

    //about
    public String about(){
	return "Monster- The enemy, good stats all around.";
    }
}

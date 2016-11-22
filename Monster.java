//Team JFKAirport (Joanna Zhou, Fabiha Ahmed, Kristin Lin)
//APCS1 pd 05
//HW#31 -- Ye Olde Role Playing Game, Improved
//2016-11-17

public class Monster extends Character{

    //default constructor initializes attributes
    public Monster() {
	hp = 150;
	defense = 20;
	attackRating = 1;
	strength = (int)(Math.random() * 45) + 20;
    }
}

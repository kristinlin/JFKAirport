public abstract class Character{
    protected int hp;
    protected int strength;
    protected int defense;
    protected double attackRating;
    protected String name;
    
    //returns true if hp is above 0, else false.
    public Boolean isAlive() {
	return hp > 0;
    }

    //accessor for defense variable
    public int getDefense() {
	return defense;
    }


    //lowers hp variable by input x
    public void lowerHP(int x) {
	hp -= x;
    }

    /*creates damage variable, sets it as (strength*attackRating) -
      n.getDefense(), lowers hp and returns damage. */
    public int attack(Character n) {
	int damage;
	damage = (int)(strength * attackRating) - n.getDefense();
	//nuances in damage for a more realistic duel
	if (Math.random() < .5) {
	    damage += (int)(Math.random() * 5);
	} else {
	    damage -= (int)(Math.random() * 5);
	}
	if(damage < 0) {
	    damage = 0;
	}
	n.lowerHP(damage);
	return damage;
    }

    public abstract void specialize();

    public abstract void normalize();

    //accessor for name variable
    public String getName() {
	return name;
    }

    public abstract String about();/*{
	String warriorDes = "1: Warrior- Strong, but not much else.";
	String monsterDes = "Monster- The enemy, good stats all around.";
	String mageDes = "2: Mage- Long lived but weak.";
	String rogueDes = "3: Rogue- Sneaky, hard hitting but can't take much damage.";
	String bardDes = "4: Bard- Creative, but not very strong.";
	String knightDes = "5: Knight- High defense, almost no attack strength.";
	return warriorDes + "\n" + mageDes + "\n" + rogueDes + "\n" + bardDes + "\n" + knightDes + "\n" + monsterDes;
	}*/
}

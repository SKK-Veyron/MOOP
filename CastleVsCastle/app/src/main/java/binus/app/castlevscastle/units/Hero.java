package binus.app.castlevscastle.units;

public class Hero {
	
	protected String name;
	protected int level;
	public String type;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void atkBuff(Army hero) {
		if (hero.getType().equals("Archer")) {
			hero.setAtk(hero.getAtk()+(hero.getAtk()*0.4));
		}
		else if (hero.getType().equals("Catapult")) {
			hero.setAtk(hero.getAtk()+(hero.getAtk()*0.4));
		}
		else if (hero.getType().equals("Cavalry")) {
			hero.setAtk(hero.getAtk()+(hero.getAtk()*0.4));
		}
		else if (hero.getType().equals("Infantry")) {
			hero.setAtk(hero.getAtk()+(hero.getAtk()*0.4));
		}
	}
}
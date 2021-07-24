package binus.app.castlevscastle;

import java.util.ArrayList;

public class Castle {
	protected String name;
	protected String skin;
	protected ArrayList<Army> unitlist = new ArrayList();
	protected ArrayList<Hero> herolist = new ArrayList();
	protected double firepower;
	protected double atkpower;
	protected double skillpower;
	protected double total;

	public double getfirepower() {
		return firepower;
	}
	
	public Castle(String name, String skin) {
		this.name = name;
		this.skin = skin;
	}
	
	public void addArmy(Army unitlist) {
		this.unitlist.add(unitlist);
	}
	
	public void addHero(Hero herolist) {
		this.herolist.add(herolist);
		Hero buff = new Hero();
		for (Army army : this.unitlist) {
			if (army.type.equals(herolist.type)) {
			buff.atkBuff(army);
			}
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void castlePrint() {
		String skinType = skin.toLowerCase();
		Hero buff = new Hero();
		
		
		switch (skinType) {
		
			case "horse" :
				for (Army army : unitlist) {
					if (army.category == "Cavalry") {
						army.skilldmg = army.skilldmg+(army.skilldmg * 0.2);
				}
			}
			break;
			
			case "wood" :
				for (Army army : unitlist) {
					if (army.category == "Archer") {
						army.skilldmg = army.skilldmg+(army.skilldmg * 0.2);
					}
				}
				break;
				
			case "steel" :
				for (Army army : unitlist) {
					if (army.category == "Infantry") {
						army.skilldmg = army.skilldmg+(army.skilldmg * 0.2);
					}
				}
				break;
				
			case "stone" :
				for (Army army : unitlist) {
					if (army.category == "Catapult") {
						army.skilldmg = army.skilldmg+(army.skilldmg * 0.2);
					}
				}
				break;
		}
		
		System.out.println("Castle Name : " + name);
		System.out.println(" ");
		System.out.println("Castle Skin : " + skin);
		System.out.println(" ");
		System.out.println("Heroes :");
		System.out.println(" ");
		for (Hero hero : herolist) {
			System.out.println("Hero Name : " + hero.name);
			System.out.println("Hero Level : " + hero.level);
			System.out.println(" ");
		}
		System.out.println("Troops :");
		System.out.println(" ");
		firepower = 0;
		atkpower = 0;
		skillpower = 0;
		for (Army army : unitlist) {
			System.out.println(army.type);
			System.out.println("Attack : " + army.atk);
			System.out.println("Skill Damage : " + army.skilldmg);
			System.out.println(" ");
			atkpower = atkpower + army.atk;
			skillpower = skillpower + army.skilldmg;
			total = atkpower + skillpower;
		}
		firepower = total;
	}
	
}
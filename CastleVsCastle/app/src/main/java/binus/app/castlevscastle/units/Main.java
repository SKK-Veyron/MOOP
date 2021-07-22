package binus.app.castlevscastle.units;

import java.util.ArrayList;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<Player> playerlist = new ArrayList<>();

		Castle castle1 = new Castle("Cavalry Castle", "Horse");
		Player player1 = new Player("Grand Cavalry", castle1);
		castle1.addArmy(new Cavalry());
		castle1.addArmy(new Cavalry());
		castle1.addArmy(new Cavalry());
		castle1.addArmy(new Cavalry());
		castle1.addHero(new HeroArcher());
		castle1.addHero(new HeroInfantry());
		castle1.addHero(new HeroCavalry());
		castle1.addHero(new HeroCatapult());
		castle1.addHero(new HeroArcher());
		castle1.addHero(new HeroCatapult());

		Castle castle2 = new Castle("Archer Castle", "Wood");
		Player player2 = new Player("Grand Archer", castle2);
		castle2.addArmy(new Archer());
		castle2.addArmy(new Archer());
		castle2.addArmy(new Archer());
		castle2.addArmy(new Archer());
		castle2.addHero(new HeroArcher());
		castle2.addHero(new HeroInfantry());
		castle2.addHero(new HeroCavalry());
		castle2.addHero(new HeroCatapult());
		castle2.addHero(new HeroArcher());
		castle2.addHero(new HeroArcher());

		Castle castle3 = new Castle("Catapult", "Stone");
		Player player3 = new Player("Grand Catapult", castle3);
		castle3.addArmy(new Archer());
		castle3.addArmy(new Infantry());
		castle3.addArmy(new Catapult());
		castle3.addArmy(new Cavalry());
		castle3.addHero(new HeroArcher());
		castle3.addHero(new HeroInfantry());
		castle3.addHero(new HeroCavalry());
		castle3.addHero(new HeroCatapult());
		castle3.addHero(new HeroInfantry());
		castle3.addHero(new HeroInfantry());

		Castle castle4 = new Castle("Infantry Castle", "Steel");
		Player player4 = new Player("Grand Infantry", castle4);
		castle4.addArmy(new Infantry());
		castle4.addArmy(new Infantry());
		castle4.addArmy(new Infantry());
		castle4.addArmy(new Infantry());
		castle4.addHero(new HeroArcher());
		castle4.addHero(new HeroInfantry());
		castle4.addHero(new HeroCavalry());
		castle4.addHero(new HeroCatapult());
		castle4.addHero(new HeroArcher());
		castle4.addHero(new HeroCatapult());
		
		playerlist.add(player1);
		playerlist.add(player2);
		playerlist.add(player3);
		playerlist.add(player4);
		
		for (Player list : playerlist) {
			System.out.println("Player Name : " + list.getName());
			System.out.println(" ");
			list.getCastle().castlePrint();
			System.out.println("---");
		}
	}
}

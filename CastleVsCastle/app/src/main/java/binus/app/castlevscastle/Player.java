package binus.app.castlevscastle;

public class Player {
	protected String name;
    protected Castle castle;

    public Player(String name, Castle castle) {
        this.name = name;
        this.castle = castle;
    }

    public String getName() {
        return name;
    }

    public Castle getCastle() {
        return castle;
    }
    public void setName(String getname) {
		this.name = getname;
	}
	
	public void setCastletype(Castle getype) {
		this.castle = getype;
	}
}

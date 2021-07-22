package binus.app.castlevscastle.unused_gameplaymechanic;

public class ArcherCastle extends Castle {

    public ArcherCastle() {
        this.CastleType = Castle.ARCHER;
    }

    @Override
    public double calculatePower() {

        double power = 0;
        for (Army arm: this.ArmiesToBattle) {
            if (arm.ArmyType == Army.ARCHER) {
                power += arm.numbers + arm.numbers * Army.ARCHER_BOOST;
            }else {
                power += arm.numbers;
            }
        }
        return power;
    }

    @Override
    public Castle battleTo(Castle ct2) {
        return this;
    }

    @Override
    public void setArmy(Army[] Armies) {

    }

}

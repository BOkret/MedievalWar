public class Attacker extends Character {
    private double bonusAttack;

    public Attacker(String name, double attack, double defence, double energy, double bonusAttack) {
        super(name, attack, defence, energy);
        this.bonusAttack = bonusAttack;
        setAttack(getAttack() * bonusAttack + getAttack());
    }

    public double getBonusAttack() {
        return bonusAttack;
    }

    public void setBonusAttack(double bonusAttack) {
        this.bonusAttack = bonusAttack;
    }
}

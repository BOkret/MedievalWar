public class Defender extends Character {
    private double bonusDefence;

    public Defender(String name, double attack, double defence, double energy, double bonusDefence) {
        super(name, attack, defence, energy);
        this.bonusDefence = bonusDefence;
        setDefence(getDefence() * bonusDefence + getDefence());
    }

    public double getBonusDefence() {
        return bonusDefence;
    }

    public void setBonusDefence(double bonusDefence) {
        this.bonusDefence = bonusDefence;
    }
}

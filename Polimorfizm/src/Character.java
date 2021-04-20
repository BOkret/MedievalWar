public class Character {
    private String name;
    private double attack;
    private double defence;
    private double energy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public Character(String name, double attack, double defence, double energy) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.energy = energy;
    }
}

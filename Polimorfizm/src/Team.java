public class Team {
    private final static int TEAM_SIZE = 3;

    private String name;
    private Character[] team = new Character[TEAM_SIZE];


    public Team(String name, Character character1, Character character2, Character character3) {
        this.name = name;
        this.team[0] = character1;
        this.team[1] = character2;
        this.team[2] = character3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double totalAttack(){
        double totalAttack = 0;
        for (int i = 0; i < team.length; i++) {
            totalAttack += team[i].getAttack();
        }
        return totalAttack;
    }

    public double totalDefence(){
        double totalDefence = 0;
        for (int i = 0; i < team.length; i++) {
            totalDefence += team[i].getDefence();
        }
        return totalDefence;
    }

    public double totalEnergy(){
        double totalEnergy = 0;
        for (int i = 0; i < team.length; i++) {
            totalEnergy += team[i].getEnergy();
        }
        return totalEnergy;
    }

}

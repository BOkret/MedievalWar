public class GameApp {
    public static void main(String[] args) {
        Attacker attacker1 = new Attacker("Atakujacy1", 50, 10, 100, 0.2);
        Attacker attacker2 = new Attacker("Atakujacy2", 50, 10, 100, 0.2);
        Attacker attacker3 = new Attacker("Atakujacy3", 50, 10, 100, 0.2);

        Defender defender4 = new Defender("Defender4", 20, 60, 120, 0.1);
        Defender defender5 = new Defender("Defender5", 20, 60, 120, 0.1);
        Defender defender6 = new Defender("Defender6", 20, 60, 120, 0.1);

        Team team1 = new Team("Drużyna1", attacker1, attacker2, defender4);
        Team team2 = new Team("Drużyna2", attacker3, defender5, defender6);

        Logic.fight(team1, team2);

    }
}

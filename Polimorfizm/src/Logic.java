public class Logic {

    static void fight(Team team1, Team team2){
        double team2EnergyPointsAfterAttack = attack(team1, team2);
        double team1EnergyPointsAfterAttack = attack(team2, team1);

        if (team1EnergyPointsAfterAttack == team2EnergyPointsAfterAttack){
            System.out.println("Remis");
        } else if (team2EnergyPointsAfterAttack > team1EnergyPointsAfterAttack){      //życie druzyny 2 > życie drużyny 1
            System.out.println("Wygrała drużyna " + team2.getName() + ", zostało jej "
                    + team2EnergyPointsAfterAttack + " punktów życia");
        } else
            System.out.println("Wygrała drużyna " + team1.getName() + ", zostało jej "
                    + team1EnergyPointsAfterAttack + " punktów życia");


    }

    private static double attack(Team attacker, Team defender){             //atak jednej drużyny na drugą-> ile życia zostanie
        double attackPower;
        attackPower = attacker.totalAttack() - defender.totalDefence();
//        System.out.println("Różnica:  " + difference);
        if (attackPower > 0){
//            System.out.println(defender.totalEnergy() - difference);
            double result = defender.totalEnergy() - attackPower;
            return result >= 0? result: 0;
        } else
//            System.out.println(defender.totalEnergy());
            return defender.totalEnergy();
    }


}


//kiedy używamy metod statycznych?- przypomnienie!!!
//spróbować to wrzucić na gitHuba
//ciekawy zapis            return result >= 0? result: 0;
//pamiętać o instanceof
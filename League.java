package soccer;

public class League {
    public static void main(String[] args) {

        Player player1 = new Player();
        player1.playerName = "George Elliot";

        Player player2 = new Player();
        player2.playerName = "Graham Greene";

        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";

        Player[] thePlayers = { player1, player2, player3 };

        Team team1 = new Team();
        team1.teamName = "The Greens";

        team1.playerArray = thePlayers;

        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];

        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";

        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";

        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";

        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;

        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;

        Goal goal2 = new Goal();
        goal2.thePlayer = currGame.awayTeam.playerArray[1];
        goal2.theTeam = currGame.awayTeam;
        goal2.theTime = 70.12;

        Goal[] theGoals = { goal1, goal2 };
        currGame.goals = theGoals;

        for (int i = 0; i < theGoals.length; i++) {
            System.out.println(String.format("Goal scored after %.2f mins by %s of %s team.", currGame.goals[i].theTime,
                    currGame.goals[i].thePlayer.playerName, currGame.goals[i].theTeam.teamName));

        }

        // for(Player thePlayer : team1.playerArray){
        // System.out.println(thePlayer.playerName);
        // }

        // for(Player thePlayer : team2.playerArray){
        // System.out.println(thePlayer.playerName);
        // }

    }
}
import Articles.Team;
import Players.Player;
import Players.Referee;
import Sports.Basketball;
import Sports.Soccer;
import Sports.Sport;
import Sports.Tennis;

public class Main {
    public static void main(String []args){


        Basketball game1 = new Basketball("LA Lakers", "Goldem State Wariors");
        game1.game();

        System.out.println("------------------------------------");
        System.out.println("DETAILS");
        System.out.println("------------------------------------");
        for(int i = 0 ; i < game1.getGameDetails().size(); i++){
            System.out.println(game1.getGameDetails().get(i));
        }
        System.out.println("------------------------------------");
        System.out.println("GAME RESULTS");
        System.out.println("------------------------------------");
        System.out.println(game1.getTeam1().getTeamName()+" - "+game1.getTeam1().getPoint());
        System.out.println(game1.getTeam2().getTeamName()+" - "+game1.getTeam2().getPoint());
        System.out.println("------------------------------------");

    }
}

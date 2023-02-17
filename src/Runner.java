import java.util.ArrayList;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many players: ");
        int players = s.nextInt();
        Game game = new Game(players);

    }
}

package lab3;

public class Main {

    public static void main(String[] args) {
        Player superman = new Player("Superman");
        Player batman = new Player("Batman");

        Fight fight = new Fight(superman, batman);
        while(!fight.isFinish()){
            fight.proceed();
        }

        String winnerId = fight.getWinner().userId;
        System.out.println(winnerId + " is the winner!");
    }
}

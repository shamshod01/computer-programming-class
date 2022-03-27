package lab3;

public class Fight {
    Player p1;
    Player p2;

    Fight(Player a, Player b){
        this.p1 = a;
        this.p2 = b;
    }

    int timeLimit = 100;
    int currRound = 0;

    public void proceed(){
        this.currRound++;
        System.out.printf("Round %d\n", currRound);
        char c = p1.getTactic();
        if(c == 'a'){
            p1.attack(p2);
        } else{
            p1.heal();
        }
        if(p2.alive()){
            c = p2.getTactic();
            if(c == 'a'){
                p2.attack(p1);
            } else{
                p2.heal();
            }
        }

        System.out.printf("%s health: %d\n", p1.userId, p1.getHealth());
        System.out.printf("%s health: %d\n", p2.userId, p2.getHealth());
    }

    public boolean isFinish(){
        return (this.currRound == this.timeLimit || p1.getHealth() == 0 || p2.getHealth() == 0);
    }

    public Player getWinner() {
        if(p1.getHealth() > p2.getHealth()){
            return p1;
        }
        return p2;
    }

}

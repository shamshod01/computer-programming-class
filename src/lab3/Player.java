package lab3;

public class Player {

    String userId;
    private int health = 50;

    Player(String userId){
        this.userId = userId;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void attack(Player opponent){
        int num = (int) (Math.random() * 5);
        int health = opponent.getHealth();
        if(health - num > 0){
            opponent.setHealth(health - num);
            return;
        }
        opponent.setHealth(0);
    }

    public void heal(){
        int num = (int) (Math.random() * 3+1);
        if(this.health + num < 50){
            this.health +=num;
            return;
        }
        this.health = 50;
    }

    public boolean alive() {
        return health > 0;
    }

    public char getTactic() {
        int num = (int) (Math.random() * 10+1);
        if(num <= 3) {
            return 'h';
        }
        return 'a';
    }
}

package ram.model.Elements;

public class Survivor extends Element {
    private int health;
    private int coins;

    private boolean nuke;
    public Survivor(int x,int y){
        super(x,y);
        this.health = 10;
        this.coins = 5;
        this.nuke = false;
    }
    public void decreaseHealth() {
        this.health--;
    }

    public int getHealth() {
        return health;
    }

    public int getCoins(){return coins; }
    public void decreaseCoins(){if(coins>0)coins--;}
    public void NukeCaught(){
        nuke = true;
    }
    public boolean getNuke(){
        return nuke;
    }
}


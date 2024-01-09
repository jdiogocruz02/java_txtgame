package ram.model;

import ram.model.Elements.Survivor;
import ram.model.Elements.Zombies;
import ram.model.realm.Realm;

import java.util.Objects;

public class Position {
    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position getLeft() {
        return new Position(x - 1, y);
    }

    public Position getRight() {
        return new Position(x + 1, y);
    }

    public Position getUp() {
        return new Position(x, y - 1);
    }

    public Position getDown() {
        return new Position(x, y + 1);
    }
    public Position doNothing(){return new Position(x,y);}

    public Position getRandomNeighbour(Position pos, Survivor survivor) {
        int SurvivorY = survivor.getPosition().getY();//y
        int SurvivorX = survivor.getPosition().getX();//x
        int ZombieY = pos.getY();
        int ZombieX = pos.getX();
        int n = (int) (Math.random() * 2);
        switch (n) {
            case 0:
                if (ZombieY < SurvivorY) {
                    return getDown();
                } else if (ZombieY > SurvivorY) {
                    return getUp();
                }
            case 1:
                if (ZombieX > SurvivorX) {
                    return getLeft();
                } else if (ZombieX < SurvivorX) {
                    return getRight();
                }
        }
        return doNothing();
        /*
        if (ZombieY < SurvivorY){
            if (){
                return doNothing();
            }
            return getDown();
        }
        else if(ZombieY > SurvivorY){
            if(pos.getUp() == wall){
                return doNothing();
            }
            return getUp();
        }
        else if(ZombieY == SurvivorY){return doNothing();}
        else if(ZombieX < SurvivorX){
            if(pos.getLeft() == wall){
                return  doNothing();
            }
            return getLeft();
        }
        else if(ZombieX > SurvivorX){
            if(pos.getRight() == wall){
                return doNothing();
            }
            return getRight();
        }
        else{return doNothing();}


        switch (n) {
            case 0:
                return getUp();
            case 1:
                return getRight();
            case 2:
                return getDown();
            default:
                return getLeft();
        }
    */
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
package ram.model.realm;

import ram.model.Elements.*;
import ram.model.Position;

import java.util.List;

public class Realm{
    private final int width;
    private final int height;
    private Survivor survivor;
    private List<Zombies> zombies;
    private List<Wall> walls;
    private List<Tree> trees;
    private List<Coin> coins;
    private List<Bush> bushes;
    private Nuke nuke;
    public Realm(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getWidth() {return width;}
    public int getHeight() {return height;}
    public Survivor getSurvivor() {
        return survivor;
    }
    public void setSurvivor(Survivor survivor) {
            this.survivor = survivor;
    }
    public List<Zombies> getZombies() {
        return zombies;
    }
    public void setZombies(List<Zombies> zombies) {
        this.zombies = zombies;
    }
    public List<Wall> getWalls() {
        return walls;
    }
    public void setWalls(List<Wall> walls) {
        this.walls = walls;
    }

    public boolean isEmpty(Position position) {
        for (Wall wall : walls)
            if (wall.getPosition().equals(position))
                return false;
        for (Tree tree : trees)
            if (tree.getPosition().equals(position))
                return false;
        for (Bush bush : bushes)
            if (bush.getPosition().equals(position))
                return false;
        return true;
    }
    public boolean isZombies(Position position) {
        for (Zombies monster : zombies)
            if (monster.getPosition().equals(position))
                return true;
        return false;
    }

    public void setNuke(Nuke nuke) {this.nuke = nuke;}
    public Nuke getNuke() {
        return nuke;
    }

    public void setTrees(List<Tree> trees) {this.trees = trees;}
    public List<Tree> getTrees() {
        return trees;
    }

    public void setCoins(List<Coin> coins) {this.coins = coins;}
    public List<Coin> getCoins() {
        return coins;
    }
    public boolean isCoins(Position position) {
        for (Coin coins : coins) {
            if (coins.getPosition().equals(position))
                return true;
        }
        return false;
    }

    public void setBushes(List<Bush> bushes) {this.bushes = bushes;}
    public List<Bush> getBushes() {return bushes;}

    public boolean isNuke(Position position) {
        if (nuke.getPosition().equals(position))
            return true;
        return false;
    }
}

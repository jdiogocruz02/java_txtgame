package ram.model.realm;

import ram.gui.LanternaGUI;
import ram.model.Elements.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoaderRealmBuilder extends RealmBuilder{
    private final int level;
    private final Random rng;

    private final List<String> lines;

    public LoaderRealmBuilder(int level) throws IOException {
        this.level = level;
        this.rng = new Random();
        URL resource = LoaderRealmBuilder.class.getResource("/realms/realm" + level + ".lvl");
        BufferedReader br = new BufferedReader(new FileReader(resource.getFile()));


        lines = readLines(br);
    }

    private List<String> readLines(BufferedReader br) throws IOException {
        List<String> lines = new ArrayList<>();
        for (String line; (line = br.readLine()) != null; )
            lines.add(line);
        return lines;
    }

    @Override
    protected int getWidth() {
        int width = 0;
        for (String line : lines)
            width = Math.max(width, line.length());
        return width;
    }

    @Override
    protected int getHeight() {
        return lines.size();
    }

    @Override
    protected List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '&') walls.add(new Wall(x, y));
        }

        return walls;
    }

    @Override
    protected List<Zombies> createZombies() {
        List<Zombies> zombies = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '#') zombies.add(new Zombies(x, y));
        }

        return zombies;
    }

    @Override
    protected List<Tree> createTrees() {
        List<Tree> trees = new ArrayList<>();
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '~') trees.add(new Tree(x, y));
        }

        return trees;
    }

    @Override
    protected List<Bush> createBushes() {
        List<Bush> bushes = new ArrayList<>();
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '|') bushes.add(new Bush(x, y));
        }

        return bushes;
    }

    @Override
    protected Nuke createNuke() {
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '!') return new Nuke(x, y);
        }
        return null;
    }

    @Override
    protected List<Coin> createCoins() {
        List<Coin> coins = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '%') coins.add(new Coin(x, y));
        }
        return coins;
    }

    @Override
    protected Survivor createSurvivor() {
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'H') return new Survivor(x, y);
        }
        return null;
    }


}
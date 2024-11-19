package org.example.flyweight.factory_method;

import org.example.flyweight.factory_method.tiles.Forest;
import org.example.flyweight.factory_method.tiles.Swamp;
import org.example.flyweight.factory_method.tiles.Water;

import java.util.Random;

class WildernessMap extends Map {

    public WildernessMap(int width, int height){
        super(width, height);
    }

    @Override
    public Tile createTile() {
        Random random = new Random();
        int tileType = random.nextInt(3);
        return switch (tileType) {
            case 0 -> new Swamp();
            case 1 -> new Forest();
            default -> new Water();
        };
    }
}
package org.example.flyweight.factory_method.tiles;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import org.example.flyweight.factory_method.Tile;
import org.example.flyweight.factory_method.TileGraphicFactory;

public class Swamp implements Tile {
    @Override
    public char getCharacter() {
        return 'S';
    }

    @Override
    public String getDescription() {
        return "swapm";
    }

    @Override
    public void render(GraphicsContext gc, int x, int y, int tileSize) {
        Image swampImage = TileGraphicFactory.getTileImage("Swamp");
        gc.drawImage(swampImage, x * tileSize, y * tileSize, tileSize, tileSize);
    }
}

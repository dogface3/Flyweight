package org.example.flyweight.factory_method.tiles;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import org.example.flyweight.factory_method.Tile;
import org.example.flyweight.factory_method.TileGraphicFactory;

public class Water implements Tile {
    @Override
    public char getCharacter() {
        return 'W';
    }

    @Override
    public String getDescription() {
        return "water";
    }

    @Override
    public void render(GraphicsContext gc, int x, int y, int tileSize) {
        Image waterImage = TileGraphicFactory.getTileImage("Water");
        gc.drawImage(waterImage, x * tileSize, y * tileSize, tileSize, tileSize);
    }
}

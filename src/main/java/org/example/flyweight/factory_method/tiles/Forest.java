package org.example.flyweight.factory_method.tiles;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import org.example.flyweight.factory_method.Tile;
import org.example.flyweight.factory_method.TileGraphicFactory;

public class Forest implements Tile {
    @Override
    public char getCharacter() {
        return 'F';
    }

    @Override
    public String getDescription() {
        return "forest";
    }

    @Override
    public void render(GraphicsContext gc, int x, int y, int tileSize) {
        Image forestImage = TileGraphicFactory.getTileImage("Forest");
        gc.drawImage(forestImage, x * tileSize, y * tileSize, tileSize, tileSize);
    }
}

package org.example.flyweight.factory_method.tiles;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import org.example.flyweight.factory_method.Tile;
import org.example.flyweight.factory_method.TileGraphicFactory;

public class Building implements Tile {
    @Override
    public char getCharacter() {
        return 'B';
    }

    @Override
    public String getDescription() {
        return "Building";
    }

    @Override
    public void render(GraphicsContext gc, int x, int y, int tileSize) {
        Image buildingImage = TileGraphicFactory.getTileImage("Building");
        gc.drawImage(buildingImage, x * tileSize, y * tileSize, tileSize, tileSize);
    }
}

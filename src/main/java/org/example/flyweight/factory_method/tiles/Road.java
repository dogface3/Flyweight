package org.example.flyweight.factory_method.tiles;

import org.example.flyweight.factory_method.Tile;
import org.example.flyweight.factory_method.TileGraphicFactory;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Road implements Tile {
    @Override
    public char getCharacter() {
        return 'R';
    }

    @Override
    public String getDescription() {
        return "A paved road.";
    }

    @Override
    public void render(GraphicsContext gc, int x, int y, int tileSize) {
        Image roadImage = TileGraphicFactory.getTileImage("Road");
        gc.drawImage(roadImage, x * tileSize, y * tileSize, tileSize, tileSize);
    }
}

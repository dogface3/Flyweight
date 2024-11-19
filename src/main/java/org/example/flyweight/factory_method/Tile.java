package org.example.flyweight.factory_method;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public interface Tile {
    char getCharacter();
    String getDescription();

    // New method for rendering the tile
    void render(GraphicsContext gc, int x, int y, int tileSize);
}

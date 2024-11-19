package org.example.flyweight.factory_method;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public abstract class Map {
    private final List<List<Tile>> tiles;
    private final int width;
    private final int height;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.tiles = new ArrayList<>();
        generateMap();
    }

    public abstract Tile createTile();

    private void generateMap() {
        for (int h = 0; h < height; h++) {
            List<Tile> row = new ArrayList<>();
            for (int w = 0; w < width; w++) {
                row.add(createTile());
            }
            tiles.add(row);
        }
    }

    public void render(Canvas canvas, int tileSize) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Tile tile = tiles.get(y).get(x);
                tile.render(gc, x, y, tileSize);
            }
        }
    }
}

package org.example.flyweight.factory_method;

import javafx.scene.image.Image;
import java.util.HashMap;
import java.util.Map;


public class TileGraphicFactory {
    private static final Map<String, Image> imageCache = new HashMap<>();

    public static Image getTileImage(String tileType) {
        if (imageCache.containsKey(tileType)) {
            return imageCache.get(tileType);
        }


        String imagePath = "/images/" + tileType + ".png";
        try {
            Image image = new Image(TileGraphicFactory.class.getResource(imagePath).toString());
            imageCache.put(tileType, image);
            return image;
        } catch (IllegalArgumentException e) {
            System.err.println("Error loading image: " + imagePath);
            e.printStackTrace();
            return null;
        }
    }
}

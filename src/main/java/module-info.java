module org.example.flyweight {
    requires javafx.controls;
    requires javafx.graphics;

    exports org.example.flyweight.factory_method;  // Make sure your package is exported
    opens org.example.flyweight.factory_method to javafx.graphics;  // Open for reflection
}

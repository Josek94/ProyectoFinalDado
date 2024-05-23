module proyectofinal.dado {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.desktop;
	requires javafx.graphics;

    opens proyectofinal.dado to javafx.fxml;
    exports proyectofinal.dado;
}

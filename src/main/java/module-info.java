module proyectofinal.dado {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.desktop;
	requires javafx.graphics;
	requires org.apache.poi.poi;
	requires org.apache.poi.ooxml;

    opens proyectofinal.dado to javafx.fxml;
    exports proyectofinal.dado;
}

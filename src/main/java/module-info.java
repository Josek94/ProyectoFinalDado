module proyectofinal.dado {
    requires javafx.controls;
    requires javafx.fxml;

    opens proyectofinal.dado to javafx.fxml;
    exports proyectofinal.dado;
}

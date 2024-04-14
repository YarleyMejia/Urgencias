module co.edu.uniquiquindio.estructuradatos.urgencias {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquiquindio.estructuradatos.urgencias to javafx.fxml;
    exports co.edu.uniquiquindio.estructuradatos.urgencias;
}
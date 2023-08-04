module pheonix.smiles.pheonixdemobird {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens pheonix.smiles.pheonixdemobird to javafx.fxml;
    exports pheonix.smiles.pheonixdemobird;
}
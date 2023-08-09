module pheonix.smiles.pheonixdemobird {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens pheonix.smiles.pheonixdemobird to javafx.fxml;
    exports pheonix.smiles.pheonixdemobird;

    exports pheonix.smiles.pheonixdemobird.layoutmanagers;
    opens pheonix.smiles.pheonixdemobird.layoutmanagers to javafx.fxml;
}
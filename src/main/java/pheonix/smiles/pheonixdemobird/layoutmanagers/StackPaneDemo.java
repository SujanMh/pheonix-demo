package pheonix.smiles.pheonixdemobird.layoutmanagers;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StackPaneDemo extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        StackPane stackPane = new StackPane();

        Image image = new Image(
                StackPaneDemo.class.getResourceAsStream("/images/pheonix.jpg")
        );
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(600);
        imageView.setFitHeight(400);
        stackPane.getChildren().add(imageView);

        Label label = new Label("Example of StackPane!!!");
        label.setFont(Font.font("Poppins", 20));
        label.setTextFill(Color.WHITE);
        StackPane.setAlignment(label, Pos.BOTTOM_CENTER);
        stackPane.getChildren().add(label);

        Scene scene = new Scene(stackPane, 600, 400);
        stage.setScene(scene);

        stage.setFullScreen(true);
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("Q"));

        // Create a key combination for Ctrl + F
        KeyCombination keyCombination = new KeyCodeCombination(
                KeyCode.Q,
                KeyCombination.CONTROL_DOWN
        );

        // Set the full-screen key combination handler
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                    if (keyCombination.match(keyEvent)) {
                        stage.setFullScreen(!stage.isFullScreen());
                }
            }
        });

        stage.setFullScreenExitHint("Press Q to exit!");


        stage.show();
    }
}

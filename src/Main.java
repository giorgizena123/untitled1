import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.util.Optional;

public class AlertOnClicks extends Application {

    private int clickCount = 0;

    @Override
    public void start(Stage primaryStage) {
        Button centerButton = new Button("დამაჭირე!");
        centerButton.setOnAction(event -> {
            clickCount++;
            if (clickCount == 5) {
                showAlertAndClose(primaryStage);
                clickCount = 0; // Reset counter after alert
            }
        });

        StackPane root = new StackPane(centerButton);
        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Alert აპლიკაცია");
        primaryStage.setScene(scene);

       
        primaryStage.setOnCloseRequest(WindowEvent::consume);

        primaryStage.show();
    }

    private void showAlertAndClose(Stage stage) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("გამორთვა");
        alert.setHeaderText("გსურთ აპლიკაციის გამორთვა?");
        alert.setContentText("აირჩიეთ Ok თუ გსურთ გამორთვა, Cancel თუ არა.");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            stage.close();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

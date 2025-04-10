import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SceneSwitcher extends Application {

    private Stage primaryStage;
    private Scene scene1, yellowScene, redScene, greenScene;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("სცენების გადართვა");


        Label label1 = new Label("Scene 1");
        Button yellowButton = new Button("switch to yellow scene");
        Button redButton = new Button("switch to red scene");
        Button greenButton = new Button("switch to green screen");

        VBox layout1 = new VBox(20, label1, yellowButton, redButton, greenButton);
        scene1 = new Scene(layout1, 300, 200);

        yellowButton.setOnAction(e -> primaryStage.setScene(yellowScene));
        redButton.setOnAction(e -> primaryStage.setScene(redScene));
        greenButton.setOnAction(e -> primaryStage.setScene(greenScene));

     
        Label yellowLabel = new Label("Yellow Scene");
        Button backFromYellow = new Button("go back");
        StackPane yellowLayout = new StackPane(yellowLabel, backFromYellow);
        yellowLayout.setStyle("-fx-background-color: yellow;");
        backFromYellow.setOnAction(e -> primaryStage.setScene(scene1));
        yellowScene = new Scene(yellowLayout, 300, 200);
        StackPane.setAlignment(yellowLabel, javafx.geometry.Pos.TOP_CENTER);
        StackPane.setAlignment(backFromYellow, javafx.geometry.Pos.BOTTOM_CENTER);


        Label redLabel = new Label("Red Scene");
        Button backFromRed = new Button("go back");
        StackPane redLayout = new StackPane(redLabel, backFromRed);
        redLayout.setStyle("-fx-background-color: red;");
        backFromRed.setOnAction(e -> primaryStage.setScene(scene1));
        redScene = new Scene(redLayout, 300, 200);
        StackPane.setAlignment(redLabel, javafx.geometry.Pos.TOP_CENTER);
        StackPane.setAlignment(backFromRed, javafx.geometry.Pos.BOTTOM_CENTER);

  
        Label greenLabel = new Label("Green Scene");
        Button backFromGreen = new Button("go back");
        StackPane greenLayout = new StackPane(greenLabel, backFromGreen);
        greenLayout.setStyle("-fx-background-color: green;");
        backFromGreen.setOnAction(e -> primaryStage.setScene(scene1));
        greenScene = new Scene(greenLayout, 300, 200);
        StackPane.setAlignment(greenLabel, javafx.geometry.Pos.TOP_CENTER);
        StackPane.setAlignment(backFromGreen, javafx.geometry.Pos.BOTTOM_CENTER);

        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage stage) {

        VBox projectBox = createBar("Projects - 20%", 20, Color.RED);
        VBox quizBox = createBar("Quizzes - 10%", 10, Color.BLUE);
        VBox midBox = createBar("Midterm - 30%", 30, Color.GREEN);
        VBox finalBox = createBar("Final - 40%", 40, Color.ORANGE);

        HBox root = new HBox(30, projectBox, quizBox, midBox, finalBox);
        root.setAlignment(Pos.BOTTOM_CENTER);

        Scene scene = new Scene(root, 500, 300);
        stage.setTitle("Grade Distribution");
        stage.setScene(scene);
        stage.show();
    }

    VBox createBar(String text, int percentage, Color color) {
        Rectangle rect = new Rectangle(50, percentage * 3);
        rect.setFill(color);

        Label label = new Label(text);

        VBox box = new VBox(5, rect, label);
        box.setAlignment(Pos.BOTTOM_CENTER);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
                                 }

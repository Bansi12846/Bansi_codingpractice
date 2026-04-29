import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.geometry.Insets;
import java.io.*;

public class Main extends Application {

    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        TextField rollField = new TextField();
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField emailField = new TextField();

        Button submit = new Button("Submit");

        grid.add(new Label("Roll No:"), 0, 0);
        grid.add(rollField, 1, 0);
        grid.add(new Label("Name:"), 0, 1);
        grid.add(nameField, 1, 1);
        grid.add(new Label("Age:"), 0, 2);
        grid.add(ageField, 1, 2);
        grid.add(new Label("Email:"), 0, 3);
        grid.add(emailField, 1, 3);
        grid.add(submit, 1, 4);

        submit.setOnAction(e -> {
            try {
                int roll = Integer.parseInt(rollField.getText());
                int age = Integer.parseInt(ageField.getText());
                String name = nameField.getText();
                String email = emailField.getText();

                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid email");
                }

                FileChooser fc = new FileChooser();
                fc.setTitle("Save Data");
                File file = fc.showSaveDialog(stage);

                if (file != null) {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                    bw.write("Roll No: " + roll + "\n");
                    bw.write("Name: " + name + "\n");
                    bw.write("Age: " + age + "\n");
                    bw.write("Email: " + email + "\n");
                    bw.close();
                }

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Success");
                alert.setHeaderText("Registration Successful");
                alert.setContentText("Roll: " + roll + "\nName: " + name + "\nAge: " + age + "\nEmail: " + email);
                alert.showAndWait();

            } catch (NumberFormatException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText("Roll No and Age must be integers");
                alert.showAndWait();
            } catch (Exception ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText(ex.getMessage());
                alert.showAndWait();
            }
        });

        Scene scene = new Scene(grid, 350, 250);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
                                           }

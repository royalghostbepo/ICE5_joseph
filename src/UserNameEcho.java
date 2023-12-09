import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UserNameEcho extends Application {

    protected Labeled displayLabel;

    @Override
    public void start(Stage primaryStage) {
        // Create a text field for the user's name
        TextField nameField = new TextField();
        nameField.setPromptText("Enter your name");

        // Create a button to submit the name
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String name = nameField.getText();
                System.out.println("Hello, " + name + "!");
                displayLabel.setText("Hello, " + name + "!");
            }
        });

        // Create a label to display the result
        Label displayLabel = new Label();

        // Set up the layout
        HBox inputBox = new HBox(10);
        inputBox.getChildren().addAll(nameField, submitButton);
        inputBox.setPadding(new Insets(10));

        VBox root = new VBox(10);
        root.getChildren().addAll(inputBox, displayLabel);

        // Set up the scene
        Scene scene = new Scene(root, 600, 300);
        primaryStage.setTitle("User Name Echo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
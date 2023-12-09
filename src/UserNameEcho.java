import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UserNameEcho extends Application {

    protected Label displayLabel; // Label to display user input

    @Override
    public void start(Stage primaryStage) {
        // Create a text field for the user's name
        TextField nameField = new TextField();
        nameField.setPromptText("Enter your name"); // Prompt text for input field

        // Create a button to submit the name
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String name = nameField.getText(); // Get text from the input field
                System.out.println("Hello, " + name + "!"); // Log to console
                displayLabel.setText("Hello, " + name + "!"); // Display user's name
            }
        });

        // Initialize the displayLabel for showing the user's name
        displayLabel = new Label(); // Using the class-level variable

        // Set up the layout - create an input box and a label display area
        HBox inputBox = new HBox(10); // Horizontal box for input elements
        inputBox.getChildren().addAll(nameField, submitButton); // Add input field and button
        inputBox.setPadding(new Insets(10)); // Set padding for input box

        VBox root = new VBox(10); // Vertical box for arranging elements
        root.getChildren().addAll(inputBox, displayLabel); // Add input box and label area

        // Set up the scene - create a scene and set it on the primary stage
        Scene scene = new Scene(root, 600, 300); // Create a scene with specified dimensions
        primaryStage.setTitle("User Name Echo"); // Set the window title
        primaryStage.setScene(scene); // Set the scene on the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}

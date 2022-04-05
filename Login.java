
import javafx.application.*;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Login extends Application {

    String backgroundStyle = "-fx-background-color: #82EEFD;";
    String buttonStyle = "-fx-font-size: 16px; -fx-text-fill: white; -fx-color: #306EFF; -fx-border-color:  blue; -fx-border-width: 2; -fx-border-radius: 10%;";
    String textStyle = "-fx-font-size: 16px";
    String linkStyle = "-fx-underline: true; -fx-text-fill: blue;";

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {

        BorderPane rootPane = new BorderPane();

        initComponents(rootPane);

        Scene scene = new Scene(rootPane, 500, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void initComponents(BorderPane rootPane) {

        GridPane container = new GridPane();
        container.setPadding(new Insets(20));
        container.setAlignment(Pos.CENTER);
        container.setVgap(10);

        // image
        ImageView image = new ImageView(new Image("file:icon.jpg"));
        image.setFitWidth(250);
        image.setFitHeight(150);

        // input fields
        PasswordField tf1 = new PasswordField();
        tf1.setPromptText("Email Address");

        PasswordField tf2 = new PasswordField();
        tf2.setPromptText("Password");

        // buttons
        Button login = new Button("Login");
        GridPane.setHalignment(login, HPos.CENTER);

        Button guestLogin = new Button("Continue as a Guest");
        GridPane.setHalignment(guestLogin, HPos.CENTER);

        // text
        Label l1 = new Label("Dont have an account?");
        Label l2 = new Label("Click");
        Label l3 = new Label("here");
        Label l4 = new Label("to create one!");

        HBox textContainer = new HBox(2);
        textContainer.setAlignment(Pos.CENTER);
        textContainer.getChildren().addAll(l2, l3, l4);

        GridPane.setHalignment(l1, HPos.CENTER);
        GridPane.setHalignment(textContainer, HPos.CENTER);

        // add components to vertical alignment
        container.add(image, 0, 0);
        container.add(tf1, 0, 1);
        container.add(tf2, 0, 2);
        container.add(login, 0, 3);
        container.add(l1, 0, 4);
        container.add(textContainer, 0, 5);
        container.add(guestLogin, 0, 6);

        // add container to root pane
        rootPane.setCenter(container);

        // set component styles
        tf1.setStyle(textStyle);
        tf2.setStyle(textStyle);

        login.setStyle(buttonStyle);
        guestLogin.setStyle(buttonStyle);

        l3.setStyle(linkStyle);

        rootPane.setStyle(backgroundStyle);
    }
}

package application;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.scene.paint.Color;


public class userReg extends Application {

    @Override
    
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Create a new account");
        GridPane gridPane = createRegistrationFormPane();
        addUIControls(gridPane);
        Scene scene = new Scene(gridPane, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        Color color1  = Color.rgb(91, 127, 255);
        Background background = new Background(new BackgroundFill(color1, null, null));
        gridPane.setBackground(background);
    }


    private GridPane createRegistrationFormPane() {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(40, 40, 40, 40));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        

        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

        return gridPane;
    }

    private void addUIControls(GridPane gridPane) {
        
    	
    	
        Label headerLabel = new Label("Account details");
        headerLabel.setFont(Font.font("Times Bold Roman", FontWeight.BOLD, 24));
        gridPane.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

        
        Label nameLabel = new Label("Full Name : ");
        nameLabel.setTextFill(Color.BLACK);
        nameLabel.setFont(Font.font("Times Bold Roman", FontWeight.BOLD,12));
        gridPane.add(nameLabel, 0,1);

       
        TextField nameField = new TextField();
        nameField.setPrefHeight(40);
        gridPane.add(nameField, 1,1);
        
        
       
        Label emailLabel = new Label("Email ID : ");
        emailLabel.setTextFill(Color.BLACK);
        emailLabel.setFont(Font.font("Times Bold Roman", FontWeight.BOLD,12));
        gridPane.add(emailLabel, 0, 2);

       
        TextField emailField = new TextField();
        emailField.setPrefHeight(40);
        gridPane.add(emailField, 1, 2);

        
        Label passwordLabel = new Label("Password : ");
        passwordLabel.setTextFill(Color.BLACK);
        gridPane.add(passwordLabel, 0, 3);
        passwordLabel.setFont(Font.font("Times Bold Roman", FontWeight.BOLD,12));
        
        PasswordField passwordField = new PasswordField();
        passwordField.setPrefHeight(40);
        gridPane.add(passwordField, 1, 3);
         
        
        
        
        Label phoneLabel = new Label("Phone Number : ");
        phoneLabel.setTextFill(Color.BLACK);
        gridPane.add(phoneLabel, 0,4);
        phoneLabel.setFont(Font.font("Times Bold Roman", FontWeight.BOLD,12));
       
        TextField phoneField = new TextField();
        phoneField.setPrefHeight(40);
        gridPane.add(phoneField, 1,4);
        
       

       
        Button submitButton = new Button("Create Account");
        submitButton.setPrefHeight(60);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(350);
        submitButton.setFont(Font.font("Times Bold Roman", FontWeight.BOLD,14));
        gridPane.add(submitButton, 0, 5, 3, 3);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(20, 0,20,0));
        
        Button cardButton= new Button("Add Card");
        cardButton.setPrefHeight(60);
        cardButton.setDefaultButton(true);
        cardButton.setPrefWidth(350);
        cardButton.setFont(Font.font("Times Bold Roman", FontWeight.BOLD,14));
        gridPane.add(cardButton, 0, 8, 3,3);
        GridPane.setHalignment(cardButton, HPos.CENTER);
        GridPane.setMargin(cardButton, new Insets(20, 0,20,0));
        
//       cardButton.setOnAction(new EventHandler<ActionEvent>() {
//           @Override
//           public void handle(ActionEvent event) {
//               if(nameField.getText().isEmpty()) {
//                   showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your name");
//                   return;
//               }
//               if(emailField.getText().isEmpty()) {
//                   showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your email id");
//                   return;
//               }
//               if(passwordField.getText().isEmpty()) {
//                   showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a password");
//                   return;
//               }
//               if(phoneField.getText().isEmpty()) {
//                   showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your phone Number");
//                   return;
//               }
//
//               showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Registration Successful!", "Welcome " + nameField.getText());
//           }
//       });
   
        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(nameField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your name");
                    return;
                }
                if(emailField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your email id");
                    return;
                }
                if(passwordField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a password");
                    return;
                }
                if(phoneField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your phone Number");
                    return;
                }

                showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Registration Successful!", "Welcome " + nameField.getText());
            }
        });
    }

    private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
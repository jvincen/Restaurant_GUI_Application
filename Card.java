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

public class Card extends Application {

    @Override
    
    
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Add a new card");     
        GridPane gridPane = createRegistrationFormPane();
        addUIControls(gridPane);
        Scene scene = new Scene(gridPane, 800, 500);	
        primaryStage.setScene(scene);
        Color color1  = Color.rgb(91, 127, 255);
        Background background = new Background(new BackgroundFill(color1, null, null));
        gridPane.setBackground(background);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
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
        
    	
    	
        Label headerLabel = new Label("Card details");
        headerLabel.setFont(Font.font("Times Bold Roman", FontWeight.BOLD, 24));
        gridPane.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

        
        Label nameLabel = new Label("Name on Card : ");
        nameLabel.setTextFill(Color.BLACK);
        nameLabel.setFont(Font.font("Times Bold Roman", FontWeight.BOLD,12));
        gridPane.add(nameLabel, 0,1);

       
        TextField nameField = new TextField();
        nameField.setPrefHeight(30);
        gridPane.add(nameField, 1,1);
        
        
       
        Label numLabel = new Label("Card Number : ");
        numLabel.setTextFill(Color.BLACK);
        numLabel.setFont(Font.font("Times Bold Roman", FontWeight.BOLD,12));
        gridPane.add(numLabel, 0, 2);

       
        TextField numField = new TextField();
        numField.setPrefHeight(30);
        gridPane.add(numField, 1, 2);

        
        Label passwordLabel = new Label("ExpDate(MM/YY):");
        passwordLabel.setTextFill(Color.BLACK);
        passwordLabel.setFont(Font.font("Times Bold Roman", FontWeight.BOLD,10));
        gridPane.add(passwordLabel, 0, 3);

        
        TextField passwordField = new TextField();
        passwordField.setPrefHeight(15);
        gridPane.add(passwordField, 1, 3);
         
        
        
        
        Label cvvLabel = new Label("CVV : ");
        cvvLabel.setTextFill(Color.BLACK);
        cvvLabel.setFont(Font.font("Times Bold Roman", FontWeight.BOLD,12));
        gridPane.add(cvvLabel, 0,4);

       
        TextField cvvField = new PasswordField();
        cvvField.setPrefHeight(15);
        gridPane.add(cvvField, 1,4);
        
        Label countryLabel = new Label("Country : ");
        countryLabel .setTextFill(Color.BLACK);
        countryLabel.setFont(Font.font("Times Bold Roman", FontWeight.BOLD,12));
        gridPane.add(countryLabel,0,5);

       
        TextField countryField = new TextField();
        countryField.setPrefHeight(15);
        gridPane.add(countryField,1,5);
       
        
        Label postLabel = new Label("Postal Code : ");
        postLabel.setTextFill(Color.BLACK);
        postLabel.setFont(Font.font("Times Bold Roman", FontWeight.BOLD,12));
        gridPane.add(postLabel, 0,6);

       
        TextField postField = new TextField();
        postField.setPrefHeight(15);
        gridPane.add(postField, 1,6);

       
        Button submitButton = new Button("Save Card");
        submitButton.setPrefHeight(40);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(350);
        gridPane.add(submitButton, 0, 7, 3, 3);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(20, 0,20,0));

        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(nameField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your name");
                    return;
                }
                if(numField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your card number");
                    return;
                }
                if(passwordField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter expiry date");
                    return;
                }
                if(cvvField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter CVV");
                    return;
                }
                if(countryField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter Country");
                    return;
                }
                if(postField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter Postal code");
                    return;
                }
                showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Thank you", "Card successfully added " );
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

    
}
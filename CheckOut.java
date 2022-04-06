package application;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class CheckOut extends Application {

    @Override


    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("CheckOut");     
        GridPane gridPane = createCheckoutFormPane();
        addUIControls(gridPane);
        Scene scene = new Scene(gridPane, 600, 500);	
        primaryStage.setScene(scene);
        Color color1  = Color.rgb(45, 200, 140);
        Background background = new Background(new BackgroundFill(color1, null, null));
        gridPane.setBackground(background);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }



    private GridPane createCheckoutFormPane() {
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



        Label headerLabel = new Label("Thanks for Choosing us");
        headerLabel.setFont(Font.font("Times Roman", FontWeight.BOLD, 30));
        gridPane.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(10, 0,10,0));


        Label numLabel = new Label("ETA on Order");
        numLabel.setTextFill(Color.BLACK);
        numLabel.setFont(Font.font("Times Bold Roman", FontWeight.BOLD,12));
        gridPane.add(numLabel, 0,2);
        GridPane.setHalignment(numLabel, HPos.CENTER);
        
        
        Label numField = new Label("4 min.");
        numField.setPrefWidth(50);
        gridPane.add(numField, 0,3);
        
        Label numField1 = new Label("12 min.");
        numField1.setPrefWidth(50);
        gridPane.add(numField1, 0,4);
        
        Label numField2 = new Label("15 min.");
        numField2.setPrefWidth(50);
        gridPane.add(numField2, 0,5);
        
        Label numField3 = new Label("17 min.");
        numField3.setPrefWidth(50);
        gridPane.add(numField3, 0,6);
        
        Label numField4 = new Label("21 min.");
        numField4.setPrefWidth(50);
        gridPane.add(numField4, 0,7);



        Label timeLabel = new Label("Order Number");
        timeLabel.setTextFill(Color.BLACK);
        timeLabel.setFont(Font.font("Times Bold Roman", FontWeight.BOLD,12));
        GridPane.setHalignment(timeLabel, HPos.CENTER);
        gridPane.add(timeLabel, 1, 2);


        Label timeField = new Label("1001");
        timeField.setPrefWidth(50);
        gridPane.add(timeField, 1, 3);
        
        Label timeField1 = new Label("1012");
        timeField1.setPrefWidth(50);
        gridPane.add(timeField1, 1, 4);
        
        Label timeField2 = new Label("1056 (Yours)");
        timeField2.setPrefWidth(100);
        gridPane.add(timeField2, 1, 5);
        
        Label timeField3 = new Label("1078");
        timeField3.setPrefWidth(50);
        gridPane.add(timeField3, 1, 6);
        
        Label timeField4 = new Label("1099");
        timeField4.setPrefWidth(50);
        gridPane.add(timeField4, 1, 7);


        Label lineLabel = new Label("People Infront of You");
        lineLabel.setTextFill(Color.BLACK);
        lineLabel.setFont(Font.font("Times Bold Roman", FontWeight.BOLD,12));
        gridPane.add(lineLabel, 2, 2);
        GridPane.setHalignment(lineLabel, HPos.CENTER);


        Label lineField = new Label("2");
        lineField.setPrefWidth(50);
        
        gridPane.add(lineField, 2, 3);
        
        Label lineField1 = new Label("3");
        lineField1.setPrefWidth(50);
        gridPane.add(lineField1, 2, 4);
        
        Label lineField2 = new Label("4");
        lineField2.setPrefWidth(50);
        gridPane.add(lineField2, 2, 5);
        
        Label lineField3 = new Label("5");
        lineField3.setPrefWidth(50);
        gridPane.add(lineField3, 2, 6);
        
        Label lineField4 = new Label("6");
        lineField4.setPrefWidth(50);
        gridPane.add(lineField4, 2, 7);

       
        
        Button submit_Button = new Button("Go Back to the Main Menu");
        submit_Button.setPrefHeight(40);
        submit_Button.setDefaultButton(true);
        submit_Button.setPrefWidth(200);
        gridPane.add(submit_Button, 0, 20, 3, 2);
        GridPane.setHalignment(submit_Button, HPos.CENTER);
        GridPane.setMargin(submit_Button, new Insets(20, 0,20,0));

        
    }

} 


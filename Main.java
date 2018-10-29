package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        Colour colour1 = new Colour(255, 0, 0);
        Colour colour2 = new Colour(0, 255, 0);
        Colour colour3 = new Colour(0, 0, 255);
        Colour colour4 = new Colour(255, 255, 0);

        ColourPalette palette1 = new ColourPalette(10);

        Rectangle color1Rect = new Rectangle(30, 30);
        color1Rect.setFill(Color.rgb(colour1.getRed(), colour1.getGreen(), colour1.getBlue()));

        Rectangle color2Rect = new Rectangle(30, 30);
        color2Rect.setFill(Color.rgb(colour2.getRed(), colour2.getGreen(), colour2.getBlue()));

        Rectangle color3Rect = new Rectangle(30, 30);
        color3Rect.setFill(Color.rgb(colour3.getRed(), colour3.getGreen(), colour3.getBlue()));

        Rectangle color4Rect = new Rectangle(30, 30);
        color4Rect.setFill(Color.rgb(colour4.getRed(), colour4.getGreen(), colour4.getBlue()));

        TabPane tabs = new TabPane();
        Tab paletteTab = new Tab("Palette");
        Tab mixerTab = new Tab("Mixer");
        tabs.getTabs().add(paletteTab);
        tabs.getTabs().add(mixerTab);
        tabs.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);


        FlowPane root = new FlowPane();
        root.setPadding(new Insets(0, 0, 0, 0));
        root.setHgap(10);
        root.getChildren().addAll(tabs);


        tabs.minWidthProperty().bind(root.widthProperty());

        //Palette Window
        Pane palettePane = new Pane();
        GridPane grid1 = new GridPane();
        Label paletteLabel = new Label("Color Palette ");
        Label color1Label = new Label("Color 1: ");
        Label color2Label = new Label("Color 2: ");
        Label color3Label = new Label("Color 3: ");
        Label color4Label = new Label("Color 4: ");

        grid1.setAlignment(Pos.TOP_LEFT);
        grid1.setPadding(new Insets(10));
        grid1.setVgap(10);
        grid1.setHgap(10);

        grid1.add(paletteLabel, 4, 2);

        grid1.add(color1Label, 4, 6);
        grid1.add(color2Label, 4, 7);
        grid1.add(color3Label, 4, 8);
        grid1.add(color4Label, 4, 9);

        grid1.add(color1Rect, 10, 6);
        grid1.add(color2Rect, 10, 7);
        grid1.add(color3Rect, 10, 8);
        grid1.add(color4Rect, 10, 9);

        palettePane.getChildren().addAll(grid1);
        paletteTab.setContent(palettePane);

        //Mixer Window
        Pane mixerPane = new Pane();
        GridPane grid2 = new GridPane();

        grid2.setAlignment(Pos.TOP_LEFT);
        grid2.setPadding(new Insets(10));
        grid2.setVgap(10);
        grid2.setHgap(10);

        Label mixerLabel = new Label("Color Mixer ");
        mixerLabel.setFont(Font.font("sans-serif", FontWeight.BOLD, 40));
        Label colorPickerLabel = new Label("Input RGB value: ");
        Label colorPickerLabel2 = new Label("Input RGB value: ");
        Label newColorRGB = new Label("RGB value: ");
        Label mixColor1 = new Label("Color 1");
        Label mixColor2 = new Label("Color 2");
        Label newColorLabel = new Label("New Color");
        newColorLabel.setVisible(false);
        newColorRGB.setVisible(false);

        Label red1 = new Label("R");
        Label red2 = new Label("R");
        Label red3 = new Label("R");
        red3.setVisible(false);

        Label green1 = new Label("G");
        Label green2 = new Label("G");
        Label green3 = new Label("G");
        green3.setVisible(false);

        Label blue1 = new Label("B");
        Label blue2 = new Label("B");
        Label blue3 = new Label("B");
        blue3.setVisible(false);


        TextField red1Field = new TextField();
        red1Field.setPrefSize(50, 20);
        red1Field.setPromptText("0-255");

        TextField green1Field = new TextField();
        green1Field.setPrefSize(50, 20);
        green1Field.setPromptText("0-255");

        TextField blue1Field = new TextField();
        blue1Field.setPrefSize(50, 20);
        blue1Field.setPromptText("0-255");

        TextField red2Field = new TextField();
        red2Field.setPrefSize(50, 20);
        red2Field.setPromptText("0-255");

        TextField green2Field = new TextField();
        green2Field.setPrefSize(50, 20);
        green2Field.setPromptText("0-255");

        TextField blue2Field = new TextField();
        blue2Field.setPrefSize(50, 20);
        blue2Field.setPromptText("0-255");

        TextField red3Field = new TextField();
        red3Field.setPrefSize(50, 20);
        red3Field.setVisible(false);

        TextField green3Field = new TextField();
        green3Field.setPrefSize(50, 20);
        green3Field.setVisible(false);

        TextField blue3Field = new TextField();
        blue3Field.setPrefSize(50, 20);
        blue3Field.setVisible(false);


        grid2.add(mixerLabel, 4, 2, 40, 1);
        grid2.add(colorPickerLabel, 4, 6);
        grid2.add(colorPickerLabel2, 4, 13);
        grid2.add(newColorRGB,4,22);

        grid2.add(red1Field, 8, 6, 3, 1);
        grid2.add(red1, 10, 5);

        grid2.add(green1Field, 11, 6, 3, 1);
        grid2.add(green1, 13, 5);

        grid2.add(blue1Field, 14, 6, 3, 1);
        grid2.add(blue1, 16, 5);

        grid2.add(red2Field, 8, 13, 3, 1);
        grid2.add(red2, 10, 12);

        grid2.add(green2Field, 11, 13, 3, 1);
        grid2.add(green2, 13, 12);

        grid2.add(blue2Field, 14, 13, 3, 1);
        grid2.add(blue2, 16, 12);

        grid2.add(red3Field, 8, 22, 3, 1);
        grid2.add(red3, 10, 21);

        grid2.add(green3Field, 11, 22, 3, 1);
        grid2.add(green3, 13, 21);

        grid2.add(blue3Field, 14, 22, 3, 1);
        grid2.add(blue3, 16, 21);


        grid2.add(mixColor1, 4, 5);
        grid2.add(mixColor2, 4, 12);
        grid2.add(newColorLabel,4,21);

        Circle color1Circle = new Circle(60);
        Circle color2Circle = new Circle(60);
        Circle newColorCircle = new Circle(60);

        color1Circle.setFill(Color.rgb(255, 255, 255, 0));
        color2Circle.setFill(Color.rgb(255, 255, 255, 0));
        newColorCircle.setFill(Color.rgb(255, 255, 255, 0));

        grid2.add(color1Circle, 20, 3, 20, 6);
        grid2.add(color2Circle, 20, 10, 20, 6);
        grid2.add(newColorCircle,20,19,20,6);
        newColorCircle.setVisible(false);

        Button showColor1Button = new Button("Show ");
        Button showColor2Button = new Button("Show ");
        Button mixColorsButton = new Button("Mix Colors");

        mixColorsButton.setVisible(false);

        grid2.add(showColor1Button, 14, 7, 5, 1);
        grid2.add(showColor2Button, 14, 14, 5, 1);
        grid2.add(mixColorsButton, 22, 17, 5, 1);




        mixerPane.getChildren().addAll(grid2);
        mixerTab.setContent(mixerPane);
        Scene scene1 = new Scene(root, 600, 600);

        primaryStage.setTitle("Color Mixer Ultra Turbo 9000");
        primaryStage.setScene(scene1);


        primaryStage.show();


        showColor1Button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                color1Circle.setFill(Color.rgb(Integer.parseInt(red1Field.getText()), Integer.parseInt(green1Field.getText()), Integer.parseInt(blue1Field.getText()), 1));

            }
        });
        showColor2Button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                color2Circle.setFill(Color.rgb(Integer.parseInt(red2Field.getText()), Integer.parseInt(green2Field.getText()), Integer.parseInt(blue2Field.getText()), 1));

                mixColorsButton.setVisible(true);
            }
        });
        mixColorsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                newColorLabel.setVisible(true);
                newColorRGB.setVisible(true);
                red3Field.setVisible(true);
                green3Field.setVisible(true);
                blue3Field.setVisible(true);
                red3.setVisible(true);
                green3.setVisible(true);
                blue3.setVisible(true);

                Colour colorMixer1 = new Colour(Integer.parseInt(red1Field.getText()), Integer.parseInt(green1Field.getText()), Integer.parseInt(blue1Field.getText()));
                Colour colorMixer2 = new Colour(Integer.parseInt(red2Field.getText()), Integer.parseInt(green2Field.getText()), Integer.parseInt(blue2Field.getText()));
                palette1.addColour(colorMixer1);
                palette1.addColour(colorMixer2);
                palette1.mixColour(colorMixer1,colorMixer2);

                newColorCircle.setFill(Color.rgb(colorMixer1.getRed(),colorMixer1.getGreen(),colorMixer1.getBlue(),1));
                newColorCircle.setVisible(true);

                red3Field.setText(""+colorMixer1.getRed());
                green3Field.setText(""+colorMixer1.getGreen());
                blue3Field.setText(""+colorMixer1.getBlue());

                red3Field.setEditable(false);
                green3Field.setEditable(false);
                blue3Field.setEditable(false);

            }
        });

    }
    public static void main(String[] args) {
        launch(args);
    }

}
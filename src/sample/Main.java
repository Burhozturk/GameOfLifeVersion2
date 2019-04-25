package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Game of Life");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        Frame frame = new Frame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setSize(Frame.WIDTH + frame.getInsets().left +  + frame.getInsets().right, Frame.HEIGHT + frame.getInsets().bottom +  + frame.getInsets().top);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.startUpdate();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

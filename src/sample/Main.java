package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        ArrayList<Train> tracks = new ArrayList<>();
        Random r = new Random();
        int track = 1;//r.nextInt(10) + 1;
       // int numberOfWagons = r.nextInt(10) + 1;
        Train T1 = new Train(track);
        for(int i = 0; i < 10; i ++){
            T1.addWagon(new Wagon());
           // track++;
        }
        //System.out.println(T1.getCargoTrain());
        launch(args);
    }
}

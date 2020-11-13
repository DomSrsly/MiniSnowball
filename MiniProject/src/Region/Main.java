package Region;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;


public class Main extends Application {

	public static void main (String[] args) {
	
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage){
		
	Button[] bt = new Button[] {
			new Button("North America"),
			new Button("South America"),
			new Button("Europe"), 
			new Button("Africa"),
			new Button("Asia"),
			new Button("Antarctica"),
			new Button("Australia/Oceania"),
	};
		
		TilePane tp = new TilePane();
		tp.setOrientation(Orientation.HORIZONTAL);
		tp.setTileAlignment(Pos.CENTER_RIGHT);
		tp.setPrefRows(9);
		ObservableList ol = tp.getChildren();
		ol.addAll(bt);
		Scene s = new Scene(tp);
		primaryStage.setTitle("Snowball");
		primaryStage.setScene(s);
		primaryStage.show();
		
		
		bt[0].setOnAction(e ->{
			TilePane tpna = new TilePane();
			Scene sna = new Scene(tpna);
			primaryStage.setTitle("North America");
			primaryStage.setScene(sna);
			primaryStage.show();
		});
		
		bt[1].setOnAction(e ->{
			TilePane tpsa = new TilePane();
			Scene sna = new Scene(tpsa);
			primaryStage.setTitle("South America");
			primaryStage.setScene(sna);
			primaryStage.show();
		});
		
		bt[2].setOnAction(e ->{
			TilePane tpeu = new TilePane();
			Scene eu = new Scene(tpeu);
			primaryStage.setTitle("Europe");
			primaryStage.setScene(eu);
			primaryStage.show();
		});
		
		bt[3].setOnAction(e ->{
			TilePane tpa = new TilePane();
			Scene a = new Scene(tpa);
			primaryStage.setTitle("Africa");
			primaryStage.setScene(a);
			primaryStage.show();
		});
		
		bt[4].setOnAction(e ->{
			TilePane tpA = new TilePane();
			Scene A = new Scene(tpA);
			primaryStage.setTitle("Asia");
			primaryStage.setScene(A);
			primaryStage.show();
		});
		
		bt[5].setOnAction(e ->{
			TilePane tpAa = new TilePane();
			Scene Aa = new Scene(tpAa);
			primaryStage.setTitle("Antartica");
			primaryStage.setScene(Aa);
			primaryStage.show();
		});
		
		bt[6].setOnAction(e ->{
			TilePane tpAO = new TilePane();
			Scene AO = new Scene(tpAO);
			primaryStage.setTitle("Australia/Oceania");
			primaryStage.setScene(AO);
			primaryStage.show();
		});
		
	}
	

}

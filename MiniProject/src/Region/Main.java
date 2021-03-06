package Region;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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

	Label[] labels = new Label[] {
			new Label("US"),
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
			tpna.getChildren().addAll(new Button("create"),new Button("update"), new Button("delete"), new TextField(), new TextArea());
			Scene sna = new Scene(tpna);
			primaryStage.setTitle("North America");
			primaryStage.setScene(sna);
			primaryStage.show();
		});
		
		bt[1].setOnAction(e ->{
			TilePane tpsa = new TilePane();
			tpsa.getChildren().addAll(new Button("create"),new Button("update"), new Button("delete"),new TextField(), new TextArea() );
			Scene sna = new Scene(tpsa);
			primaryStage.setTitle("South America");
			primaryStage.setScene(sna);
			primaryStage.show();
		});
		
		bt[2].setOnAction(e ->{
		
			TilePane tpeu = new TilePane();
			//How to implement button function in .addAll?
		//	tpeu.getChildren().addAll(new Button("create").setOnAction(arg0);,new Button("update"), new Button("delete"));
			Scene eu = new Scene(tpeu);
			primaryStage.setTitle("Europe");
			primaryStage.setScene(eu);
			primaryStage.show();
		});
		
		bt[3].setOnAction(e ->{
			TilePane tpa = new TilePane();
			tpa.getChildren().addAll(new Button("create"),new Button("update"), new Button("delete"));
			Scene a = new Scene(tpa);
			primaryStage.setTitle("Africa");
			primaryStage.setScene(a);
			primaryStage.show();
		});
		
		bt[4].setOnAction(e ->{
			TilePane tpA = new TilePane();
			tpA.getChildren().addAll(new Button("create"),new Button("update"), new Button("delete"));
			Scene A = new Scene(tpA);
			primaryStage.setTitle("Asia");
			primaryStage.setScene(A);
			primaryStage.show();
		});
		
		bt[5].setOnAction(e ->{
			TilePane tpAa = new TilePane();
			tpAa.getChildren().addAll(new Button("create"),new Button("update"), new Button("delete"));
			Scene Aa = new Scene(tpAa);
			primaryStage.setTitle("Antartica");
			primaryStage.setScene(Aa);
			primaryStage.show();
		});
		
		bt[6].setOnAction(e ->{
			TilePane tpAO = new TilePane();
			tpAO.getChildren().addAll(new Button("create"),new Button("update"), new Button("delete"));
			Scene AO = new Scene(tpAO);
			primaryStage.setTitle("Australia/Oceania");
			primaryStage.setScene(AO);
			primaryStage.show();
		});
	}
	
}

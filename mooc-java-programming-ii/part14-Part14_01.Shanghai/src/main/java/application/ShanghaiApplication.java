package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.Scene;
import java.util.Map;
import java.util.HashMap;
import javafx.util.Pair;
import java.util.ArrayList;

public class ShanghaiApplication extends Application {

    @Override
    public void start(Stage stage) {
        NumberAxis xAxis = new NumberAxis(2006, 2018, 1);
        NumberAxis yAxis = new NumberAxis();

        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");

        XYChart.Series uHelsData = new XYChart.Series();
        Map<Integer, Integer> values = new HashMap<>();

        values.put(2007, 73);
        values.put(2008, 68);
        values.put(2009, 72);
        values.put(2010, 72);
        values.put(2011, 74);
        values.put(2012, 73);
        values.put(2013, 76);
        values.put(2014, 73);
        values.put(2015, 67);
        values.put(2016, 56);
        values.put(2017, 56);

        for (int key : values.keySet()) {
            uHelsData.getData().add(new XYChart.Data(key, values.get(key)));
        }
        
        lineChart.getData().add(uHelsData);
        
        Scene view = new Scene (lineChart, 650, 480);
        stage.setScene(view);
        stage.show();

    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

}

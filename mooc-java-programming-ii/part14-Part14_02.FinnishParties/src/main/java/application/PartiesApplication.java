package application;

import javafx.application.Application;
import javafx.scene.chart.NumberAxis;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.LineChart;

public class PartiesApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis();

        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support (%)");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        Map<String, Map<Integer, Double>> values = new HashMap<>();
        List<String[]> rows = new ArrayList<>();

        //Reading file and treating data
        try ( Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))) {

            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] splitRow = row.split("\t");
                rows.add(splitRow);

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        String[] years = rows.get(0);

        for (int i = 1; i < rows.size(); i++) {

            Map<Integer, Double> partyData = new HashMap<>();
            String[] part = rows.get(i);
            System.out.println(part);

            for (int j = 1; j < part.length; j++) {
                if (!part[j].equals("-")) {
                    partyData.put(Integer.valueOf(years[j]), Double.valueOf(part[j]));
                }
                
            }

            values.put(part[0], partyData);
        }

        System.out.println(values);

        values.keySet().stream().forEach(party -> {
            XYChart.Series data = new XYChart.Series();
            data.setName(party);

            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });

            lineChart.getData().add(data);
        });

        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();

    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

}

package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.NumberAxis;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.beans.value.ObservableValue;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;

public class SavingsCalculatorApplication extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        layout.setPadding(new Insets(10, 10, 10, 10));

        VBox sliders = new VBox();

        BorderPane firstSliderPane = new BorderPane();
        firstSliderPane.setLeft(new Label("Monthly savings"));

        Slider savingsSlider = new Slider(25, 250, 25);
        savingsSlider.setShowTickLabels(true);
        savingsSlider.setShowTickMarks(true);
        savingsSlider.setMajorTickUnit(25);
        savingsSlider.setSnapToTicks(true);

        Label savingsLabel = new Label(Double.toString(savingsSlider.getValue()));
        savingsLabel.textProperty().bind(Bindings.format("%.1f", savingsSlider.valueProperty()));

        firstSliderPane.setCenter(savingsSlider);
        firstSliderPane.setRight(savingsLabel);

        BorderPane secondSliderPane = new BorderPane();
        secondSliderPane.setLeft(new Label("Yearly interest rate"));

        Slider interestRateSlider = new Slider(0, 10, 0);
        interestRateSlider.setShowTickLabels(true);
        interestRateSlider.setShowTickMarks(true);
        interestRateSlider.setMajorTickUnit(10);
        interestRateSlider.setMinorTickCount(10);
        interestRateSlider.setSnapToTicks(true);

        Label interestRateLabel = new Label(Double.toString(interestRateSlider.getValue()));

        interestRateLabel.textProperty().bind(Bindings.format("%.0f", interestRateSlider.valueProperty()));

        secondSliderPane.setCenter(interestRateSlider);
        secondSliderPane.setRight(interestRateLabel);

        sliders.getChildren().add(firstSliderPane);
        sliders.getChildren().add(secondSliderPane);

        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings calculator");
        lineChart.setAnimated(false);
        lineChart.setLegendVisible(false);

        XYChart.Series savings = new XYChart.Series();
        XYChart.Series savingsInterest = new XYChart.Series();

        lineChart.getData().add(savings);
        lineChart.getData().add(savingsInterest);

        savingsSlider.setOnMouseReleased(e -> {
            update(savingsSlider.getValue(), interestRateSlider.getValue(), savings, savingsInterest);
        });

        interestRateSlider.setOnMouseReleased(e -> {
            update(savingsSlider.getValue(), interestRateSlider.getValue(), savings, savingsInterest);
        });

        layout.setTop(sliders);
        layout.setCenter(lineChart);

        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();

    }

    private void update(double monthlySavings, double interestRate, XYChart.Series savings, XYChart.Series savingsWithInterest) {
        savings.getData().clear();
        savingsWithInterest.getData().clear();

        savings.getData().add(new XYChart.Data(0, 0));
        savingsWithInterest.getData().add(new XYChart.Data(0, 0));

        double previousSavings = 0;

        for (int i = 1; i <= 30; i++) {
            savings.getData().add(new XYChart.Data(i, i * monthlySavings * 12));

            previousSavings += monthlySavings * 12;
            previousSavings *= (1 + interestRate / 100);

            savingsWithInterest.getData().add(new XYChart.Data(i, previousSavings));
        }
    }

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
        System.out.println("Hello world!");
    }

}

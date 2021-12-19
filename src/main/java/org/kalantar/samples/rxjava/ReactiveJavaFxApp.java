package org.kalantar.samples.rxjava;

import io.reactivex.Observable;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ReactiveJavaFxApp extends Application {

    @Override
    public void start(Stage stage) {
        ToggleButton toggleButton = new ToggleButton("TOGGLE ME");
        Observable<Boolean> selectedStates = Observable.create(emitter -> {
            emitter.onNext(toggleButton.selectedProperty().getValue());
            toggleButton.selectedProperty().addListener(
                    (observableValue, prev, current) -> emitter.onNext(current));
        });

        Label label = new Label();
        selectedStates.map(selected -> selected ? "DOWN" : "UP")
                .subscribe(label::setText);

        VBox vBox = new VBox(toggleButton, label);
        stage.setScene(new Scene(vBox));
        stage.show();
    }
}

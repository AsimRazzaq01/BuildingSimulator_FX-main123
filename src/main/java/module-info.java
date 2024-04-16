module com.example.buildingsimulator_fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.buildingsimulator_fx to javafx.fxml;
    exports com.example.buildingsimulator_fx;
}
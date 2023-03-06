module com.example.moesurvey {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.moesurvey to javafx.fxml;
    exports com.example.moesurvey;
}
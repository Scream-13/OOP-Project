module t5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens t5 to javafx.fxml;

    exports t5;
}

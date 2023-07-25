module com.example.proj5se {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.proj5se to javafx.fxml;
    exports com.example.proj5se;
}
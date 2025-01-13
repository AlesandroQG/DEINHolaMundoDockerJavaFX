module com.alesandro.holamundodockerjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.alesandro.holamundodockerjavafx to javafx.fxml;
    exports com.alesandro.holamundodockerjavafx;
}
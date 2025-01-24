module com.alesandro.holamundodockerjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.slf4j;


    opens com.alesandro.holamundodockerjavafx to javafx.fxml;
    exports com.alesandro.holamundodockerjavafx;
}
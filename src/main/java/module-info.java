module com.example.leetcode_practicing {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.leetcode_practicing to javafx.fxml;
    exports com.example.leetcode_practicing;
}
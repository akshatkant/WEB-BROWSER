module HelloFx {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.web;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}

package com.example.demojavafx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WebViewTest extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a WebView object
        WebView webView = new WebView();

        // Get the WebEngine for loading content
        WebEngine webEngine = webView.getEngine();

        // Load a webpage
        webEngine.load("https://www.google.com");

        // Create a layout pane
        BorderPane root = new BorderPane();
        root.setCenter(webView);

        // Create the scene and set it on the stage
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("JavaFX WebView Test");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

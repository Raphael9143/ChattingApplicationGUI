package com.example.application;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class ChatBoxController implements Initializable, InterfaceUI {
    @FXML
    private VBox catBox;
    @FXML
    private VBox dogBox;
    @FXML
    private VBox chickenBox;
    @FXML
    private VBox pigBox;
    @FXML
    private VBox birdBox;
    @FXML
    private AnchorPane upPane;
    @FXML
    private AnchorPane bottomPane;
    @FXML
    private ImageView defaultImage;
    @FXML
    private ImageView Avatar;
    @FXML
    private Label chatLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        defaultImage.setVisible(true);
    }

    public void setPane(boolean isVisible) {
        upPane.setVisible(isVisible);
        bottomPane.setVisible(isVisible);
    }

    public void setAllBox(boolean isVisible) {
        catBox.setVisible(isVisible);
        dogBox.setVisible(isVisible);
        chickenBox.setVisible(isVisible);
        pigBox.setVisible(isVisible);
        birdBox.setVisible(isVisible);
    }

    @FXML
    void switchToCatBox(MouseEvent event) {
        defaultImage.setVisible(false);
        setPane(true);
        setAllBox(false);

        catBox.setVisible(true);
        chatLabel.setText("Cat");
        Avatar.setImage(new Image(CURRENTPACK + RESOURCES + TEXTURE + CAT));
    }

    @FXML
    void switchToDogBox(MouseEvent event) {
        defaultImage.setVisible(false);
        setPane(true);
        setAllBox(false);

        dogBox.setVisible(true);
        chatLabel.setText("Dog");
        Avatar.setImage(new Image(CURRENTPACK + RESOURCES + TEXTURE + DOG));
    }

    @FXML
    void switchToChickenBox(MouseEvent event) {
        defaultImage.setVisible(false);
        setPane(true);
        setAllBox(false);

        chickenBox.setVisible(true);
        chatLabel.setText("Chicken");
        Avatar.setImage(new Image(CURRENTPACK + RESOURCES + TEXTURE + CHICKEN));
    }

    @FXML
    void switchToPigBox(MouseEvent event) {
        defaultImage.setVisible(false);
        setPane(true);
        setAllBox(false);

        pigBox.setVisible(true);
        chatLabel.setText("Pig");
        Avatar.setImage(new Image(CURRENTPACK + RESOURCES + TEXTURE + PIG));
    }

    @FXML
    void switchToBirdBox(MouseEvent event) {
        defaultImage.setVisible(false);
        setPane(true);
        setAllBox(false);

        birdBox.setVisible(true);
        chatLabel.setText("Bird");
        Avatar.setImage(new Image(CURRENTPACK + RESOURCES + TEXTURE + BIRD));
    }
}
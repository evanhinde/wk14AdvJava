package com.example.wk14;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class ProductsController implements Initializable {

    @FXML
    private TableColumn<Product, String> brandColumn;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private TableColumn<Product, Integer> idColumn;

    @FXML
    private TableColumn<Product, Double> priceColumn;

    @FXML
    private Label productsLabel;

    @FXML
    private ImageView imageView;

    @FXML
    private TableColumn<Product, Double> ratingsColumn;

    @FXML
    private TableColumn<Product, Integer> stockColumn;

    @FXML
    private TableView<Product> tableView;

    @FXML
    private TableColumn<Product, String> titleColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ApiResponse apiResponse = ApiUtility.getProductsFromAPI();

        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        ratingsColumn.setCellValueFactory(new PropertyValueFactory<>("rating"));
        stockColumn.setCellValueFactory(new PropertyValueFactory<>("stock"));
        brandColumn.setCellValueFactory(new PropertyValueFactory<>("brand"));

        tableView.getItems().addAll(apiResponse.getProducts());

        tableView.getSelectionModel().selectedItemProperty().addListener(
                (observableValue, oldProduct, newProduct) -> {
                    productsLabel.setText(newProduct.getTitle());
                    descriptionTextArea.setText(newProduct.getDescription());

                    imageView.setImage(new Image(newProduct.getImages()[0]));
                }
        );
    }
}


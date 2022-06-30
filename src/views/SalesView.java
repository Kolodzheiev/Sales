package views;


import models.Product;
import utils.Validator;

import java.util.Scanner;

// View
public class SalesView {
    Product model;
    String title;
    Scanner scanner;

    public SalesView(Product model) {
        this.model = model;
    }

    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";
        getOutput(title);
        model.setName(Validator.validateName(scanner));

        title = "Введите количество: ";
        getOutput(title);
        model.setQuantity(Validator.validateQuantityInput(scanner));

        title = "Введите цену: ";
        getOutput(title);
        model.setPrice(Validator.validatePriceInput(scanner));

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}

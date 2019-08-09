package com.codegym.views;

import com.codegym.controller.ProductController;
import com.codegym.model.Product;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int choice;
        ProductController productController = new ProductController();
        do {
            menu();
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    List<Product> productList = productController.findAll();
                    for (Product product : productList) {
                        System.out.println("ID: " + product.getId() + "NAME: " + product.getName().toUpperCase());
                    }
                    break;
                }
                case 2: {
                    Product product = createProduct();
                    productController.addProduct(product);
                    break;
                }
            }
        } while (choice != 0);


    }

    public static void menu() {
        System.out.println("1. Hien thi danh sach");
        System.out.println("2. Them moi");
        System.out.println("0. Thoat ");
        System.out.println("Nhap vao chon lua: ");
    }

    public static Product createProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Nhap NAME: ");
        String name = input.nextLine();

        Product product = new Product(id, name);

        return product;
    }
}

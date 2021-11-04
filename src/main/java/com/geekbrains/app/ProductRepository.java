package com.geekbrains.app;

public class ProductRepository {

    private Product[] repository = {
            new Product(1, "Xлеб", 25),
            new Product(2, "Молоко", 50),
            new Product(3, "Картофель", 39),
            new Product(4, "Торт", 499),
            new Product(5, "Сыр", 299),
            new Product(6, "Свекла", 33),
            new Product(7, "Яблоки", 199),
            new Product(8, "Капуста", 33),
            new Product(9, "Кофе", 399),
            new Product(10, "Чай", 109),
    };

    public Product[] getRepository() {
        return repository;
    }
}

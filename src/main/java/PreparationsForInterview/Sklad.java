package PreparationsForInterview;

import java.util.HashMap;

public class Sklad {


    private HashMap<String, Integer> goods = new HashMap<>();
    // "В системе есть склад.
    //
    //Склад хранит товары.
    //У каждого товара есть:
    //название
    //количество на складе
    //

    public void addProduct(String product, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }
        else if (goods.containsKey(product)) {
            goods.put(product, goods.get(product) + quantity);
        }  else {
            goods.put(product, quantity);
        }
    }

    public void increaseQuantity(String product, int quantity) {
        if (!goods.containsKey(product)) {
            throw new IllegalArgumentException("Product not found");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }
        goods.put(product, goods.get(product) + quantity);
    }



    public void decreaseQuantity(String product, int quantity) {
        if (!goods.containsKey(product)) {
            throw new IllegalArgumentException("Product not found");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }

        int current = goods.get(product);

        if (quantity > current) {
            throw new IllegalArgumentException("Not enough product in stock");
        }

        int newQuantity = current - quantity;

        if (newQuantity == 0) {
            goods.remove(product);
        } else {
            goods.put(product, newQuantity);
        }
    }

    public int returnQuantity(String product) {
        if (goods.containsKey(product)) {
            return goods.get(product);
        } else{
            throw new IllegalArgumentException("Product not found");
    }
    }
    public boolean isProductExists(String product) {
        return goods.containsKey(product);
    }

    public int countProducts() {
        return goods.size();
    }

    //Нужно реализовать систему, которая может:
    //добавить товар на склад
    //увеличить количество существующего товара
    //уменьшить количество товара
    //узнать остаток по названию
    //проверить, есть ли товар на складе
    //показать количество разных товаров
    //
    //Правила:
    //если товар уже есть, при добавлении количество увеличивается
    //нельзя уменьшить количество больше, чем есть на складе
    //если количество товара стало 0, его можно удалить со склада
    //название товара уникально
    //
    //Пример:
    //Добавляем товары:
    //Apple → 10
    //Banana → 5
    //Apple → 3
    //
    //Остатки:
    //Apple → 13
    //Banana → 5
    //
    //Списываем:
    //Banana → 2
    //
    //Остатки:
    //Banana → 3"
}

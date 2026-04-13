package PreparationsForInterview;

import java.util.HashMap;
import java.util.Map;

public class PlayerInventory {
    // "В системе есть инвентарь.


    Map<String, Integer> inventoryList = new HashMap<>();

    //Инвентарь хранит предметы игрока.
    //У каждого предмета есть:
    //название
    //количество
    //
    //Нужно реализовать систему, которая может:

    void addInventory(String inventory, int quantity) {
        if(inventory == null  || inventory.isBlank() || quantity<=0){
            throw new IllegalArgumentException();
        } inventoryList.put(inventory, inventoryList.getOrDefault(inventory, 0) + quantity);
    }


    public void useInventory(String inventory) {
        if (!inventoryList.containsKey(inventory)) {
            throw new IllegalArgumentException("Предмета нет в инвентаре");
        }

        int count = inventoryList.get(inventory);

        if (count <= 1) {
            inventoryList.remove(inventory);
        } else {
            inventoryList.put(inventory, count - 1);
        }
    }

    //добавить предмет в инвентарь
    //использовать предмет
    //узнать количество предмета
    //проверить, есть ли предмет в инвентаре
    //показать количество разных предметов
    //
    //Правила:
    //если предмет уже есть, при добавлении количество увеличивается
    //использовать можно только существующий предмет
    //при использовании количество уменьшается на 1
    //если количество стало 0, предмет удаляется из инвентаря
    //название предмета уникально
    //
    //Пример:
    //Добавляем предметы:
    //Potion → 3
    //Arrow → 10
    //Potion → 2
    //
    //Количество:
    //Potion → 5
    //Arrow → 10
    //Используем:
    //Potion
    //Количество:
    //
    //Potion → 4"
}

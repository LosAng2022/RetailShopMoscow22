package ru.my.retail.person;

import ru.my.retail.product.Cheese;
import ru.my.retail.product.FoodProduct;
import ru.my.retail.product.Kefir;

public interface EntryInTheDiary {

   default void toDoList(FoodProduct foodProduct, Kefir kefir, Cheese cheese) {

   }


}

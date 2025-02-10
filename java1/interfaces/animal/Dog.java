package java1.interfaces.animal;

import java1.interfaces.shoppingcart.Item;
import java1.interfaces.todolist.TodoItem;

public class Dog  extends Animal implements Item, TodoItem {

    public boolean isDone;

    public String getDescription() {
        return "Wuff Wuff. Mit Kulleraugen!";
    }

    public double getPrice() {
        return 99999999999999.99;
    }

    public boolean isDone() {
        return isDone;
    }

    public String getTitle() {
        return this.getDescription();
    }
}
package java1.interfaces;

import java1.interfaces.animal.Cat;
import java1.interfaces.animal.Dog;
import java1.interfaces.shoppingcart.ShoppingCart;
import java1.interfaces.todolist.TodoList;

public class Example {
  public static void main(String[] args) {
    ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.addToShoppingCart(new Dog());
    shoppingCart.addToShoppingCart(new Cat());
    shoppingCart.print();

    TodoList todoList = new TodoList();
    todoList.addTodo(new Dog());
    todoList.print();
  }
}

package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    @Test
    void testAddItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);

        assertEquals(2, cart.getItemCount(), "Item count should be 2 after adding two items.");
    }

    @Test
    void testRemoveItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.removeItem("Apple");

        assertEquals(1, cart.getItemCount(), "Item count should be 1 after removing an item.");
    }

    @Test
    void testCalculateTotal() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.addItem("Orange", 0.75);

        assertEquals(2.25, cart.calculateTotal(), 0.01, "Total cost should be 2.25.");
    }
}

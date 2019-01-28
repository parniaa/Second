/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Collections;

public class Customer {
    public static final Customer Armin = new Customer("Armin");
    public static final Customer Ailin= new Customer("Ailim");
    public static final Customer Gholi = new Customer("Gholi");

    private final String name;

    public Customer(String name) {
        this.name = name;
    }
    public void reply(final String message){
        System.out.println("This is reply");
    }
}

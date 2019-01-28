/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Collections;

public class Enquiry {

    private final Customer customer;
    private final Category category;

    @Override
    public String toString() {
        return "Enquiry{" +
                "customer=" + customer +
                ", category=" + category +
                '}';
    }

    public Category getCategory() {
        return category;
    }

    public Customer getCustomer() {

        return customer;
    }

    public Enquiry(Customer customer, Category category) {

        this.customer = customer;
        this.category = category;
    }
}

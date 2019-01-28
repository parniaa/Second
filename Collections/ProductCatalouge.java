/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductCatalouge implements Iterable<Product> {

    private final Set<Product> products = new HashSet<>();
    public Iterator<Product> iterator(){return products.iterator();}

}

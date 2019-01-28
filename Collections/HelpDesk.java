/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class HelpDesk {

    private final Queue<Enquiry> enquiryQueue =  new ArrayDeque<>();

    public void enquire (final Customer customer, final Category category)
    {
        enquiryQueue.offer(new Enquiry(customer,category));
    }
    public void processAllEnguirires()
    {
        while (!enquiryQueue.isEmpty())
        {
            final Enquiry enquiry = enquiryQueue.remove();
            enquiry.getCustomer().reply("hi why");
        }
    }

    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();
        helpDesk.enquire(Customer.Armin, Category.COMPUTER);
        helpDesk.enquire(Customer.Ailin, Category.Tablet);
        helpDesk.processAllEnguirires();
    }
}

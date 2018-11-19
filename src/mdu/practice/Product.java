package mdu.practice;
/* Create a system for an online shop that is  responsible for displaying products that  have been purchased on the shop.
 * The system should be able to also add (inject) a dependency for the packaging of the purchased
 */

public interface Product
{
    public String displayProductDescription();
    public String getBox();
}

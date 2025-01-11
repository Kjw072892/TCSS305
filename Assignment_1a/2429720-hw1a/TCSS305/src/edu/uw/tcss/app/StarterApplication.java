package edu.uw.tcss.app;

import edu.uw.tcss.model.StoreItem;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A driver class for this application.
 *
 * @author Charles Bryan
 * @version Winter 2025
 */
public final class StarterApplication {

    /**
     * A Logger object for all your logging needs.
     * You should move away from using System.out.println as your logging/debugging method.
     */
    public static final Logger LOGGER = Logger.getLogger(StarterApplication.class.getName());

    static {
        // Level.ALL - Display ALL logging messages
        // Level.OFF - Display NO logging messages
        LOGGER.setLevel(Level.ALL);
    }

    /**
     * Prevents the instantiation of the StarterApplication class.
     */

    private StarterApplication() {
        super();
    }

    /**
     * The entry point into this application.
     *
     * @param theArgs the command-line arguments for this program.
     */
    public static void main(final String[] theArgs) {

        LOGGER.info(() -> "I graduated from Tacoma Community College last quarter and I "
                + "recieved my AA in computer science!");

        LOGGER.info(() -> "I took CS 142/ CS 143 at Tacoma Community College during my second "
                + "and third quarter of my freshman year!");

        LOGGER.info(() -> "I am a Marine Corps veteran as well as a Navy Reserve Veteran!");

        LOGGER.info(() -> " I served a total of 10 years; 4 years as a Religious Program "
                + "Specilist in the Navy, and 6 years as a Radio Operator in the Marines!");

    }

    /**
     * Method isBlue checks if parameter is BLUE or blue and returns true, else returns false.
     *
     * @param theInput a string input of a color.
     * @return returns true if theInput == blue or BLUE.
     */

    public static boolean isBlue(final String theInput) {
        return "BLUE".equalsIgnoreCase(theInput);
    }

    /**
     * Method totalPrice ((Not)Extra Credit) iterates through the theStoreItemObjects array,
     * retrieves and sums up all the getPrice() return values from the the passed object and
     * returns a value, of type Bigdecimal, denoting the total price of all the objects passed.
     *
     * @param theStoreItemObjects an object of of StoreItem
     * @return value of total price from the objects passed
     */

    public static BigDecimal totalPrice(final StoreItem ... theStoreItemObjects) {
        return 0 == theStoreItemObjects.length ? BigDecimal.ZERO
                : Arrays.stream(theStoreItemObjects).
                map(StoreItem::getMyPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}

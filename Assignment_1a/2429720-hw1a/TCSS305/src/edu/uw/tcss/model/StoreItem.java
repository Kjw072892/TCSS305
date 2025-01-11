
package edu.uw.tcss.model;

import java.math.BigDecimal;

/**
 * @author Kassie Whitney (2429720)
 * @version 2429720-assignment1a-1.3
 */

public final class StoreItem implements Item {
    /**
     * The name of the store item object.
     */

    private final String myName;

    /**
     * The price of the store item object (individual item price).
     */

    private final BigDecimal myPrice;

    /**
     *  The number of items in bulk.
     */

    private int myBulkQuantity;

    /**
     *  The price of the bulk items.
     */

    private BigDecimal myBulkPrice = BigDecimal.ZERO;

    /**
     *  Determines if the store item is bulk or not.
     */

    private boolean myIsBulk;

    /**
     *
     * Constructor for class StoreItem.
     *
     * @param theName theName of the store item.
     * @param thePrice the thePrice of the store item.
     * @throws IllegalArgumentException ensures that arguments are valid as the param.
     * @throws NullPointerException throws a null pointer exception if null is passed as param.
     */


    public StoreItem(final String theName, final BigDecimal thePrice)
            throws IllegalArgumentException, NullPointerException {

        super();

        if (theName.isEmpty() || 0 > thePrice.doubleValue()) {
            throw new IllegalArgumentException();
        }

        myName = theName;
        myPrice = thePrice;

    }

    /**
     *
     * Overloaded constructor for class StoreItem.
     *
     * @param theName theName of the store item
     * @param thePrice the thePrice of the store item
     * @param theBQ the number of items in bulk
     * @param theBP the thePrice of the items in bulk
     * @throws IllegalArgumentException ensures that arguments are valid as the param
     * @throws NullPointerException throws a null pointer exception if null is passed as param
     */

    public StoreItem(final String theName, final BigDecimal thePrice, final int theBQ,
                     final BigDecimal theBP)
            throws IllegalArgumentException, NullPointerException {
        super();
        if (0 > thePrice.doubleValue() || 0 > theBQ || theName.isEmpty() || 0
                > theBP.doubleValue()) {
            throw new IllegalArgumentException();
        }

        myName = theName;
        myPrice = thePrice;
        myBulkQuantity = theBQ;
        myBulkPrice = theBP;
        myIsBulk = true;

    }


    @Override
    public String getMyName() {
        return myName;
    }



    @Override
    public BigDecimal getMyPrice() {
        return myPrice;
    }


    @Override
    public int getMyBulkQuantity() {
        return myBulkQuantity;
    }


    @Override
    public BigDecimal getMyBulkPrice() {
        return myBulkPrice;
    }


    @Override
    public boolean isBulk() {
        return myIsBulk;
    }

}

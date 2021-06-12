package com.company;
import java.util.SortedMap;

/***
 * This is class E_Wallet
 * This class is used to create electronic wallet for any system user
 * This class is responsible for keeping the owner balance and transfer and draw money
 * @author Kerllose George Jack
 * @version 1.0
 * @since 10/6/2021
 */
public class E_Wallet {
    private float balance;
    private String ownerID;
    private String walletID;

    /***
     * This is default constructor
     */
    public E_Wallet() {
        this.balance = 0;
        this.ownerID = null;
        this.walletID=null;
    }

    /***
     *
     * @param ownerID
     * @param walletID
     */
    public E_Wallet(String ownerID, String walletID) {
        this.balance = 0;
        this.ownerID = ownerID;
        this.walletID = walletID;
    }

    /***
     * Sets balance value
     * @param balance
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }

    /***
     * Gets balance value
     * @return balance
     */
    public float getBalance() {
        return balance;
    }

    /***
     * Sets owner ID
     * @param ownerID
     */
    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    /***
     * Gets owner ID
     * @return ownerID
     * @param playerID
     */
    public String getOwnerID(String playerID) {
        return ownerID;
    }

    /***
     * Sets wallet ID
     * @param walletID
     */
    public void setWalletID(String walletID) {
        this.walletID = walletID;
    }

    /***
     * Gets wallet ID
     * @return walletID
     */
    public String getWalletID() {
        return walletID;
    }

    /***
     * This function add to the balance of the wallet the value of the charge
     * @param charge
     */
    public void addBalance(float charge) {
        balance += charge;
    }

    /***
     * This function allowes to the wallet owner to draw money
     * @param withdraw
     * @return withdraw
     */
    public float Withdraw(float withdraw) {
        if (balance>=withdraw) {
            balance -= withdraw;
            System.out.println("Your cash withdrawal was successful = "+withdraw);
            System.out.println("Your balance = "+balance);
            return withdraw;
        }
        else{
            System.out.println("Your cash withdrawal was unsuccessful ");
            System.out.println("Your balance = "+balance+" is not enough ya poor");
            return 0;
        }
    }
}


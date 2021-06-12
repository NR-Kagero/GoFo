package com.company;

import java.util.Date;

/***
 * This is request class
 * when player want to book a playground an object is created and given the requested
 * request will take requested playground data and will add all data to request fields
 * @author Kerllose George
 * @version 1.0
 * @since 9/6/2021
 */
public class Request {
    private String playgroundName;
    private String location;
    private String date;
    private float price;
    private float hourPrice;
    private int teamSize;
    private float time;
    private String state;

    /***
     * This is default constructor
     */
    public Request() {
        this.playgroundName = null;
        this.location = null;
        this.date = null;
        this.hourPrice = 0;
        this.time = 0;
        this.state = "Pending";
    }

    /***
     * This constructor sets the value for specific fields of the request
     * other fields is set by the player
     * @param playgroundName
     * @param location
     * @param date
     * @param hourPrice
     * @param rating
     * @param time
     */
    public Request(String playgroundName, String location, String date, float hourPrice, float rating, float time) {
        this.playgroundName = playgroundName;
        this.location = location;
        this.date = date;
        this.hourPrice = hourPrice;
        this.time = time;
        this.state = "Pending";
    }

    /***
     * This constructor takes playground and sets its data for the request fields
     * other data is set by the player
     * @param playground
     */
    public Request(Playground playground) {
        if (playground.getStatePlayground().equals("Active")) {
            this.playgroundName = playground.getNamePlayground();
            this.location = playground.getLocation();
            this.hourPrice = playground.getPrice();
            this.state = "Pending";
        } else {
            System.out.println("This playground is not active\nRequest is canceled");
            return;
        }
    }

    /***
     * Set value for playground name
     * @param playgroundName
     */
    public void setPlaygroundName(String playgroundName) {
        this.playgroundName = playgroundName;
    }

    /***
     * Get the playground name value
     * @return playgroundName
     */
    public String getPlaygroundName() {
        return playgroundName;
    }

    /***
     * Sets location value
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /***
     * Gets the location value
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /***
     * Sets date to play the booking at
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /***
     * Gets date of the booking request
     * @return date
     */
    public String getDate() {
        return date;
    }

    /***
     * Gets the hour price of this playground
     * @return hourPrice
     */
    public float getHourPrice() {
        return hourPrice;
    }

    /***
     * Sets the hour price of the requested playground
     * @param hourPrice
     */
    public void setHourPrice(float hourPrice) {
        this.hourPrice = hourPrice;
    }


    /***
     * Sets the price of the booking
     * @param price
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /***
     * Gets price of the booking
     * @return price
     */
    public float getPrice() {
        price = hourPrice * time;
        return price;
    }

    /***
     * Sets the team size
     * @param size
     */
    public void setSize(int size) {
        teamSize = size;
    }

    /***
     * Gets teamSize value
     * @return teamSize
     */
    public int getSize() {
        return teamSize;
    }

    /***
     * Sets time player requested to play at
     * @param time
     */
    public void setTime(float time) {
        this.time = time;
    }

    /***
     * Gets the time player requested to play at
     * @return time
     */
    public float getTime() {
        return time;
    }

    /***
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /***
     * Gets request state
     * @return
     */
    public String getState() {
        return state;
    }

    /***
     * This function is used to change the request state to accept
     */
    public void AcceptRequest() {
        state = "Accepted";
    }

    /***
     * This function is used to change the request state to Rejected
     */
    public void RejectRequest() {
        state = "Rejected";
    }
}
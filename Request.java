package com.company;

import java.util.Date;

/***
 * This is request class
 * when player want to book a playground an object is created and given the requested
 * request will take requested playground data and will add all data to request fields
 * @author Kerllose George
 * @version 1.0
 * @since 7/6/2021
 */
public class Request {
    private String playgroundName;
    private String Location;
    private String Date;
    private float Price;
    private float hourPrice;
    private float Rating;
    private int teamSize;
    private float time;

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
        Location = location;
        Date = date;
        this.hourPrice = hourPrice;
        Rating = rating;
        this.time = time;
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
        Location = location;
    }

    /***
     * Gets the location value
     * @return Location
     */
    public String getLocation() {
        return Location;
    }

    /***
     * Sets date to play the booking at
     * @param date
     */
    public void setDate(String date) {
        Date = date;
    }

    /***
     * Gets date of the booking request
     * @return Data
     */
    public String getDate() {
        return Date;
    }

    /***
     * Gets the hour price of this playground
     * @return
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
        Price = price;
    }

    /***
     * Gets price of the booking
     * @return Price
     */
    public float getPrice() {
        Price = hourPrice * time;
        return Price;
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
     * Sets Rating value
     * @param rating
     */
    public void setRating(float rating) {
        Rating = rating;
    }

    /***
     * Gets the playground rating
     * @return Rating
     */
    public float getRating() {
        return Rating;
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
     * @return Time
     */
    public float getTime() {
        return time;
    }

    /*
    /**
     * This function to help the player to search for specific playground
     *
     * @param namePlayground
     * @param Size
     * @param location
     * @param cancelTime
     * @param weekDay
     * @param Rating
     * @return Playground
     */
    /*
    Playground Search(String namePlayground, int Size=0, String location, float cancelTime, String weekDay, float Rating) {
        Playground
    }
    */
}

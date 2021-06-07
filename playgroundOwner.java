/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw_4;

import java.util.ArrayList;

/**
 * This is playgroundOwner class is used to create account of playgroundOwner
 * and take all information and know his playgrounds.
 *
 * @author Mahmoud Abd El-Ghnay
 * @version 1.0
 * @since 9/6/2021
 */
public class playgroundOwner {

    private String firstName;
    private String lastName;
    private String  nationalId;
    private String Address;
    private String phoneNumber;
    private String E_mail;
    private String Password;
    private String userName;
    private String birthDay;
    private String Gender;
    private int Age;    
   // private Playground Playgrounds;

    /**
     * Default Constructor to set  playgroundOwner data with initial value =0 and null. 
     */
    public playgroundOwner() {
        this.firstName = null;
        this.lastName = null;
        this.Age = 0;
        this.Address = null;
        this.phoneNumber = null;
        this.E_mail = null;
        this.Password = null;
        this.userName = null;
        this.birthDay = null;
        this.Gender = null;
    }

    /**
     * parameterize constructor to set value of firstName, lastName, Age, Address, phoneNumber, E_mail, Password, userName, Gender.
     * @param firstName playgroundOwner firstName
     * @param lastName playgroundOwner lastName 
     * @param Age playgroundOwner age.
     * @param Address playgroundOwner address.
     * @param phoneNumber playgroundOwner phone number.
     * @param E_mail playgroundOwner E_mail.
     * @param Password playgroundOwner password.
     * @param userName playgroundOwner user name.
     * @param birthDay playgroundOwner birth day.
     * @param Gender playgroundOwner gender.
     * 
     */
    public playgroundOwner(String firstName, String lastName, int Age, String Address, String nationalId ,String phoneNumber, String E_mail, String Password, String userName, String birthDay, String Gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Age = Age;
        this.Address = Address;
        this.nationalId = nationalId;
        this.phoneNumber = phoneNumber;
        this.E_mail = E_mail;
        this.Password = Password;
        this.userName = userName;
        this.birthDay = birthDay;
        this.Gender = Gender;
    }
    
    /**
     * This function to assign value to playground owner  first name
     * @param firstName the first name of playground
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This function to assign value to playground owner  last name
     * @param lastName the last name of playground
     */
    public void setLasttName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This function to assign value to playground owner Age
     * @param Age the age of playground
     */
    public void setAge(int Age) {
        this.Age = Age;
    }

    /**
     * This function to assign value to playground national ID
     * @param nationalId the national ID of playground
     */
    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    
    /**
     * This function to assign value to playground owner Address
     * @param Address the address of playground
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * This function to assign value to playground owner  phoneNumber
     * @param phoneNumber the phone number of playground
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * This function to assign value to playground owner  E_mail
     * @param E_mail the E_mail of playground
     */
    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    /**
     * This function to assign value to playground owner  Password
     * @param Password the password of playground
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * This function to assign value to playground owner userName
     * @param userName the username of playground
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This function to assign value to playgroundOwner birthDay
     * @param birthDay the birth day of playground
     */
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * This function to assign value to playgroundOwner Gender
     * @param Gender the gender of playground
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * This function return playground owner's first name
     * @return firstName playground owner's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This function return playground owner's last name
     * @return lastName playground owner's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This function return playground owner's age
     * @return Age playground owner's age
     */
    public int getAge() {
        return Age;
    }

    /**
     * This function return playground owner's national ID
     * @return nationalId playground owner's national ID
     */
    public String getNationalId() {
        return nationalId;
    }

    
    /**
     * This function return playground owner's address
     * @return Address playground owner's address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * This function return playground owner's phone number
     * @return phoneNumber playground owner's phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This function return playground owner's E_mail
     * @return E_mail playground owner's E_mail
     */
    public String getE_mail() {
        return E_mail;
    }

    /**
     * This function return playground owner's password
     * @return Password playground owner's Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * This function return playground owner's Username
     * @return userName playground owner's Username
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This function return playground owner's birthday
     * @return birthDay playground owner's birthday
     */
    public String getBirthDay() {
        return birthDay;
    }

    /**
     * This function return playground owner's gender
     * @return Gender playground owner's gender(
     */
    public String getGender() {
        return Gender;
    }

    @Override
    public String toString() {
        return "playgroundOwner{" + "firstName=" + firstName + ", lastName=" + lastName + ", nationalId=" + nationalId + ", Address=" + Address + ", phoneNumber=" + phoneNumber + ", E_mail=" + E_mail + ", Password=" + Password + ", userName=" + userName + ", birthDay=" + birthDay + ", Gender=" + Gender + ", Age=" + Age + '}';
    }
    
    
    
}

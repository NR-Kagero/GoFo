package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the main class
 * @author Mahmoud abd El-Ghany
 * @version 1.0
 * @since 9/6/2012
 */
public class Main {

    static ArrayList<playgroundOwner> list_Owner = new ArrayList<playgroundOwner>();
    static ArrayList<Player> list_player = new ArrayList<Player>();
    static ArrayList<Playground> list_Playground = new ArrayList<Playground>();
    static ArrayList list = new ArrayList();

    /**
     * This is main function
     *
     * @param args the command line argument
     */
    public static void main(String[] args) {



        String f_Name, l_Name, national, address, mail, username, password, birthDay, gender, phone;
        String namePlayground, playgroundLocation, weekDay, Timeplayground;
        int age, Sizeplayground;
        float Priceplayground, cancelTime;
        double cancelationPrice;

        playgroundOwner Owner;
        Playground playground;
        Player player;
        Scanner input = new Scanner(System.in);
        Scanner input_l = new Scanner(System.in);



        int enter = 0;

        while (enter != 3) {

            System.out.println("1- playground owner.\n2- Player.\n3- Exit.");
            enter = input.nextInt();
            switch (enter) {
                case 1:
                    System.out.println("playground owner sign up");

                    System.out.println("Enter first name:");
                    f_Name = input.next();

                    System.out.println("Enter last name:");
                    l_Name = input.next();

                    System.out.println("Enter age:");
                    age = input.nextInt();

                    System.out.println("Enter Address:");
                    address = input_l.nextLine();

                    System.out.println("Enter national ID:");
                    national = input.next();

                    System.out.println("Enter phone:");
                    phone = input.next();

                    System.out.println("Enter E_mail:");
                    mail = input.next();

                    System.out.println("Enter username:");
                    username = input_l.nextLine();

                    System.out.println("Enter password:");
                    password = input_l.nextLine();

                    System.out.println("Enter birth day:");
                    birthDay = input_l.nextLine();

                    System.out.println("Enter gender:");
                    gender = input.next();

                    Owner = new playgroundOwner(f_Name, l_Name, age, address, national, phone, mail, username, password, birthDay, gender);
                    list_Owner.add(Owner);

                    System.out.println("registration of the playground");
                    System.out.println("Playground name");
                    namePlayground = input_l.nextLine();

                    System.out.println("Playground cancelationPrice");
                    cancelationPrice = input.nextDouble();

                    System.out.println("Playground Size");
                    Sizeplayground = input.nextInt();

                    System.out.println("Playground Price");
                    Priceplayground = input.nextFloat();

                    System.out.println("Playground location");
                    playgroundLocation = input_l.nextLine();

                    System.out.println("Playground cancelTime");
                    cancelTime = input.nextFloat();

                    System.out.println("Playground weekDay");
                    weekDay = input.next();

                    System.out.println("Playground Time");
                    Timeplayground = input.nextLine();

                    playground = new Playground(namePlayground, cancelationPrice, Sizeplayground, Priceplayground, playgroundLocation, cancelTime, weekDay, Timeplayground);

                    Owner.addPlayground(playground);
                    list_Playground.add(playground);

                    System.out.println(list_Owner);

                    break;

                case 2:
                    System.out.println("playground owner sign up");
                    System.out.println("Enter first name:");
                    f_Name = input.next();

                    System.out.println("Enter last name:");
                    l_Name = input.next();

                    System.out.println("Enter E_mail:");
                    mail = input.next();

                    System.out.println("Enter username:");
                    username = input_l.nextLine();

                    System.out.println("Enter password:");
                    password = input_l.nextLine();

                    System.out.println("Enter phone number:");
                    phone = input.next();

                    System.out.println("Enter gender:");
                    gender = input.next();

                    System.out.println("Enter age:");
                    age = input.nextInt();

                    player = new Player(f_Name, l_Name, mail, username, password, phone, gender, age);

                    list_player.add(player);

                    System.out.println(list_player);
                    Playground[] playgroundArray = new Playground[list_Playground.size()];
                    list_Playground.toArray(playgroundArray);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Wrong number! try again");
            }
        }
    }
}

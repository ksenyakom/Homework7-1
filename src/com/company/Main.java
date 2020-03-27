package com.company;

import com.company.classes.Address;
import com.company.classes.Customer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        // List
        ArrayList<Customer> baseList = new ArrayList<Customer>(init());
        printCollection(baseList,"Коллекция ArrayList");
        // Set
        HashSet<Customer> baseSet = new HashSet<Customer>(init());
        printCollection(baseSet,"\n Коллекция HashSet");


    }

    public static ArrayList init(){
        Address address1 = new Address("Минск", "Победителей", 5);
        Address address = new Address("Минск", "Победителей", 1, 1);
        Customer c1 = new Customer("Вася", "Пупкин", 33, address1);
        Customer c2 = new Customer("Катя", "Пупкина", 30,address);
        Customer c3 = new Customer("Аполлон", "Пупкин", 45);
        Customer c4 = new Customer("Аполлон", "Пупкин", 45);
        ArrayList<Customer> base = new ArrayList<Customer>();
        base.add(c1);
        base.add(c2);
        base.add(c3);
        base.add(c4);
        return base;
    }
    public static void printCollection(Collection base, String message) {
        System.out.println(message);
        for (Object b : base) {
            System.out.println(b);
        }
    }

}

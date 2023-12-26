package com.example;

import com.example.task3.Brandfetch;
import com.example.task3.Company;

public class Main {
    public static void main(String[] args) {
        Company company = Brandfetch.fetch("amazon");
        System.out.println("Company logo " + company.logo);
        System.out.println("Domain " + company.website);
        System.out.println("Name " + company.name);

    }
}
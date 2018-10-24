package com.fges.rizomm.m1.zoo.persons;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee extends Person{

    private List<String> materials = new ArrayList<>();
    private Double salary;

    private Employee manager;

}

package com.fges.rizomm.m1.zoo.persons;

import com.fges.rizomm.m1.zoo.places.impl.Places;

public class Cleaner<T extends Places> extends Employee {

    public String clean(T place) {
        if (place.isEmpty()){
            place.clean();
            return "La cage a été nettoyé";
        }else{
            return "La cage n\'est pas vide, Impossible de la nettoyer !";
        }
    }
}

package kz.epam.main;

import kz.epam.entity.Entity;

/**
 * Created by munar on 2/3/17.
 */
public class Planet extends Entity{

    public Planet(String name){
        super(name);
    }

    @Override
    public String toString(){
        return getName();
    }
}

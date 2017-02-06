package kz.epam.main;

import kz.epam.entity.Entity;

import java.util.ArrayList;

/**
 * Created by munar on 2/3/17.
 */
public class Universe extends Entity{
    ArrayList<Galaxy> galaxies = new ArrayList<Galaxy>();

    public Universe(String name){
        super(name);
    }

    public void addGalaxy(Galaxy galaxy){
        galaxies.add(galaxy);
    }

    public void addGalaxy(String name){
        galaxies.add(new Galaxy(name));
    }

    public void addGalaxies(ArrayList galaxies){
        this.galaxies = galaxies;
    }

    public ArrayList<Galaxy> getGalaxies(){
        return galaxies;
    }

    public Galaxy getGalaxyByName(String name){
        for (Galaxy galaxy: galaxies){
            if (galaxy.getName().equals(name)){
                return galaxy;
            }
        }
        return null;
    }

    public System getSystemByName(String name){
        for (Galaxy galaxy: galaxies){
            System system = galaxy.getSystemByName(name);
            if (system != null){
                return system;
            }
        }
        return null;
    }

    public void removeGalaxyByName(String name){
        Galaxy galaxy = getGalaxyByName(name);
        if (galaxy != null){
            galaxies.remove(galaxy);
        }
    }

    @Override
    public String toString(){
        return "Вселенная "+getName() + "\nКоличество галактик: " +galaxies.size()+"\n"+ galaxies;
    }

}

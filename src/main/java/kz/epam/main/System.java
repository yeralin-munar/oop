package kz.epam.main;

import kz.epam.entity.Entity;
import java.util.ArrayList;
/**
 * Created by munar on 2/3/17.
 */
public class System extends Entity{
    ArrayList<Planet> planets = new ArrayList<Planet>();
    ArrayList<Star> stars = new ArrayList<Star>();

    public System(String name){
        super(name);
    }

    public String getName(){
        return super.getName();
    }

    public void addPlanet(Planet planet){
        planets.add(planet);
    }

    public void addPlanet(String name){
        planets.add(new Planet(name));
    }

    public void addStar(Star star){
        stars.add(star);
    }

    public void addStar(String name){
        stars.add(new Star(name));
    }

    public ArrayList<Planet> getPlanets(){
        return planets;
    }

    public ArrayList<Star> getStars(){
        return stars;
    }

    public Planet getPlanetByName(String name){
        for (Planet planet: planets){
            if (planet.getName().equals(name)){
                return planet;
            }
        }
        return null;
    }

    public Star getStarByName(String name){
        for (Star star: stars){
            if (star.getName().equals(name)){
                return star;
            }
        }
        return null;
    }

    public void removePlanetByName(String name){
        Planet planet = getPlanetByName(name);
        if (planet != null){
            planets.remove(planet);
        }
    }

    public void removeStarByName(String name){
        Star star = getStarByName(name);
        if (star != null){
            stars.remove(star);
        }
    }

    @Override
    public String toString(){
        return "Система "+getName()+
                "\nКоличество звезд: "+ stars.size()+
                "\nКоличество планет: "+ planets.size()+
                "\nЗвезды: "+ stars+
                "\nПланеты: "+planets;
    }
}

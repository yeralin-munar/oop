package kz.epam.factrory;

import java.util.ArrayList;

import kz.epam.main.*;
import kz.epam.main.System;

/**
 * Created by munar on 2/6/17.
 */
public class SpaceFactory {

    private Universe universe;

    private String[] galaxy_names = new String[]{"Млечный путь", "Центавра"};
    private String[] system_names = new String[]{"Солнечная система", "Альфа Центавра"};
    private String[] solar_system_star = new String[]{"Солнце"};
    private String[] centaur_system_star = new String[]{"Альфа Центаврра A", "Альфа Центаврра B", "Проксима Центавра"};
    private String[] solar_system_planets = new String[]{
            "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"
    };
    private String[] centaur_system_planets = new String[]{
            "Альфа Центавра B b"
    };

    public SpaceFactory(){
        universe = new Universe("One");
        addGalaxies(universe, galaxy_names);

        addSystemToGalaxy(universe, galaxy_names[0], system_names[0]);
        addPlanetsToSystem(universe, galaxy_names[0], system_names[0], solar_system_planets);
        addStarsToSystem(universe, galaxy_names[0], system_names[0], solar_system_star);

        addSystemToGalaxy(universe, galaxy_names[1], system_names[1]);
        addPlanetsToSystem(universe, galaxy_names[1], system_names[1], centaur_system_planets);
        addStarsToSystem(universe, galaxy_names[1], system_names[1], centaur_system_star);
    }

    public Universe getUniverse(){
        return universe;
    }

    private void addGalaxies(Universe universe, String[] galaxy_names){
        for (String galaxy: galaxy_names){
            universe.addGalaxy(new Galaxy(galaxy));
        }
    }

    private void addSystemToGalaxy(Universe universe, String name, String system_name ){
            universe.getGalaxyByName(name).addSystem(system_name);
    }


    private void addPlanetsToSystem(Universe universe, String galaxy_name, String system_name, String[] planet_names ){
        System system = universe.getGalaxyByName(galaxy_name).getSystemByName(system_name);
        for (String planet: planet_names){
            if (system != null) {
                system.addPlanet(planet);
            }
        }
    }

    private void addStarsToSystem(Universe universe, String galaxy_name, String system_name, String[] star_names ){
        System system = universe.getGalaxyByName(galaxy_name).getSystemByName(system_name);
        for (String star: star_names){
            if (system != null) {
                system.addStar(star);
            }
        }
    }

}

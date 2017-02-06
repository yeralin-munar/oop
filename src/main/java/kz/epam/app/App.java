package kz.epam.app;

import kz.epam.factrory.SpaceFactory;
import kz.epam.main.Universe;
import kz.epam.presentation.UniversePresentation;

/**
 * Created by munar on 2/6/17.
 */
public class App {
    public static void main(String[] args) {
        SpaceFactory spaceFactory = new SpaceFactory();
        Universe universe = spaceFactory.getUniverse();
        UniversePresentation universePresentation = new UniversePresentation(universe);

        universe.getGalaxyByName("Млечный путь").getSystemByName("Солнечная система").addPlanet("Нептун 2");

        System.out.println(universePresentation);
    }
}

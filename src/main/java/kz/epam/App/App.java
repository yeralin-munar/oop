package kz.epam.App;

import kz.epam.factrory.SpaceFactory;
import kz.epam.main.Universe;

/**
 * Created by munar on 2/6/17.
 */
public class App {
    public static void main(String[] args) {
        SpaceFactory spaceFactory = new SpaceFactory();
        Universe universe = spaceFactory.getUniverse();

        System.out.println(universe);
    }
}

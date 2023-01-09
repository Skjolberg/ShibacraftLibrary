package net.shibacraft.library.utils;

import lombok.experimental.UtilityClass;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

@UtilityClass
public class SLString {

    /**
     * Convert a location to String
     *
     * @param location  Location
     * @return          location as String
     */
    public String locationToString(Location location) {
        World world = location.getWorld();
        return world == null ? "" : world.getName() + ";" + (int) location.getX() + ";" + (int) location.getY() + ";" +
                (int) location.getZ();
    }

    /**
     * Convert a String to location
     *
     * @param str   String
     * @return      location
     */
    public Location stringToLocation(String str) {
        String[] arr = str.split(";");
        return new Location(Bukkit.getWorld(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]),
                Integer.parseInt(arr[3]));
    }

    /**
     * Convert a location to coordinates.
     * The +1 in "Y" is for when teleporting to that area to appear at the appropriate height.
     *
     * @param location      Location
     * @return              string as coordinates
     */
    public String locationToCoords(Location location){
        World world = location.getWorld();
        int y = (int) (location.getY()+1);
        return world == null ? "" : (int) location.getX() + " " + y + " " + (int) location.getZ();
    }

    /**
     * Convert a location to coordinates with commas
     *
     * @param location      Location
     * @return              string as coordinates
     */
    public String locationToCoordsCommas(Location location){
        World world = location.getWorld();
        return world == null ? "" : (int) location.getX() + ", " + (int) location.getY() + ", " + (int) location.getZ();
    }

}

package mcjty.lostcities.dimensions.world.lost;

import mcjty.lostcities.dimensions.world.lost.cityassets.CityStyle;

public class CityInfo {
    public boolean isCity;
    public boolean hasBuilding;
    public int section;            // -1 if single building, else part of multi building
    public int cityLevel;
    public CityStyle cityStyle;
}

package com.company.Module8Assignment1.MusicalInstrument;

/**
 * Created by lionliliya on 19.01.16.
 */
public class MusicalInstrument implements Comparable {

    private String name;
    private String manufacturerCountry;
    private short yearOfProduction;
    private String status;

    public MusicalInstrument(String name, String manufacturerCountry, short yearOfProduction, String status) {
        this.name = name;
        this.manufacturerCountry = manufacturerCountry;
        this.yearOfProduction = yearOfProduction;
        this.status = status;
    }

    public void printInfo() {
        System.out.printf("%5s%-30s%-30s%-30d%-30s", "", this.getName(), this.getManufacturerCountry(), this.getYearOfProduction(), this.getStatus());
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public short getYearOfProduction() {
        return yearOfProduction;
    }

    public String getStatus() {
        return status;
    }

    /**sorting in ascending order by
    * year of production **/
    @Override
    public int compareTo(Object o) {
       // MusicalInstrument temp = (MusicalInstrument)o;
        if (this.getYearOfProduction() == ((MusicalInstrument) o).getYearOfProduction())
            return 0;
        if (this.getYearOfProduction() > ((MusicalInstrument) o).getYearOfProduction())
            return 1;
        else return -1;
    }
}

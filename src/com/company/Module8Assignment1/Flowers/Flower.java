package com.company.Module8Assignment1.Flowers;

/**
 * Created by lionliliya on 19.01.16.
 */
public class Flower implements Comparable {

    private String name;
    private String color;
    private int height;

    public Flower(String name, String color, int height) {
        this.name = name;
        this.color = color;
        this.height = height;
    }

    public void printInfo() {
        System.out.printf("%5s%-18s%-14s%-12s", "", this.getName(), this.getColor(), this.getHeight());
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }


    /**sorting in ascending order by
     * height of flower **/
    @Override
    public int compareTo(Object o) {
       // Flower temp = (Flower) o;
        if (this.getHeight() == ((Flower) o).getHeight())
            return 0;
        if (this.getHeight() > ((Flower) o).getHeight())
            return 1;
        else return -1;

        }
}

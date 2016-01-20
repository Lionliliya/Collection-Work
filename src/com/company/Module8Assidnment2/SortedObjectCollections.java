package com.company.Module8Assidnment2;

import com.company.Module8Assignment1.Files.File;
import com.company.Module8Assignment1.Flowers.Flower;
import com.company.Module8Assignment1.MusicalInstrument.MusicalInstrument;

import java.util.Set;

import java.util.TreeSet;

/**
 * Created by lionliliya on 19.01.16.
 */
public class SortedObjectCollections {

    private Set<MusicalInstrument> instruments;
    private Set<Flower> flowers;
    private Set<File> files;


    public SortedObjectCollections() {
        this.instruments = new TreeSet<>();
        this.flowers = new TreeSet<>();
        this.files = new TreeSet<>();
    }

    /**methods for adding objects to different
     * 3 sorted collections**/
    public void addFlower (Flower flower) {
        flowers.add(flower);
    }
    public void addFile (File file) {
        files.add(file);
    }
    public void addInstrument (MusicalInstrument instrument) {
        instruments.add(instrument);
    }

    /**methods for printing info about objects
     * in different 3 sorted collections**/
    public void printFlowers() {
        flowers.stream()
                   .forEach(f -> f.printInfo());

    }
    public void printInstruments() {
        instruments.stream()
                .forEach(instrument -> instrument.printInfo());
    }
    public void printFiles() {
        files.stream()
                .forEach(file -> file.printInfo());
    }

    public Set<MusicalInstrument> getInstruments() {
        return instruments;
    }

    public Set<Flower> getFlowers() {
        return flowers;
    }

    public Set<File> getFiles() {
        return files;
    }
}

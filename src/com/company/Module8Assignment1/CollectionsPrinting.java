package com.company.Module8Assignment1;

import com.company.Module8Assignment1.Files.File;
import com.company.Module8Assignment1.Flowers.Flower;
import com.company.Module8Assignment1.MusicalInstrument.MusicalInstrument;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lionliliya on 19.01.16.
 */
public class CollectionsPrinting {

    private List<Flower> flowerList;
    private List<File> fileList;
    private List<MusicalInstrument> instrumentList;

    public CollectionsPrinting() {
        this.flowerList = new ArrayList<>();
        this.fileList = new ArrayList<>();
        this.instrumentList = new ArrayList<>();
    }

    /**methods for adding objects to different
     * 3 sorted collections**/
    public void addFlower(Flower flower) {
        flowerList.add(flower);
    }

    public void addFile(File file) {
        fileList.add(file);
    }

    public void addInstrument (MusicalInstrument instrument) {
        instrumentList.add(instrument);
    }

    /**methods for printing info in table view about objects
     * in different 3 sorted collections**/
    public void printAllFlowers() {
       System.out.printf("%8s%-15s%-12s%-16s", "", "Name", "Color", "Height");
       System.out.println("\n----------------------------------------------");
       flowerList
               .stream()
               .forEach(flower -> flower.printInfo());
    }

    public void printAllFiles() {
       System.out.printf("%5s%-26s%-26s%-23s%-23s%-23s", "", "Name", "Type", " Size, kb", " Author", "Date");
       System.out.println("\n---------------------------------------------------------------------------------------------------------------");
       fileList
               .stream()
               .forEach(file -> file.printInfo());
    }

    public void printAllInstruments() {
       System.out.printf("%5s%-30s%-30s%-30s%-30s", "", "Name", "Country of production", "Year", "Status");
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------");
        instrumentList
               .stream()
               .forEach(instrument -> instrument.printInfo());
    }

    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public List<MusicalInstrument> getInstrumentList() {
        return instrumentList;
    }
}

package com.company.Module8Assignment1;

import com.company.Module8Assignment1.MusicalInstrument.*;
import com.company.Module8Assignment1.Flowers.*;
import com.company.Module8Assignment1.Files.*;
import java.util.Date;

/**
 * Created by lionliliya on 19.01.16.
 */
public class Main {
    public static void main(String[] args) {


        CollectionsPrinting collectionsPrinting = new CollectionsPrinting();

        collectionsPrinting.addFlower(new Rose("Tea-rose", "Peach", 20));
        collectionsPrinting.addFlower(new Aster("Aster Tatar", "Red", 30));
        collectionsPrinting.addFlower(new Tulip("Late Tulip", "Red", 25));
        collectionsPrinting.addFlower(new Camomile("Wild camomile", "Peach", 20));
        collectionsPrinting.addFlower(new Rose("Peony rose", "Peach", 20));

        collectionsPrinting.addFile(new TextFile("Core Java Volume I", "book", 500, "Horstmann", new Date(20/11/2007)));
        collectionsPrinting.addFile(new AudioFile("I Miss You", "song", 4500, "Adele", new Date(03/04/2011)));
        collectionsPrinting.addFile(new ImageFile("On Phi Phi beach", "photo", 3200, "Nikon D3200", new Date(26/07/2015)));

        collectionsPrinting.addInstrument(new Trumpet("Bass Trumpet", "Ukraine", (short) 1998, "old, post-consumed"));
        collectionsPrinting.addInstrument(new Piano("Yamaha YDP-142B", "Japan", (short) 2014, "new"));
        collectionsPrinting.addInstrument(new Guitar("Maxtone WGC4011", "China", (short) 2015, "new"));

        System.out.println("All flowers\n");
        collectionsPrinting.printAllFlowers();
        System.out.println();
        System.out.println("All files\n");
        collectionsPrinting.printAllFiles();
        System.out.println();
        System.out.println("All instruments\n");
        collectionsPrinting.printAllInstruments();

    }

}

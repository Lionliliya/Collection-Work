package com.company.Module8Assidnment2;


import com.company.Module8Assignment1.Files.*;
import com.company.Module8Assignment1.Flowers.*;
import com.company.Module8Assignment1.MusicalInstrument.*;

import java.util.Date;

/**
 * Created by lionliliya on 20.01.16.
 */
public class Main {
    public static void main(String[] args) {

        SortedObjectCollections sortedCollections = new SortedObjectCollections();

        sortedCollections.addFlower(new Rose("Tea-rose", "Peach", 20));
        sortedCollections.addFlower(new Aster("Aster Tatar", "Red", 30));
        sortedCollections.addFlower(new Tulip("Late Tulip", "Red", 25));
        sortedCollections.addFlower(new Camomile("Wild camomile", "Peach", 20));
        sortedCollections.addFlower(new Rose("Peony rose", "Peach", 20));

        sortedCollections.addFile(new TextFile("Core Java Volume I", "book", 500, "Horstmann", new Date(20/11/2007)));
        sortedCollections.addFile(new AudioFile("I Miss You", "song", 4500, "Adele", new Date(03/04/2011)));
        sortedCollections.addFile(new ImageFile("On Phi Phi beach", "photo", 3200, "Nikon D3200", new Date(26/07/2015)));

        sortedCollections.addInstrument(new Trumpet("Bass Trumpet", "Ukraine", (short) 1998, "old, post-consumed"));
        sortedCollections.addInstrument(new Piano("Yamaha YDP-142B", "Japan", (short) 2014, "new"));
        sortedCollections.addInstrument(new Guitar("Maxtone WGC4011", "China", (short) 2015, "new"));

        sortedCollections.printFlowers();
        System.out.println();
        sortedCollections.printFiles();
        System.out.println();
        sortedCollections.printInstruments();

    }
}

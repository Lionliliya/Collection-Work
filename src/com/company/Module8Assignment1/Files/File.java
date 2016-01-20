package com.company.Module8Assignment1.Files;

import java.util.Date;

/**
 * Created by lionliliya on 19.01.16.
 */
public class File implements Comparable {
    private String name;
    private String type;
    private int sizeKB;
    private String author;
    private Date date;

    public File(String name, String type, int sizeKB, String author, Date date) {
        this.name = name;
        this.type = type;
        this.sizeKB = sizeKB;
        this.author = author;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public int getSizeKB() {
        return sizeKB;
    }

    public String getAuthor() {
        return author;
    }

    public Date getDate() {
        return date;
    }

    public void printInfo() {
        System.out.printf("%5s%-26s%-26s%-23d%-23s%-23tF", "", this.getName(), this.getType(), this.getSizeKB(), this.getAuthor(), this.getDate());
        System.out.println();
    }


    /**sorting in ascending order by
     * size of file **/
    @Override
    public int compareTo(Object o) {
        //File temp = (File)o;
        if (this.getSizeKB() == ((File) o).getSizeKB())
            return 0;
        if (this.getSizeKB() > ((File) o).getSizeKB())
            return 1;
        else return -1;

    }
}

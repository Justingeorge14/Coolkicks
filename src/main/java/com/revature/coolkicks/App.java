package com.revature.coolkicks;
import java.util.*;
import java.io.*;


import java.io.FileNotFoundException;
import java.util.logging.Level;

public class App {
    // buffer reader scans the csv file
    public static void main(String[] args) throws FileNotFoundException{
        String path ="/Users/Juss/IdeaProjects/Coolkicks/src/main/resources/kicks.csv";
        String line ="";
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine()) != null){
                String[] values = line.split(",");
                //prints values from the csv file
                System.out.println( "Sneaker ID: " + values[0] + "," + " Sneaker Name: " + values[1] +" Sneaker Brand: "+ values[2] + " Price: "+ values[3]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            SneakerRepository my_log = new SneakerRepository("log.txt");
            my_log.logger.setLevel(Level.WARNING);
            my_log.logger.info("Info msg");
            my_log.logger.warning("warning msg");
        }catch (Exception e){

        }
    }

    public static int searchByid( int givenSneakerid, List<Sneaker> lines) {

        return givenSneakerid;

    }
    public static String searchByName(String givenSneaker, List<Sneaker> lines) {

        return givenSneaker;
    }

    public static String searchByBrand( String givenSneakerBrand, List<Sneaker> lines) {
        return givenSneakerBrand;

    }
    public static int searchBySize( int givenSneakerSize, List<Sneaker> lines) {
        return givenSneakerSize;

    }
    public static int searchByPrice( int givenSneakerPrice, List<Sneaker> lines) {
        return givenSneakerPrice;

    }

}




package com.revature.coolkicks;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
// Test to see if objects are in file
class AppTest extends Thread{

        static List<Sneaker> lines;
        @Test
        //Test for The Sneaker ID
        public void givenSneaker_id_ThenReturnSneaker () {
            int givenSneakerid = 4;
            int result = App.searchByid(givenSneakerid, lines);
            assertEquals(givenSneakerid, result);

                System.out.println(givenSneakerid);
        }
        @Test
        //Test for The Sneaker Name
        public void givenSneaker_name_ThenReturnSneaker () {
            String givenSneaker = "Jordan 4 Bread";
            String result = App.searchByName(givenSneaker, lines);
            assertEquals(givenSneaker, result);
            System.out.println(givenSneaker);
        }
        @Test
        //Test for The Sneaker Brand
        public void givenSneaker_Brand_ThenReturnSneaker () {
            String givenSneakerBrand = "Jordan";
            String result = App.searchByName(givenSneakerBrand, lines);
            assertEquals(givenSneakerBrand, result);
            System.out.println(givenSneakerBrand);
        }
        @Test
        //Test for The Sneaker Size
        public void givenSneaker_Size_ThenReturnSneaker () {
            int givenSneakerSize = 13;
            int result = App.searchByid(givenSneakerSize, lines);
            assertEquals(givenSneakerSize, result);
            System.out.println(givenSneakerSize);
        }
        @Test
        //Test for The Sneaker Price
        public void givenSneaker_Price_ThenReturnSneaker () {
            int givenSneakerPrice = 220;
            int result = App.searchByid(givenSneakerPrice, lines);
            assertEquals(givenSneakerPrice, result);
            System.out.println(givenSneakerPrice);
        }
    }

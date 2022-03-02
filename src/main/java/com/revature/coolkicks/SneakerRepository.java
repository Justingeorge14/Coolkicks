package com.revature.coolkicks;
import java.util.*;
import java.io.*;
import java.io.File;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class SneakerRepository {
    //Creation of Logging SLF4J
    public Logger logger;
    FileHandler fh;
    public SneakerRepository(String file_name) throws SecurityException, IOException{
        //creation of new file for logging
        File f = new File(file_name);
        if(!f.exists()){
            f.createNewFile();
        }
        fh = new FileHandler(file_name, true);
        logger= Logger.getLogger("test");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
    }
}

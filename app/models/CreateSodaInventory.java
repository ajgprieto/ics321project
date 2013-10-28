package models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CreateSodaInventory {

  public static File sodaFile = new File("public/testFiles/Soda.txt");
  public static List<Soda> sodas = new ArrayList<>();

  public static void run() {
    try {

      BufferedReader br = new BufferedReader(new FileReader(sodaFile));
      String line = "";
     

      while ((line = br.readLine()) != null) {
        String [] items = line.split("\\s");
        sodas.add(new Soda(items[0], items[1]));
      }
      br.close();
    }

    catch (FileNotFoundException ioe) {
      System.out.println("You suck.");
    }
    catch (IOException e) {
      System.out.println("IO Exception");
    }
  }
  
  public static List<Soda> listSoda() {
    return  sodas;
  }
}

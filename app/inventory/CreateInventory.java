package inventory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import models.Product;

/**
 * Creates an inventory for all of the different items.
 * 
 * @author AJ
 */
public class CreateInventory {

  static File loadFile = null;
  static BufferedReader br = null;
  
  static List<Product> beverages = new ArrayList<>();
  static List<Product> snacks = new ArrayList<>();
  static List<Product> toys = new ArrayList<>();
  static List<Product> cigars = new ArrayList<>();
  
  static Map<Long, Product> allItems = new HashMap<>();
  static List<Product> all = new ArrayList<>();
  
  

  /**
   * Creates the inventory for the beverages.
   */
  public static void createBeveragesInventory() {
    try {
      loadFile = new File("public/inventoryFiles/drinks.txt");
      br = new BufferedReader(new FileReader(loadFile));
      String line = "";

      long id = 100;

      while ((line = br.readLine()) != null) {
        String[] items = line.split("\\|");
        
        Product prod = new Product(id, items[0], items[1], items[2]);
        beverages.add(prod);
        all.add(prod);
        allItems.put(id, prod);
        id++;
      }
    }
    catch (ArrayIndexOutOfBoundsException aioob) {
      System.out.println("help1");
    }
    catch (IOException io) {
      System.out.println("Something Broke, Beverages, FIX IT");
    }
  }

  /**
   * Creates the inventory for the snacks.
   */
  public static void createSnacksInventory() {
    try {
      loadFile = new File("public/inventoryFiles/snacks.txt");
      br = new BufferedReader(new FileReader(loadFile));
      String line = "";

      long id = 0;

      while ((line = br.readLine()) != null) {
        String[] items = line.split("\\|");
        
        
        Product prod = new Product(id, items[0], items[1], items[2]);
        snacks.add(prod);
        all.add(prod);
        allItems.put(id, prod);
        id++;
      }
    }
    catch (ArrayIndexOutOfBoundsException aioob) {
      System.out.println("help2");
    }
    catch (IOException io) {
      System.out.println("Something Broke, Snacks, FIX IT");
    }
  }

  /**
   * Creates the inventory for the toys.
   */
  public static void createToysInventory() {
    try {
      loadFile = new File("public/inventoryFiles/toys.txt");
      br = new BufferedReader(new FileReader(loadFile));
      String line = "";
      long id = 200;

      while ((line = br.readLine()) != null) {
        String[] items = line.split("\\|");

        Product prod = new Product(id, items[0], items[1], items[2]);
        toys.add(prod);
        all.add(prod);
        allItems.put(id, prod);
        id++;
      }
    }
    catch (ArrayIndexOutOfBoundsException aioob) {
      System.out.println("help3");
    }
    catch (IOException io) {
      System.out.println("Something Broke, Toys, FIX IT");
    }
  }

  /**
   * Creates the inventory for the cigars.
   */
  public static void createCigarInventory() {
    try {
      loadFile = new File("public/inventoryFiles/cigars.txt");
      br = new BufferedReader(new FileReader(loadFile));
      String line = "";
      long id = 300;

      while ((line = br.readLine()) != null) {
        String[] items = line.split("\\|");

        Product prod = new Product(id, items[0], items[1], items[2]);
        cigars.add(prod);
        all.add(prod);
        allItems.put(id, prod);
        id++;
      }
    }
    catch (ArrayIndexOutOfBoundsException aioob) {
      System.out.println("help4");
    }
    catch (IOException io) {
      System.out.println("Something Broke, Cigars, FIX IT");
    }
  }
  
  /**
   * Returns the list of beverages.
   * 
   * @return beverages
   */
  public static List<Product> getBeverages() {
    return beverages;
  }
  
  /**
   * Returns the list of snacks.
   * @return snacks
   */
  public static List<Product> getSnacks() {
    return snacks;
  }
  
  public static List<Product> getToys() {
    return toys;
  }
  
  /**
   * Returns the list of cigars.
   * 
   * @return the list of cigars.
   */
  public static List<Product> getCigars() {
    return cigars;
  }
  
  /**
   * Returns a Map of all the items.
   * @return allItems
   */
  public static Map<Long, Product> getItems() {
    return allItems;
  }
  
  /**
   * Returns the product with the given id.
   * 
   * @param id the id of the product.
   * @return the product
   */
  public static Product showItem(long id) {
    Product prod = allItems.get(id);
    return prod;
  }

}

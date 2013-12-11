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
        System.out.println(line);
        Product prod = new Product(items[0], items[1], items[2], "drink");
        prod.save();
      }
    }
    catch (ArrayIndexOutOfBoundsException aioob) {
      System.out.println("help");
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

      while ((line = br.readLine()) != null) {
        String[] items = line.split("\\|");
        System.out.println(line);
        
        Product prod = new Product(items[0], items[1], items[2], "snack");
        prod.save();
      }
    }
    catch (ArrayIndexOutOfBoundsException aioob) {
      System.out.println("help");
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
    
      while ((line = br.readLine()) != null) {
        String[] items = line.split("\\|");

        Product prod = new Product(items[0], items[1], items[2], "toy");
        prod.save();
      }
    }
    catch (ArrayIndexOutOfBoundsException aioob) {
      System.out.println("help");
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
     
      while ((line = br.readLine()) != null) {
        String[] items = line.split("\\|");

        Product prod = new Product(items[0], items[1], items[2], "cigar");
        prod.save();
      }
    }
    catch (ArrayIndexOutOfBoundsException aioob) {
      System.out.println("help");
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
    return Product.find().where().eq("type", "drink").findList();
  }
  
  /**
   * Returns the list of snacks.
   * @return snacks
   */
  public static List<Product> getSnacks() {
    return Product.find().where().eq("type", "snack").findList();
  }
  
  /**
   * Returns the list of toys.
   * @return
   */
  public static List<Product> getToys() {
    return Product.find().where().eq("type", "toy").findList();
  }
  
  /**
   * Returns the list of cigars.
   * 
   * @return the list of cigars.
   */
  public static List<Product> getCigars() {
    return Product.find().where().eq("type", "cigar").findList();
  }
  
  /**
   * Returns a Map of all the items.
   * @return allItems
   */
  public static List<Product> getItems() {
    return Product.find().all();
  }
  
  /**
   * Returns the product with the given id.
   * 
   * @param id the id of the product.
   * @return the product
   */
  public static Product showItem(long id) {
    Product prod = Product.find().byId(id);
    return prod;
  }
  
  public static List<Product> searchDB(String name) {
    List<Product> products = Product.find().where().contains("item", name).findList();
    return products;
  }

}

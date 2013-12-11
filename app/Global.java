import inventory.CreateInventory;
import play.Application;
import play.GlobalSettings;

/**
 * Creates an inventory for the different categories.
 * @author AJ
 *
 */
public class Global extends GlobalSettings {

  /**
   * Makes the inventory for the different categories.
   * 
   * @param app the Application
   */
  public void onStart(Application app) {
    long time = System.nanoTime();
    CreateInventory.createSnacksInventory();
    CreateInventory.createBeveragesInventory();
    CreateInventory.createToysInventory();
    CreateInventory.createCigarInventory();
    time = System.nanoTime() - time;
    
    System.out.println(time);
  }
}

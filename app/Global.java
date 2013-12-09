import inventory.CreateInventory;
import play.Application;
import play.GlobalSettings;

/**
 * Creates an inventory for the different categories.
 * 
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
    if (CreateInventory.getItems().isEmpty()) {
      CreateInventory.createSnacksInventory();
      CreateInventory.createBeveragesInventory();
      CreateInventory.createToysInventory();
      CreateInventory.createCigarInventory();
    }
  }
}

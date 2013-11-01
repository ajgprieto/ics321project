import inventory.CreateInventory;
import play.Application;
import play.GlobalSettings;


public class Global extends GlobalSettings {

  public void onStart(Application app) {
    //CreateInventory.createSnacksInventory();
    //CreateInventory.createBeveragesInventory();
    CreateInventory.createToysInventory();
    CreateInventory.createCigarInventory();
  }
}

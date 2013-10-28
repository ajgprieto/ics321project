import play.GlobalSettings;
import controllers.Application;
import models.CreateSodaInventory;


public class Global extends GlobalSettings {
  
  public void onStart(Application app) {
    CreateSodaInventory.run();
  }

}

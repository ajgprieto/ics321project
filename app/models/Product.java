package models;

import inventory.CreateInventory;
import java.util.Map;

/**
 * A nondescript product.
 * 
 * @author AJ
 *
 */
public class Product {

  public long id;
  public String item;
  public String price;
  public String pictureUrl;
  
  public Product() {}
  
  public Product(long id, String item, String price, String pictureUrl) {
    this.id = id;
    this.item = item;
    this.price = price;
    this.pictureUrl = pictureUrl;
  }
  
  public long getId() {
    return id;
  }
  
  public void setId(long id) {
    this.id = id;
  }
  
  public String getItem() {
    return item;
  }
  
  public void setItem(String item) {
    this.item = item;
  }
  
  public String getPrice() {
    return price;
  }
  
  public void setPrice(String price) {
    this.price = price;
  }
  
  public String getPic(long id) {
    Map<Long, Product> items = CreateInventory.getItems();
    Product prod = items.get(id);
    return prod.pictureUrl;
  }
  
  public String getPic() {
    return pictureUrl;
  }
  
  public void setPic(String Url) {
    this.pictureUrl = Url;
  }
}

package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import play.db.ebean.Model;

/**
 * A nondescript product.
 * 
 * @author AJ
 *
 */
@Entity
public class Product extends Model {

 
  private static final long serialVersionUID = 7389909143403066870L;
  @Id
  public long id;
  public String item;
  public String price;
  public String pictureUrl;
  public String type;
  
  
  public Product() {}
  
  public Product(String item, String price, String pictureUrl, String type) {
    this.item = item;
    this.price = price;
    this.pictureUrl = pictureUrl;
    this.type = type;
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
    Product prod = Product.find().byId(id);
    return prod.pictureUrl;
  }
  
  public String getPic() {
    return pictureUrl;
  }
  
  public void setPic(String Url) {
    this.pictureUrl = Url;
  }
 
  
  public static Finder<Long, Product> find() {
    return new Finder<Long, Product>(Long.class, Product.class);
  }
}

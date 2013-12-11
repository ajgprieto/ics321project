package views.formdata;

public class ProductFormData {
  
  public String item = "";
  public String price = "";
  public String pictureUrl = "";
  public String type = "";
  
  public ProductFormData() {}
  public ProductFormData(String item, String price, String picUrl, String type) {
    this.item = item;
    this.price = price;
    this.pictureUrl = picUrl;
    this.type = type;
  }

}

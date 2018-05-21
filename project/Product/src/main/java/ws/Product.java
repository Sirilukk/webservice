package ws;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int productprice;
    private int amount;
    private String detail;

    //TODO: 1 add 5 more fields (5 marks)
    //TODO: 2 add getters and setters for the fields (5 marks)

    public Product() {}

    public static Product get() {
        return null;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductprice() {
        return productprice ;
    }

    public void setProductprice(int productprice) {
        this.productprice = productprice;
    }

    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }


//-------------------------------------------ประกาศ--------------------------------------
    @Override
    public String toString() {
        return String.format("Product [id=%s, name=%s,productprice=%s,amount=%s,detail=%s]", id, name,productprice,amount,detail);
    }
}

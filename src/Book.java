public class Book {
    String name;
    double price;
     int qtyinstock;

     Book(String n, double pr, int qty){
          name = n;
          price = pr;
          qtyinstock = qty;

     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyinstock() {
        return qtyinstock;
    }

    public void setQtyinstock(int qtyinstock) {
        this.qtyinstock = qtyinstock;
    }
    public String toString(){
         return(name + " "+price+" "+qtyinstock);
    }
}
class Author{
    String name1;
    String gender;

    Author(String name1,String gender){
        this.name1 = name1;
        this.gender = gender;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String toString(){
        return(name1+" "+gender);
    }

    public static void main(String[] args) {
        Book obj = new Book("aaa",500,10);
        Author obj1 = new Author("Vishnu","Male");
        System.out.println(obj);
        System.out.println(obj1);

    }
}

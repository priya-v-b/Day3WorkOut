class Product {
    protected String name;
    protected double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    double calculateDiscount() {
        return price;
    }
}

class Electronics extends Product {
    Electronics(String name, double price) {
        super(name, price);
    }

    double calculateDiscount() {
        return price * 0.9;
    }
}

class Clothing extends Product {
    Clothing(String name, double price) {
        super(name, price);
    }

    double calculateDiscount() {
        return price * 0.8;
    }
}

public class OnlineShop {
     public static void main(String[] args) {
        Product p = new Electronics("Laptop", 50000);
        System.out.println("Final Price: " + p.calculateDiscount());
    }
}

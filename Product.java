class Product
{
    int id;
    String name;
    float price;

    void get(int id1, String n, float p)
    {
        id = id1;
        name = n;
        price = p;
    }

    void show()
    {
        System.out.println("product id is " + id);
        System.out.println("Product name is " + name);
        System.out.println("Price is " + price);
    }


    public static void main(String args[])
    {
        Product p1 = new Product();
        p1.get(1, "Pen", 4.0f);
        p1.show();
    
    
        Product p2 = new Product();
        p2.get(1, "Book", 32.0f);
        p2.show();
    
    
        Product p3 = new Product();
        p3.get(1, "Scale", 10.0f);
        p3.show();
        if (p1.price < p2.price && p1.price < p3.price)
        {
            System.out.println("pen is the cheapest product");
        }
        else if (p2.price < p1.price && p2.price < p3.price)
        {
            System.out.println("book is the cheapest product");
        }
        else
        {
            System.out.println("scale is the cheapest product");
        }
    }
}
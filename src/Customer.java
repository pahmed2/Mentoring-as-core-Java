public class Customer {

    public static void main(String[] args) {
        Shoping shop = new Shoping();
        System.out.println("Shoping qty;" + shop.shopingQty(10,20));
        System.out.println("Price of Items: " + shop.price(200.00, 300.00));

        BlackFriday blk = new BlackFriday();
        System.out.println("Black Friday special:" + blk.shopingQty(5,17));
        //System.out.println("Black Friday price:"  + blk.price(100.00, 150.00));
    }
}

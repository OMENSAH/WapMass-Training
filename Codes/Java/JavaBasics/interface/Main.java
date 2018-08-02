public class Main{
    public static void main(String[] args) {
        ShoeCommerce shoeCommerce = new  ShoeCommerce();
        System.out.println(shoeCommerce.buy());
        if(shoeCommerce.doTransaction()){
            System.out.println("Yaaay, item is bought successffully");
        }
    }
}
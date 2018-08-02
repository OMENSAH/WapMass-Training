class ShoeCommerce implements PaymentInterface {
    String [] items = {"Shoes","shirts"};
    String CardNumber;
    public String buy(){
        return items[0];
    }
    @Override
    public String getCardNumber(){
        return "101210102020";
    }

    @Override
    public boolean doTransaction() {
        CardNumber = getCardNumber();
        if(CardNumber != ""){
            return true;
        }else{
            return false;
        }
    }

}
public class NestedClass{
    

    //inner class 
    public class InnerClass{
        public String name;
        InnerClass(String name){
            this.name = name;
        }
    }


    //innner class usage
    public void init(){
        InnerClass innerClass = new InnerClass("Inner Class");
        System.out.println(innerClass.name);
    }

    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass();
        nestedClass.init();
    }

}
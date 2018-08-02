// Data Structures: Mechanism of organizing data in your code.

public class Arrays {
  
  public static void main(String[] args) {
    //Arrays
    //Collection of elements of the same data types.
    // It must have a fixed number of elements which means once it's full you cannot add more
    //It can be delared in two ways 
    // One way
    int[] myArray = {1, 2, 3, 4, 5, 6, 7};
    //myArray[7] = 8;  // We can't do this here because the array has a fixed size.
    // String [] mydata = {"Age", 2, 4.0}; It is wrong to work with different data types in array
    
    // Retrieving elements from array 
    // To retrieve from array we use index which starts from 0.
    System.out.println("Getting index 0 element: "+ myArray[0]);
    System.out.println("Total elements in array: " + myArray.length);

    // Relationship between the length and index of an array data structrure 
    // index is one less than the length.

    //Getting all elements from the array
    //To do so we use loop to iterate over the entire datasets
    for(int index = 0; index < myArray.length; index += 1){
       int currentValue = myArray[index];
       int processedData = currentValue + 5;
       System.out.println(processedData);
    }
    
    
  }
}

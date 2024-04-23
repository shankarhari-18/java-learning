import java.util.*;
public class Collecmap{
  public static void main(String[] args) {
  HashMap<Character,Integer> hashmap1 = new HashMap<Character,Integer>();
  hashmap1.put('a',10);
  hashmap1.put('b',20);
  hashmap1.put('c',30);
  hashmap1.put('d',40);
  System.out.println("Hashmap1: "+hashmap1);
  System.out.println("Collection view is : "+hashmap1.values());
  
  }
}
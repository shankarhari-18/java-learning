import java.util.*;
public class Addhash{
  public static void main(String[] args) {
  HashMap<Character,Integer> hashmap1 = new HashMap<Character,Integer>();
  hashmap1.put('a',10);
  hashmap1.put('b',20);
  hashmap1.put('c',30);
  hashmap1.put('d',40);
  System.out.println("Hashmap1: "+hashmap1);
   HashMap<Character,Integer> hashmap2 = new HashMap<Character,Integer>();
  hashmap2.put('e',50);
  hashmap2.put('f',60);
  hashmap2.put('g',70);
  hashmap2.put('h',80);
  System.out.println("Hashmap2: "+hashmap2);
  hashmap2.putAll(hashmap1);
  System.out.println("adding hashmap1 and hashmap2 : "+hashmap2);
  
 }
}
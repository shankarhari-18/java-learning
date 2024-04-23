import java.util.*;
public class Remove{
  public static void main(String[] args) {
  TreeSet<Integer> tree_set1 = new TreeSet<Integer>();
  tree_set1.add(10);
  tree_set1.add(20);
  tree_set1.add(30);
  tree_set1.add(40);
  System.out.println("Tree set1: "+tree_set1);
  System.out.println("removes the element (20)in tree set1 : "+tree_set1.remove(20));
  System.out.println("after removing (20) in tree_set1 : "+tree_set1);
 }
}
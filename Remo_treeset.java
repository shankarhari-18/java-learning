import java.util.*;
public class Remo_treeset{
  public static void main(String[] args) {
  TreeSet<Integer> tree_set1 = new TreeSet<Integer>();
  tree_set1.add(10);
  tree_set1.add(20);
  tree_set1.add(30);
  tree_set1.add(40);
  System.out.println("Tree set1: "+tree_set1);
  System.out.println("removes the last element in tree set1 : "+tree_set1.pollLast());
  System.out.println("after removing last element in tree_set1 : "+tree_set1);
 }
}
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Carolyn Savas

import static java.lang.System.*;
import java.util.TreeSet;
import java.util.*;
import java.util.List; 
import java.util.Arrays;

public class DupRunner
{
 public static void main( String args[] )
 {
   //getDupes();
   //getUniques();
   String words = "a b c d e f g h a b c d e f g h i j k";   
   System.out.println("Original List: " + words);
   System.out.println("Uniques: " + UniquesDupes.getUniques(words));
   System.out.println("Dupes: " + UniquesDupes.getDupes(words));
   
   String words2 = "one two three one two three six seven one two";
   System.out.println("Original List: " + words2);
   System.out.println("Uniques: " + UniquesDupes.getUniques(words2));
   System.out.println("Dupes: " + UniquesDupes.getDupes(words2));
   
   String words3 = "1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6";
   System.out.println("Original List: " + words3);
   System.out.println("Uniques: " + UniquesDupes.getUniques(words3));
   System.out.println("Dupes: " + UniquesDupes.getDupes(words3));
 }}
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Carolyn Savas

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
 public static Set<String> getUniques(String input)
 {
  Set<String> uniques = new TreeSet<String>();
  //add code
   for(String word : input.split(" ")){
     uniques.add(word);
   }
  return uniques;
 }

 public static Set<String> getDupes(String input)
 {
  //add code
   Set<String> uniques = new TreeSet<String>();
   Set<String> dupes = new TreeSet<String>();
  for(String word : input.split(" ")){
    if(!uniques.add(word)){
      dupes.add(word);
    }
   }
  return dupes;
 }
}
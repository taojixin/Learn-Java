package aaaa;
import  java.util.*;
public class abc   {    
        public static void main(String args[])  {
            Set set = new TreeSet();
            set.add(new Integer(10));        
            set.add(new Integer(5));   
            set.add(new Integer(15));
            set.add(new Integer(5));   
            set.add(new Integer(10));
            System.out.println("size = " + set.size());
            Iterator it = set.iterator();
            while(it.hasNext()){
                System.out.print(it.next() + "   ");
            }
        }    
}





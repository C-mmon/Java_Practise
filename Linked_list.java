import java.util.List;
import java.util.LinkedList;

public class Linked_list
{
    public static void main(String [] args)
    {
        List<Integer> numbers=new LinkedList<>();
        //add element to the list remains the same as the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        //accessing the element from the lits numbers.get(index_pos)
        //using the indexof method 
        int index=numbers.indexOf(1);
        System.out.println(index);

        //removing the element from the list 
        int remove=numbers.remove(1);
        //list vs the set
        
        //list can include duplicate elements while set cannot have duplicate element s
        
    }
}
import java.util.List;
import java.util.ArrayList;
//list is ordered collection that allow us store and access element sequentially 
//there are various classess with list 
//array list, linked list, vector and stack 

public class list {

    public static void main(String [] args)
    {
        List <Integer> list_1=new ArrayList<>();

        //adding element to the list 
        list_1.add(1);
        list_1.add(2);
        System.out.println(list_1);

        //accesing the element from the list 
        int store=list_1.get(1);
        System.out.println(store);

        //removing the element from the list 
        int remove_element=list_1.remove(1);
        System.out.println("Removed element "+remove_element);
        
        
    }
}

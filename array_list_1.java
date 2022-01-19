import java.util.ArrayList;
public class array_list_1 {
    public static void main(String[] args)
    {
        ArrayList<String> store=new ArrayList<>();
        store.add("Cow");
        store.add("Cat");
        store.add("Dog");
        System.out.println("ArrayList: " + store);
    
        // iterate using for-each loop
        System.out.println("Accessing individual elements:  ");
    
        for (String language : store) {
          System.out.print(language);
          System.out.print(", ");
        }

    }
}

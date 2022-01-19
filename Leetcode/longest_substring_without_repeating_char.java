class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> store=new HashSet<>();
        int max_len=0;
        //if max length not altered the max will remain 0
        
        //storing the string length 
        int string_length=s.length();
        //two pointer approach 
        int ptr_1=0;
        int ptr_2=0;
        while(ptr_2<string_length)
        {
            //check if the character is present inside the hashset or not 
            if(!store.contains(s.charAt(ptr_2)))
            {
                store.add(s.charAt(ptr_2));
                
                //increment the j pointer 
                ptr_2++;
                
                max_len=Math.max(max_len,store.size());
            }
            else 
            {
                store.remove(s.charAt(ptr_1));
                ptr_1++;
            }
        }
               return max_len;
              
        
    }
}
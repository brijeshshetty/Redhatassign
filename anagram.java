
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string s1:");
        String s1=sc.nextLine();
        System.out.println("enter string s2:");
        String s2=sc.nextLine();
        sc.close();
     
      if(isAnagram(s1, s2)){
        System.out.println("it is an anagram");
      }
      else{
        System.out.println("it is not an anagram");
      }
        
    }
    /*there is two method shown here and both the time complexity are O(n) and another one is also O(n) */
    public static boolean anagram(String s1,String s2){
        HashMap<Character,Integer>h1=new HashMap<>();
        HashMap<Character,Integer>h2=new HashMap<>();
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            h1.put(s1.charAt(i),h1.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0;i<s2.length();i++){
            h2.put(s2.charAt(i),h2.getOrDefault(s2.charAt(i),0)+1);
        }
        for(int i=0;i<s1.length();i++){
            if(h1.get(s1.charAt(i))!=h2.get(s1.charAt(i))){
                return false;
            }
            
        }
        
        return true;
    }
    public static boolean isAnagram(String s,String t)
    {
        
        final int CHAR=256;
        int[] count=new int[CHAR];/*it is used to create char variable were we will increase the count of the char and in the same char decrease the char count*/
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }
        for(int i=0;i<CHAR;i++){
            if(count[i]!=0)
                return false;
            
        }
        /*if the count is not equal to 0 then immidiately return false and all the count is 0 then return true */
        return true;
                      
        
    }
}
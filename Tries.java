public class Tries {
    public static  class Node{
         Node children[] = new Node[26] ;
         boolean endofword = false ;
         Node(){
             for(int i = 0; i<26 ;i++){
                 this.children[i] = null ;
             }

         }
         public static Node root ;
         public void insert(String word){
             Node curr = root ;
             for(int level = 0; level<word.length();level++){
                 int idx = word.charAt(level)- 'a' ;
                 if (curr.children[idx] == null){
                     curr.children[idx] = new Node() ;
                 }
                 curr = curr.children[idx] ;

             }
             curr.endofword = true ;
         }
         public boolean search(String word){
             Node curr = root ;
             for(int level =0 ;level<word.length();level++){
                 int idx = word.charAt(level)- 'a' ;
                 if(curr.children[idx] ==null){
                     return false ;
                 }
                 curr = curr.children[idx] ;
             }
             return curr.endofword;
         }
    }

}

import java.util.*;


/**
 *
 * @author rt
 */
public class RemvLargestnumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int max=0;
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        int k=sc.nextInt();
         char ch[]=num.toCharArray();
         int len=ch.length;
         Arrays.sort(ch);
        String str= String.valueOf(ch);
        
        String ss=str.substring(0,k);
        System.out.print(ss);
         
         
          
        
        
        
    }
    
}

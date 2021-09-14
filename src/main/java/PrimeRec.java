import java.util.Scanner;
import java.util.Stack;
public class PrimeRec {
    static Scanner z=new Scanner(System.in);
    public static boolean isPrimeIter(int n1){
   if (n1>=2){
   boolean r = true;
   int i = 2;
   while ((r== true) && (i<n1)){
    r =((n1% i) !=0); i++;
   
    return r;
   }    
     }
   return false;
 }
 
 public static boolean isPrimeRec(int n1, int d){
   if (n1>=2){
   if (d==1){
   return true;
   }
   else{
   if ((n1%d)==0){
       return false;
   }
   else{
        return isPrimeRec(n1,d-1);   
     }
    }
   }
   else{ 
  return false;
}
   }
 public static Stack<Integer> PrimesIter(int n1){   
  if (n1>=2){
  Stack<Integer> r = new Stack<Integer>();
  int i;
  for (i=2; i<=n1; i++){
  if (isPrimeIter(i)== true){
  r.push(i);
    }
  }
  return r;
  }
  else{
     return r();
  }
 } 
 public static Stack<Integer> primesRec(int n1){
     
   if (n1>=2){
      if (n1==2){
        Stack<Integer> rn1 = new Stack<Integer>();
       rn1.push(n1);
       return rn1;
      }
      else{
      Stack<Integer> rpredn1 = new Stack<Integer>();
      rpredn1 = primesRec(n1-1);
      if (isPrimeRec(n1, n1-1) == true){
        rpredn1.push(n1);
      }
      return rpredn1;
      }
   }
   else{
            return rpredn1();
     }
 }
   public static void main(String[] args) {
         Stack<Integer> fi = new Stack<Integer>();
           Stack<Integer> fr = new Stack<Integer>();
        while(true){
       String mess = "\n Enter an integer greater than 1 please";
       System.out.println(mess);
       String s = z.next();
       int n=Integer.parseInt(s);
       if(((s.isEmpty()==false)&&(n>=2))==true){
       n=Integer.parseInt(s);   
       fi = PrimesIter(n);
       fr = primesRec(n);
       System.out.println("prime numbers less or equal to "+ n);
       System.out.println("iteration method :"+ fi);
       System.out.println("recursive method:"+ fr);
    }
    
}
    }

    private static Stack<Integer> rpredn1() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static Stack<Integer> r() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
  

  
 



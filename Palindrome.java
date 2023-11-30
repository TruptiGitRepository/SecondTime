//working on ThirdBranch
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int Pali= 12533521;
		 String s="2level";
		 Solution1 so1=new Solution1();
       boolean b = so1.isPalindrome(Pali);
       boolean c= so1.isStrPalindrome(s);
       System.out.println(b);
       System.out.println(c);
	}

}

class Solution1 {
	boolean bool;
    public boolean isPalindrome(int  x) {
    	String intStr = String.valueOf(x); 
        bool= intStr.equals(new StringBuilder(intStr).reverse().toString());
        return bool;
    }
    public boolean isStrPalindrome(String  x) {
    	
        bool= x.equals(new StringBuilder(x).reverse().toString());
        return bool;
    }
}

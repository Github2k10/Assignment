package Assignment_11;

public class Problem4{
  public static String doubleChar(String s){
    String str = "";
    
    for(char ch : s.toCharArray()){
      str += ch + "" + ch;
    }
    
    return str;
  }
}

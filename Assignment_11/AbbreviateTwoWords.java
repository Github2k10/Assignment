package Assignment_11;

public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String[] str = name.split(" ");
    
    System.out.println(name);
    
    return (str[0].charAt(0) + "." + str[1].charAt(0)).toUpperCase();
  }
}

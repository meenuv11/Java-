public class Strings {
    public static void main(String[] args) {
        
        String name = "Meenu Vaishnav";

        int length = name.length();
        char letter = name.charAt(1);
        int index = name.indexOf("V");
        int lastindex = name.lastIndexOf("n");
      //  name = name.toUpperCase();
          name = name.toLowerCase();

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastindex);
        System.out.println(name);
    }
    
}

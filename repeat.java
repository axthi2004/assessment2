class repeat {
  /**
 * @param args
 */
public static void main(String[] args) {
      String input = "t6hj7ui";
      char charToRepeat = input.charAt(0);  
      int repeatCount1 = Character.getNumericValue(input.charAt(1));  
      String middleSubstring = input.substring(2, 4);  
      int repeatCount2 = Character.getNumericValue(input.charAt(4));  
      String lastPart = input.substring(5);  
      StringBuilder output = new StringBuilder();
      for (int i = 0; i < repeatCount1; i++) {
          output.append(charToRepeat);
      }
      for (int i = 0; i < repeatCount2; i++) {
          output.append(middleSubstring);
      }
      output.append(lastPart);
      System.out.println("Output: " + output.toString());
  
 }
}

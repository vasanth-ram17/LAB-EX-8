/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vasanth
 */
public class SecondMostFrequentCharacterInString {
  public static void main(String[] args) {
      String str ="vasanthan";
      char a = getSecondMostFrequentCharacter(str); 
      if (a != '\0') {
         System.out.println("Second most frequent char" + " is " + a); }
                                      
      else{
         System.out.println("No second most frequent" + "character"); }
    }
     static char getSecondMostFrequentCharacter(String str) 
    { 
        
        int AsciiValues = 123;//The ASCII values for the alphabets are till 122 so let us take it as 123
        int[] count = new int[AsciiValues]; 
        int i; 
        for (i=0; i< str.length(); i++){ //Assigning the corresponding frequency to the corresponding index of the array 
            (count[str.charAt(i)])++; //converted the char type to int type as ASCII code
       
        }
        int first = 0, second = 0; 
        for (i = 0; i < AsciiValues; i++) 
        { 
           //conditions for finding the second most frequent element
            if (count[i] > count[first]) 
            { 
                second = first; 
                first = i; 
            } 
       
           
            else if (count[i] > count[second] && count[i] != count[first]) {
                     
                second = i; }
        } 
       
        return (char)second; 
    } 
}

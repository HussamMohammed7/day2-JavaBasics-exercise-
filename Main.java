import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    /*
    1. Develop a program that takes the weight (in kilograms) and height (in meters) as
        input and calculates the BMI, then prints it.
      • Input: Weight (kg) = 70, Height (m) = 1.75
      • Expected Output: BMI = 22.86
    */
        Scanner input = new Scanner(System.in) ;

        System.out.println("Enter your weight (in kilograms)");
        double weight = input.nextDouble();
        System.out.println("Enter your height (in meters)");
        double height = input.nextDouble();
        double bmi =    (weight/(height*height));

        System.out.println("Your BMI is : " +String.format("%.2f", bmi));

 /*
        2. Write a program that takes the obtained marks and total marks as input and
           calculates the percentage, then prints it.
         • Input: Obtained Marks = 85, Total Marks = 100
         • Expected Output: Percentage = 85.0%
    */
        System.out.println("Enter your Obtained Marks");
        double obtained_marks = input.nextDouble();
        System.out.println("Enter your total marks ");
        double total_marks = input.nextDouble();
        double percentage = (obtained_marks/total_marks)*100;
        System.out.println("Your percentage is : "+ percentage+"%");
/*
        3. Create a program that takes an amount in one currency and an exchange rate as
           input, then converts and prints the amount in another currency.
         • Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
         • Expected Output: Amount in EUR = 85.0

    */
        System.out.println("Enter Amount in USD, Exchange Rate (USD to EUR) = 0.85");
        double amount = input.nextDouble();
        System.out.println("Amount in EUR : " +(amount*0.85));

        /*
        4.  Create a program that takes a string as input, calculates its length, and then reverses
            the string using the StringBuilder class, finally printing both the length and reversed
            string.
          • Input: "Hello, World!"
          • Expected Output: Length of the string: 13 And Reversed string: "!dlroW
,           olleH"
    */
        Scanner input1 = new Scanner(System.in) ;
        System.out.println("Enter a word to calculate the length of it and reverse it : ");
        String string_reverse = input1.nextLine();
        StringBuilder word =new StringBuilder(string_reverse) ;

        System.out.println("The length of your word : " + word.length());
        System.out.println("Your reversed word : "+ word.reverse());

/*
        5. Develop a program that takes a sentence as input and extracts a substring from it,
           then prints the extracted substring.
         • Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index
         = 10, End Index = 20
         • Expected Output: "brown fox
    */
        Scanner input2 = new Scanner(System.in) ;

        System.out.println("Enter a sentence to substring : ");
        String sentence = input2.nextLine();
        System.out.println("Enter the starting index : ");
        int start_index = input2.nextInt();
        System.out.println("Enter the ending index : ");
        int end_index = input2.nextInt();
        System.out.println("The Output is : " + sentence.substring(start_index,end_index));
     /*
        6. Write a program that takes a sentence and a keyword as input, then check if the
           keyword is present in the sentence and prints the result.
         • Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword =
           "jumps"
         • Expected Output: Keyword "jumps" is present in the sentence
    */
        Scanner input3 = new Scanner(System.in) ;

        System.out.println("Enter a sentence to find the keyword on it : ");
        String sentence_keyword = input3.nextLine();
        System.out.println("Enter the Keyword : ");
        String keyword = input3.nextLine();

        if (sentence_keyword.contains(keyword)){
            System.out.println("Keyword "+keyword+" is present in the sentence ");
        }else{
            System.out.println("Keyword "+keyword+" is NOT present in the sentence ");
        }



        /*
         7. Develop a program that takes a sentence and a word to replace as input, then
            replace all occurrences of the word with another word and prints the modified
            sentence.
•           Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to
            Replace = "fox", Replacement Word = "cat"
          • Expected Output: "The quick brown cat jumps over the lazy dog"

        */
        Scanner input4 = new Scanner(System.in) ;

        System.out.println("Enter a sentence to replace the keyword on it : ");
        String sentence_keyword_replace = input4.nextLine();
        System.out.println("Enter the Keyword : ");
        String keyword_replace = input4.nextLine();
        String new_replace=  sentence_keyword_replace.replaceAll(keyword_replace,"cat");
      System.out.println("Output: "+ new_replace);


        /*
        8. Write a program that takes two strings as input and check if they are equal, ignoring
           the case, then prints whether they are equal or not.
         • Input: String 1 = "Hello", String 2 = "hello"
         • Expected Output: Strings are equal (ignoring case).
    */
        Scanner input5 = new Scanner(System.in) ;

        System.out.println("Enter your first word : ");
        String first_word_equal = input5.nextLine();
        System.out.println("Enter your second word ");
        String second_word_equal = input5.nextLine();

        if (first_word_equal.equalsIgnoreCase(second_word_equal)){
            System.out.println("Strings are equal (ignoring case)");
        }else{
            System.out.println("Strings are NOT equal (ignoring case)");

        }

    }
}
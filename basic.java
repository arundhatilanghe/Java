// ADD TWO NUMBERS

// public class basic {
//     public static void main (String[] args) {
//         int a = 5;
//         int b = 6;
//         int sum = a + b;
//         System.out.println("Sum : "+ sum);
//     }
// }

// ADD TWO NUMBERS USING USER INPUT

// import java.util.Scanner;

// public class basic {
//     public static void main (String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter Username : ");
//     String username = sc.nextLine();
//     System.out.println("Username is :" + username);
//     }
// }

// Another example of Scanner class

// import java.util.Scanner;

// public class basic {
//     public static void main (String [] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter name, age and salary : ");

//         String name = sc.nextLine();
//         int age =  sc.nextInt();
//         double salary = sc.nextDouble();

//         System.out.println("name : " + name);
//         System.out.println("age : " + age);
//         System.out.println("salary : " + salary);
//     }
// }

// Add numbers using user input

// import java.util.Scanner;

// public class basic {
//     public static void main (String[] args) {
//         int sum;
//         Scanner sc = new Scanner (System.in);

//         System.out.println("Enter the first number : ");
//         int num1 = sc.nextInt();

//         System.out.println("Enter the second number : ");
//         int num2 = sc.nextInt();

//         sum = num1 + num2;
//         System.out.println("The sum is : " + sum);
//     }
// }

// public class basic {
//     public static void main(String[] args) {
//         String str = "One Two Three Four";
//         int countWords = str.split("\\s").length;
//         System.out.println(countWords);
//     }
// }

// public class basic {
//     public static void main(String[] args) {
//         String originalStr = "Hello";
//         String reversedStr = "";

//         for (int i = 0; i < originalStr.length(); i++) {
//             reversedStr = originalStr.charAt(i) + reversedStr;
//         }
//         System.out.println("Reversed String : " + reversedStr);
//     }
// }

// public class basic {
//     public static void main(String[] args) {
//         int x = 4;
//         int y = 5;
//         int sum = x + y;
//         System.out.println(sum);
//     }
// }

// import java.util.Scanner;;

// public class basic {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter your first number : ");
//         int x = sc.nextInt();
//         System.out.println("Enter your second number : ");
//         int y = sc.nextInt();
//         int sum = x +  y;
//         System.out.println(sum);
//     }
// }

// public class basic {
//     public static void main(String[] args) {
//         String words = "The Best Frontend Developer Alive.";
//         int countWords = words.split("\\s").length;
//         System.out.println(countWords);
//     }
// }

// public class basic {
//     public static void main(String[] args) {
//         String originalStr = "";
//         String reversedStr = "";
//         for(int i = 0; i < originalStr.length(); i++) {
//             reversedStr = originalStr.charAt(i) + reversedStr;
//         }
//         System.out.println(reversedStr);
//     }
// }

// public class basic {
//     public static void main(String[] args) {
//         int [] Array = {34, 78, 65, 988};
//         int sum = 0;

//         for ( int i = 0; i < Array.length; i++ ) {
//             sum += Array[i];
//         }
//         System.out.println(sum);
//     }
// }

// public class basic {
//     public static void main(String[] args) {
//         String myArray = "JavaScript";
//         char [] arrtoChar = myArray.toCharArray();
//         System.out.println(arrtoChar[4]);
//     }
// }

// public class basic {
//     public static void main(String[] args) {
//         String myArray = "String";
//         char [] arrToChar = myArray.toCharArray();
//         for(char i : arrToChar){
//             System.out.println(i);
//         }
//     }
// }

import java.util.Arrays;
public class basic {
    public static void main(String[] args) {
        String [] colors = {"pink", "red", "yellow", "blue", "white"};
        Arrays.sort(colors);
        for (String i : colors) {
            System.out.println(i);
        }
    }
}
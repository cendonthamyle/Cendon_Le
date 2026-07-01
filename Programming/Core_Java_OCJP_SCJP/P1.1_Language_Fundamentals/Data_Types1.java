public class Data_Types1 {

    /*
       Course Lecture: Java Language Fundamentals
       Topic: Data Types (Part 1)
    */

    public static void main(String[] args) {
        // This class is structurally designed to demonstrate compile-time behaviors,
        // definitions, and rules from the lecture notes.
        demonstrateStronglyTypedSystem();
        demonstrateByteBehavior();
        demonstrateShortBehavior();
        demonstrateIntBehavior();
    }

    /*
       1. INTRODUCTION TO JAVA'S TYPING SYSTEM (STRONGLY TYPED LANGUAGE) 
          Java enforces strict rules regarding how data types are allocated and evaluated.
     
          Type integrity is central to Java's architecture for three key reasons:
        1| Universal Typing: Every single variable and expression evaluated in Java has an explicitly defined type. 
           No variable can exist without a type.
        2| Strict Definitions: Each data type has a clearly defined, rigid size and range across all operating systems and architectures.
        3| Compile-Time Type Verification: The compiler strictly verifies type compatibility for every assignment statement.
     */

    public static void demonstrateStronglyTypedSystem() {
        System.out.println("--- 1. Java's Strongly Typed System ---");
        
        // Valid assignments
        // int a = 10;
        // boolean b = true;

        /*
           EXAM TRIGGERS (COMPILE-TIME ERRORS):
             Unlike weaker-typed languages (like C/C++), the following statements are completely illegal in Java and will immediately fail 
             compilation:
             int x = 10.5;   // Type mismatch: cannot convert from double to int 
             boolean flag = 0; // Type mismatch: cannot convert from int to boolean 
         */

        System.out.println("Java strictly verifies types at compile-time to maintain safety.");
    }

    /*
       2. IS JAVA A PURE OBJECT-ORIENTED LANGUAGE? 
        | The Relative Perspective: Compared to older languages like C++, Java provides much higher object safety and eliminates explicit pointers, 
          leading some to loosely refer to it as pure.
        | The Absolute Reality: Java is NOT a pure object-oriented language.
            1. It lacks support for several standard OOP features such as operator overloading and multiple inheritance.
            2. It heavily relies on primitive data types (int, char, double) to represent raw numbers and logical values. 
               These are fundamentally non-objects.

       INTERVIEW RECOMMENDATION: 
          If asked in an interview, the recommended answer is "No". This allows you to provide a clear, technical defense by highlighting 
          Java's structural dependency on non-object primitive types.
     */

    /*
       3. CLASSIFICATION OF PRIMITIVE DATA TYPES
          Java contains exactly 8 primitive data types.

          SIGNED VS. UNSIGNED BEHAVIOR:
         Except for 'boolean' and 'char', the remaining six data types (byte, short, int, long, float, double) are structurally categorized 
         as signed data types. 
         This means they are explicitly designed to handle both positive and negative values.

         Concepts like "negative text" (char ch = -'A') or "negative false" (boolean b = -false) are completely meaningless and invalid in 
         programming languages.
     */

    /*
       4. DEEP DIVE INTO SPECIFIC DATA TYPES 
             A. THE BYTE DATA TYPE
                | Size: 1 byte (8 bits).
                | Range: -128 to +127.
                | Memory Structure: The Most Significant Bit (MSB) acts exclusively as the sign bit (0 = positive number, 1 = negative number). 
                  The remaining 7 bits are used to compute the absolute value.
                | Storage: Positive numbers are mapped directly into memory, whereas negative numbersare represented in two's complement form.
     */
    public static void demonstrateByteBehavior() {
        System.out.println("\n--- 4A. Byte Data Type Behavior ---");
        
        byte b1 = 10;   // Valid 
        byte b2 = 127;  // Valid (Max upper boundary) 
        byte b3 = -128; // Valid (Min lower boundary) 

        System.out.println("Valid bytes: " + b1 + ", " + b2 + ", " + b3);

        /*
           EXAM TRIGGERS & COMPILER BEHAVIOR (BYTE):
             byte b4 = 128;  // INVALID! Throws: possible loss of precision; found: int, required: byte 
             byte b5 = 10.5; // INVALID! Throws: possible loss of precision; found: double, required: byte 
             byte b6 = true; // INVALID! Throws: incompatible types; found: boolean, required: byte 
         */

        // BEST USE CASE:
        /* The byte type is the optimal choice when handling raw binary data in terms of streams (reading/writing files or transmitting
           data across networks) because file and network systems natively utilize a byte-supported structure.
         */  
    }

    /*
             B. THE SHORT DATA TYPE 
                | Features: It is structurally the most rarely used data type in Java.
                | Size: 2 bytes (16 bits).
                | Range: -2^15 to 2^15 - 1 (-32,768 to 32,767).
     */
    public static void demonstrateShortBehavior() {
        System.out.println("\n--- 4B. Short Data Type Behavior ---");
        
        short s1 = 32767; // Valid (Max upper boundary)
        System.out.println("Valid short: " + s1);

        /*
           EXAM TRIGGERS & COMPILER BEHAVIOR (SHORT):
            | short s2 = 32768; // INVALID! Throws: possible loss of precision; found: int, required: short 
            | short s3 = true;  // INVALID! Throws: incompatible types; found: boolean, required: short 
         */

        /*
           HISTORICAL CONTEXT & BEST USE CASE:
           short was originally designed to optimize read/write efficiency on old 16-bit processors (such as the 
           8085 or 8086 architectures) where data and instruction boundaries matched the 16-bit profile exactly. 
           Since 16-bit hardware is obsolete today, short is functionally an outdated and unnecessary data type in 
           modern Java engineering.
         */ 
    }

    /*
          C. THE INT DATA TYPE 
           | Features: The most commonly used data type in Java for representing whole numbers. Even for tiny whole numbers like 10,
             developers naturally default to 'int' over 'byte'.
           | Size: 4 bytes (32 bits).
           | Range: -2^31 to 2^31 - 1 (-2,147,483,648 to 2,147,483,647).
     */
    public static void demonstrateIntBehavior() {
        System.out.println("\n--- 4C. Int Data Type Behavior ---");
        
        int x1 = 2147483647; // Valid (Max upper boundary) 
        System.out.println("Valid int: " + x1);

        /*
           CRUCIAL EXAM TRICKS (LITERAL BOUNDS):
             By default, the Java compiler treats every single whole number literal as an 'int'.

             TRICK 1: Directly assigning an out-of-bounds literal
                 int x2 = 2147483648; 
             CRUCIAL: The code statement above does NOT throw a "possible loss of precision" error. Instead, it explicitly throws: 
                      "integer number too large". 
         
                      This happens because the raw numeric literal itself overflows the compiler's default integer parser boundary 
                      before type checking or assignment evaluation can even happen.
             TRICK 2: Appending the Long suffix
                 int x3 = 2147483648L; 
             INVALID! Suffixing the literal with an 'L' (or 'l') explicitly tells the compiler to parse the literal as a 64-bit 'long'. 
             Now that the literal passes the initial parser phase, the type verification phase steps in and throws a precision mismatch error:
                Throws: "possible loss of precision; found: long, required: int".
         */
    }

/*
 *      5. SUMMARY TABLE OF COVERED DATA TYPES 
 *      +-----------+-------------------+------------------------------------+------------------------------+-----------------------------+
 *      | Data Type | Size              | Range                              | Default Literal Evaluation   | Primary Use Case            |
 *      +-----------+-------------------+------------------------------------+------------------------------+-----------------------------+
 *      | byte      | 1 Byte (8 bits)   | -128 to +127                       | Evaluated as int implicitly  | File & Network Streams      |
 *      | short     | 2 Bytes (16 bits) | -32,768 to +32,767                 | Evaluated as int implicitly  | Legacy 16-bit hardware      |
 *      | int       | 4 Bytes (32 bits) | -2,147,483,648 to +2,147,483,647   | Default for whole numbers    | General integer math        |
 *      +-----------+-------------------+------------------------------------+------------------------------+-----------------------------+
 */ 
}
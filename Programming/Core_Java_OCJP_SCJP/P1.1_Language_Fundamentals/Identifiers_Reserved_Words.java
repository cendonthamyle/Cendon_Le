public class Identifiers_Reserved_Words {

    /*
       COURSE LECTURE: JAVA LANGUAGE FUNDAMENTALS
       Topic: Java Identifiers and Reserved Words
 
     * 1. INTRODUCTION TO LANGUAGE FUNDAMENTALS
          Language Fundamentals serve as the baseline building blocks for writing robust Java programs.

     This comprehensive 10-session module covers crucial structural elements:
         1. Identifiers (The focus of this class)       6. Types of Variables
         2. Reserved Words (The focus of this class)    7. Var-Args Methods
         3. Data Types                                  8. The main Method
         4. Literals                                    9. Command-Line Arguments
         5. Arrays                                      10. Java Coding Standards
    */

    /*
        2. JAVA IDENTIFIERS
          An identifier is a program-defined name used exclusively for identification purposes.
          In Java, any name you assign to a component—be it a class, a method, a variable, or a 
          code label—is structurally categorized as an identifier.
    */
        public static void main(String[] args) {
            // CODE CASE STUDY: COUNTING IDENTIFIERS
            // This block contains exactly five distinct identifiers:
            // 1. Identifiers_Reserved_Words    (Name of the class)
            // 2. main                          (Name of the execution method)
            // 3. String                        (Name of a predefined Java class)
            // 4. args                          (Name of the string array variable)
            // 5. x                             (Name of the integer variable)
            int x = 10;

            System.out.println("Identifier case study variable x = " + x);

            // Execute demonstrations
            rulesDemonstration();
            reservedWordsDemonstration();
        }

    /*
       3. MANDATORY RULES FOR DEFINING IDENTIFIERS
       To be recognized as valid by the Java compiler, your identifiers must rigidly adhere to six syntax laws.
     */
        public static void rulesDemonstration() {
        
            // RULE 1: ALLOWED CHARACTER SETS
            // Identifiers can only consist of: [a-z, A-Z], [0-9], '$', and '_'.
            int total_number = 100; // Valid
            int total$number = 200; // Valid
            // int total#number = 300; // ❌ INVALID: '#' causes a compile-time error.

            // RULE 2: DIGITS CANNOT LEAD
            // An identifier can contain numbers, but it cannot begin with a digit.
            int Total123 = 400; // Valid
            // int 123Total = 500; // ❌ INVALID: Leading digit causes a compile-time error.

            // RULE 3: CASE SENSITIVITY
            // Identifiers containing identical letters but different sizing are independent memory locations.
            int number = 10;
            int Number = 20;
            int NUMBER = 30; // Valid: Three completely separate variables.

            // RULE 4: NO LENGTH LIMIT
            // Technically there is no restriction, but excessive length degrades readability.
            int xxxxxxxxxxxxxxxxxxxxxxyyyyyyyyyyyyyyyyyyzzzzzzzzzzzzzz = 1000; // Valid, but poor practice.

            // RULE 5: RESERVED WORDS BANNED
            // You cannot hijack language keywords or literals to use as your own naming conventions.
            int y = 10; // Valid
            // int if = 20; // ❌ INVALID: 'if' is a structural keyword.

            // RULE 6: PREDEFINED NAMES ARE ALLOWED (BUT DISCOURAGED)
            // Predefined class/interface names are not reserved words, but they confuse programmers.
            int String = 888;    // Valid, but a highly discouraged programming practice
            int Runnable = 999;  // Valid, but creates extreme confusion
        }

    /*
       4. JAVA RESERVED WORDS

                            RESERVED WORDS (53)
                                   |
                     -----------------------------------------------
                    |                                             |
                KEYWORDS (50)                            RESERVED LITERALS (3)
                    |                                     (True, False, Null)
            ------------------------------
            |                            |
        USED KEYWORDS (48)      UNUSED KEYWORDS (2)
         (if, for, int...)         (goto, const)

       Java reserves exactly 53 words to represent core functionalities or explicit data literals.
     */
        public static void reservedWordsDemonstration() {
        
            // A. Keywords for Data Types (8)
            byte b = 1;
            short s = 2;
            int i = 3;
            long l = 4L;
            float f = 5.0f;
            double d = 6.0;
            boolean bool = true;
            char ch = 'A';

            // B. Keywords for Flow Control (11)
            // Covered keywords: if, else, switch, case, default, while, do, for, break, continue, return
            if (bool) {
                for (int k = 0; k < 1; k++) {
                    break; 
                }
            }

            // C. Keywords for Modifiers (11)
            // public, private, protected, static, final, abstract, synchronized, native, strictfp, transient, volatile
            // (Note: strictfp was added in v1.2 for strict floating-point math validation).

            // D. Keywords for Exception Handling (6)
            // try, catch, finally, throw, throws, assert
            // (Note: assert was added in v1.4 for debugging validation).
            try {
                assert (i > 0); 
            } catch (AssertionError e) {
            // Handle exception
            } finally {
                // Clean up
            }

            // E. Class-Related Keywords (6)
            // class, interface, extends, implements, package, import

            // F. Object-Related Keywords (4)
            // new (allocates memory), instanceof (type check), super, this (pointers)
            String str = "Hello";
            boolean check = (str instanceof String);

            // G. Return Type Keyword (1)
            // void — Used when a method does not return a value.
            // Note: Unlike C/C++ where omitting a return type assumes int, Java strictly requires a return declaration.

            // H. The Unused Keywords (2)
            // goto  — Prohibited because it creates structured unreadability ("spaghetti code").
            // const — Replaced functionally by the 'final' keyword.
            // Note: Attempting to use 'goto' or 'const' in code triggers a compile-time error.
            // int goto = 5;  // ❌ INVALID
            // int const = 3; // ❌ INVALID

            // I. Special New Additions (1)
            // enum (Added in v1.5 to construct custom groups of named constants).
            // Defined outside this method scope at the bottom of the class block.

            // J. Reserved Literals (3)
            // These are raw values rather than code functions:
            boolean tVal = true;   // Value for boolean data type
            boolean fVal = false;  // Value for boolean data type
            Object obj = null;     // Default assignment for unallocated object references
        }

        // Example of Special New Addition (I): Enum
        enum Month { JAN, FEB, MAR }

    /*
       5. SUMMARY & KEY EXAMINATION TRIGGERS
        | All 53 reserved words are lowercase only.
          Keywords like 'strictfp' and 'instanceof' use a lowercase internal character ('f' and 'o' respectively).
          Capitalized iterations like 'INT' or 'Final' are valid custom identifiers, not keywords.
        | Java features a 'new' keyword, but explicitly lacks a 'delete' keyword.
          Object memory clearing is delegated automatically to the background Garbage Collector.
        | Common method names from API libraries (like main, exit, finalize, notify, or notifyAll) are NOT reserved 
          keywords. They are simply regular identifiers.
     */
    
}
# VARIABLES

Variables are containers for storing data values. <br>

* ```String``` - stores text, such as "Hello". String values are surrounded by double quotes. <br>
* ```int``` - stores integers (whole numbers), without decimals, such as 123 or -123 <br>
* ```float``` - stores floating point numbers, with decimals, such as 19.99 or -19.99<br>
* ```char``` - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes<br>
* ```boolean``` - stores values with two states: true or false<br>

Java Variables are of three types: <br>

* Local Variables
* Instances Variables
* Static Variables

## Local Variables
 Variables declared inside the body of the method is called local variable.

 ```
 method{
    body{
        variable
    }
 }
 ```

## Instance Variable
Variable declared inside the class but outside the body of the method is called instance variable.

```
variable
method{
    body{

    }
}
```

## Static Variable
Static Variable are stored in the static memory. It is rare to use the static variables other than declared final and used as either in public or private constants.

Static variables are created when the program starts and ends when the programs stops.

## **Rules to declare a variable in any Programming Language:**

* A variable name can consist of Capital letters A-Z, lowercase letters a-z digits 0-9, and two special characters such as _ underscore and $ dollar sign.
* The first character must not be a digit.
* Blank spaces cannot be used in variable names.
* Java keywords cannot be used as variable names.
* Variable names are case-sensitive.
* There is no limit on the length of a variable name but by convention, it should be between 4 to 15 chars.
* Variable names always should exist on the left-hand side of assignment operators.
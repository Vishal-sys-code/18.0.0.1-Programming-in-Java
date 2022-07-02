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
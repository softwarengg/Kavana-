fun main() {
    
    var name = "Kotlin"
    print("Hello," +name + "!")
    
    for (i in 1..6){
        println("i = $i")
    }
}

fun main(){
    var message :String="hello world"
    message =null
    println(message.length)
}

NULL safety


fun main(){
    var message: String?= "HEllo WORLD"
//     message = null
    println(message?.length)
}

fun main() {
    var language = "Kotlin"
    var salary = 30000
    
    println("Language: $language")
    println("Salary: $salary")
}

fun main(){ 
    var name 
    name="john"     // error because the initialization and declaration are done separately and while declaring 
    println(name)    // datatype is not mentioned
}

fun main(){
    var salary =3000
    salary= 40000
    println("$salary")
}

fun main(){
    val sal=30000  // val cannot be reassigned
    sal =40000
}




fun main(){
    val name ="john"
    println("Hello! " +name)
    
    val x=5
    val y=6
    println(x+y)
    
    var fname="John"
    var lname ="Doe"
    val fullname = fname+lname
    println(fullname)
    
    val a="5"
    val b=6
    print(a+b)
    
}

//Datatypes
// Number datatype
fun main() {
    val myNum: Byte = 100        //Byte 8bit
    println(myNum)
                                   //char 1 byte
    val integer: Int = 10000000    //Short = 16bit 2byte
    val short: Short = 12000           //Int = 32 bit 4 Byte
    val long: Long = 140000000000000L    // Long = 64bit 8byte
    val double :Double = 12E4           //Double = 64bit 8 Byte   15digits after decomal point
    val float : Float = 35E3F            // Float = 32 bit 4 byte   6 digits after .
	
	println(integer)
    println(short)
    println(long)
    println(double)
    println(float)
}


//Char datatype

fun main(){
//     val myGrade: Char="A" //or
    val myGrade ="A"
    println(myGrade)
}

fun main(){
val myLetter: Char = 66
println(myletter)   //output: error
}


//Boolean Datatype

fun main(){
    val isKotlinFun :Boolean =false       //cannot be given in 1 or 0
    val isPaneerTasty :Boolean =true
    println(isKotlinFun)
    println(isPaneerTasty)
}

//# will direct to the website 
//ex: #<includestdio.h> which will direct to the stdio.h header file


//String Datatype

fun main(){
    //1. Escaped String:Escape characters like '\n','\t'
    val text="Hello, Kotlin\n"
    //or
    val test1 ="Hello,\nKotlin"
    
    //2. Row String :Cannot contain any escape character
    val test2 = """
    Welocome
    To
    Kotlin"""
    
    println(text)
    println(test1)
    println(test2)
}


//Array Datatype

//1. Library function arrayOf()
fun main(){
    val id = arrayOf(1,2,3,4,5)
    val firstid = id[0]
    val lastid = id[id.size-1]
    
//     println(arrayOf(id))
    println(firstid)
    println(lastid)
    
    //2. Array() Constructor
    
//     val asc=Array(5,{i-> i*2})
//     println(asc)
    
}


//Operator
fun main(){
    var a=2
    var b=3
    var c=4
    println(a+b)
    println(a/c)
    println(b*c)
    println(b-c)
    println(a%b)
}


//Relational Operators

fun main(){
    var a=2
    var b=3
    var c=4
    
    println(a>b)
    println(b<c)
    println(a>=b)
    println(b<=c)
    println(a==c)
    println(b!=c)
}

//Logical Operators

fun main(){
    var a=true
    var b=false
    var c=true
    
    println(a&&b)
    println(c||b)
    println(!a)
    println(a&&c) 
}


//Example 2:
fun main(){
    var x =100
    var y = 25
    var z = 10
    var result = false
    if (x>y && x>z)
    println(x)
    if (x<y||x>z)
    println(y)
    if (result.not())
    println("Logical Operators") 
}

////Bitwise Operators

fun main(){
    println(5.shl(1))     //value of 5 is signed shift left by 1 bit
    println(10.shr(2))   // value of 10 is signed shift right by 2 bits
    println(12.ushr(2))   //value of 12  is unsigned shift right by 2 bits
    println(36.and(22))   //value of 36  is  bitwise and with 22
    println(36.or(22))    // value of 36  is  bitwise or with 22
    println(36.xor(22))   //value of 36  is  bitwise xor with 22
    println(14.inv())     //value of 14 is bitwise inverse  1..0 & 0..1  formula o/p=-(n+1)
}


////Unary Operators

fun  main(){
    var a =10
    var b = 5
    var flag = true
    println(a++)
    println(b--)
    println(++a)
    println(--b)
}

//Example 2:
fun  main(){
    var e =10
    var flag = true
    println(e++)
    println(++e)
    println(e--)
    println(--e)
}

//Control Flow
fun main()
{
    print("Enter an Integer value: ")
    val string1 = readLine()!!
    var num: Int = string1.toInt()
    println("You entered: $num")
        if (num > 0)
    {
        println("num is positive")
    }   else if(num < 0)
    {
        println("num is negative")
    }   else
    {
        println("num is zero")
    }
}

//DAY 2

//Just displaying the values
fun main(){
    print("Enter an integer value:")
    val string1 = readLine()!!
    var intergerValue : Int =string1.toInt()
    println("you entered : $integerValue")
    print("Enter a double value")
    val string2 = readLine()!!
    var doubleValue : Double =string1.toDouble()
    println("you entered : $doubleValue")
}

////Kotlin {When} EXpression

fun main(){
    print("Enter the name of heavenly body")
    var name =readline()!!.toString()
    when(name)
    {
"sun"->print("is star")
"moon"->print("is a satelite")
"Earth"->print("is a planet")
else->print("i don't know anything aboutv it")
    }
}

////Example:2

fun main()
{
    var number = 4  
    var numberProvided = when(number) 
{  
        1 -> "One"  
        2 -> "Two"  
        3 -> "Three"  
        4 -> "Four"  
        5 -> "Five"  
        else -> "invalid number"  
    }  
    println("You provide $numberProvided")  
}

//// {when} using barces

fun main(){
    var number =1
    when(number)
    {
1->
        {
            println("Monday")
            println("FIrst day of the week")
        }
        7->println("Sunday")
        else->println("other days")
    }
}

////Kotlin for loop

fun main(){
    for(i in 1..6)
    {
print("$i")}
}
//
fun main(){
for (i in 1..10 step 3)//iterate through range to jump-step
print("$i")}


//using downTO keyword for decending order
fun main(){
    for(i in 6 downTo 1)//downTo keyword ulta ge
    {
print("$i")}
}

////ITERATE THROUHT ARRAY
////TRaverse an array without indexing
fun main(){
    var num = arrayOf(1,2,3,4,5)
    for (n in num)//for loop with "in" operator without indexing 
    {
if (n%2==0)
        {
print("$n")
        }
    }
}


////USING INDEXING CONCEPT
fun main(){
    var planets = arrayOf("earth","Mars","Venus")
    for (i in planets.indices) //indices is keyword
	{ 
		println(planets[i]) 
	} 
}

//using "withIndex" keyword
fun main( )                //array is static data structure and cannot be changed in runtime
	{ 
	var planets = arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn") 

	for ((index,value) in planets.withIndex()) 
	{ 
		println("$index , $value") 
	} 
	}
	
	
//// Iterarting through String
fun main(){
    var name = "Hello"
	var name2 = "World"
	
	// traversing string without using index property 
	for (alphabet in name) print("$alphabet ") 

	// traversing string with using index property 
	for (i in name2.indices) print(name2[i]+" ") 
	println(" ") 
	
	// traversing string using withIndex() library function 
	for ((index,value) in name.withIndex()) 
	println("Element at $index th index is $value")
}

////iterate through list
fun main()
{ 
var collection = listOf(1,2,3,"listOf", "mapOf", "setOf") 
// read only, fix-size
	for (i in collection) 
	{ 
		println(i) 
	} 

}

//While loop
fun main( )
{
	var number = 1

	while(number <= 10) 
	{
		println(number)
		number++;
	}
}


//While loop using array
fun main() 
{
var names =arrayOf("Praveen","Gaurav","Akash","Sidhant","Abhi","Mayank")
	var index = 0

	while(index < names.size)
	 {
		println(names[index])
		index++
	}
}


//// printing infinite loop
fun main(){
    while(true)
    {
        println("infinite loop")
    }
}

////do whilefun main()
{  
    var i = 6  
    do {  
        println(i)  
        i++  
    }  
    while (i<=5);  
}


////Break Example:1

fun main() 
{  
    for (i in 1..5) 
    {  
        if (i == 3) 
        {  
            break  
        }  
        println(i)  
    }  
}


////Example:2
fun main() 
 { 
	var name = “AndroidKotlin"
	for (i in name){ 
	print("$i") 
		if(i == ‘K’) 
		{ 
			break
		} 
	} 
}


////labeled break statement

fun main()
{
    loop@for(i in 1..3)//lable
    {
        for(j in 1..3)
        {
            println("i=$i and j=$j")
            if(i==2)
            break@loop   //labled break Statement
        }
    }
}

//continue
fun main()
{
    for (i in 1..3) {

        if (i == 2) {
            continue
        }
        println("i = $i")
    }
}


------------------------------FUNCTIONS---------------------------------

//in-built function
- sqrt() –square root of a number.
- print() –print a message 
- rem() –remainder of number
- toInt() –number to int
- readline() –standard input.
- compareTo() –compare two numbers
- ceil()= rounds up the  numberex:
- ceil(3.4)=4.0

-floor() - rounds down the value
floor(5.9)= 5.0

- round()  - checks for the decimal point
round(4.2) = 4.0
round(4.9)= 5.0
round?(4.5)= 5.0

- abs - absolute value
abs(-12) = 12 /int stdlib.h
fabs(-12.5)  = 12.5 //float


////lamda function
fun main()
{
    val upperCase={str:String->str.toUpperCase()}
    println(upperCase("hello world!"))
}

////example for inheritance with overriding
fun main()
{
   var a = BCD(200)
   var b = BCD()
   a.displayCount()
   b.displayCount()
}
open class ABC 
{
   open val count: Int = 0
   open fun think () 
{
      println("Hey!! i am thinking ")
   }}
class BCD(override val count: Int = 400): ABC() 
{
      override fun think() 
	{
      	println("I am from Child")
  	}
   
      fun displayCount()
	{
      println("Count value $count")
   	}
}

//accessing super class
open class Base {
   init{
      println("I am in Base class")
   }
}
open class Child: Base() {
   init{
      println("I am in Child class")
   }
}
class GrandChild: Child() {
   init{
      println("I am in Grand Child class")
   }
}
fun main() 
{
   var a = GrandChild()
}

//overriding properties
open class ABC 
{
   open val count: Int = 0
   open fun think () {
      println("Hey!! i am thinking ") }}
class BCD: ABC() {
   override val count: Int
   init{
      count = 100
   }
   override fun think() {
      println("I am from Child")
   } 
   fun displayCount(){
      println("Count value is $count")
   }}
fun main()
 {
   var  a = BCD()
   a.displayCount()
}



-------------------------DAY 3------------------------------

class MainActivity : AppCompatActivity(){
	private fun showlog(text: String){
		Log.d(MAIN_ACTIVITY_TAG, text)
	}

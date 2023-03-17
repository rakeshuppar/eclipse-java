
        Test

1. Java Components are

  a)Methods
  It means blocks of a code,we can perform some operations.
  
  b)Variables;
     it is a component of the java we can store some data/information.
	 
  c)constructors;
    it is a special type of method to initialize the objects;
    it is similar to the method but is called when instatnceof class created;	

2.Features of java;

  *simple and secure;
    it is easy learn and undestanding,it is simple also Easily available,
  *platform independent;
   same program run on different operating systems,return same result; 
  *portable;
  we can move/transfer programs from one sysytem to another sysytem;
  *distributed;
  *multithreded;
  *oops programming;
  like polymorphism,inheritance,encapsulation,abstraction;
  *networked;
  dynamic  in nature;
  
3.  Constructor;

     It is special type of method to initial the objects and it is similar to the method but 
	 it is called instatnce of class is created.
	 it does not have return type;
	 it declare with same classname;
	 
 Types of constructor;
 
     i)default constructor;
	   if there is no constructor in the class java compiler will provide default constructo by default;
	   
	 ii) parameterized constructor;
	      it consists of n number of parameters;
		  
4.Variables 
  it is container in orde to store the data/information.
  
  Types
  i)Class Variables;
   means declare a variables inside the class and outside mainmethod;
   
	 class Variables are two types;
	 
	 I)static Variables;
	  These are class level variables and declare with a static keyword;
	 
	 II)nonstatic Variables;
	 These are also class level variables and not declare with static keyword;
	 
  ii)Method Variables;
      means declare a variables in body of the mainmethod;
	  Method variables are two types;
	I)Local Variables
	   variable declare in the body of the main method;
    II)Parameter;
	   variables are declare in the parameter

  5.java is not pure object oriented programming language beacuse java has some inbulit members 
    like datatypes.datatypes are not createdby programmer it provide from the java.  
  
  6.Static Binding and Dynamic Binding

    Static Binding(Compile time polymorphism) 
      It is also called as Compile time polymorphism.
	  Method called at the compile time only;
	  It is also called as overloading;
	  Method overloading is an example for Static Binding;
	   Method overloading means class has two or more methode but same with class name but different in
	   parameter;
	   
	   
	Dyanamic Binding(Overloading)
	   
	  It is also called as Runtime Polymorphism.
	  Method called at the run time only.
	  It is also called as overriding.
	  Method overriding is an example for dynamic Binding;
      Method overriding means child class declare same method as declare
	  in the parent class and implement the method in the child class.  	  
      	  
	7.Oop's conceppts;
     	Oops mean object oriented programming.Java is stand on 4 principle
		Those are 
		
    Polymorphism;
	
	It derivered from two greek words,poly means 'many' morphism means 'forms'
	
    It means we can perform single action in different ways.
	
    Compile time polymorphism ;
	
    It is also called as Static Binding.
	Method called at the compile time only;
	It is also called as overloading;
	Method overloading is an example for Static Binding;
	Method overloading means class has two or more methode but same with 
	class name but different in parameter;
	   
	   
	Runtime Polymorphism;
	   
	It is also called as Dyanamic Binding.
	Method called at the run time only.
	It is also called as overriding.
	Method overriding is an example for dynamic Binding;
    Method overriding means child class declare same method as declare in
	the parent class.
    and implement the method in the child class. 
		
    Inheritance;
	
	It menas one class aquire the states and behavioures of another calss 
	by using extend Keyword;
	It represent is is-a relationship,which also known as parent-child relationship.
	
	Advantages of inheritance
	*It is use to code reuseability means write code once we can use multiple times.
	*It is also used to achieve overriding(Run-time Polymorphism).
	
	Types of inheritance
	
	a.single inheritance
	means one class extends another class,
	
	b.muti-level inheritance.
	  chaining of inheritance  
	  
	c.hirechally inheritance;
	  two or more child classes extends one parent class.
	  
	d.hybrid inheritance;
	  combination of two or more type of inheritance like single level and mutil-level inheritance.
	  
	e.Multiple inheritance;
	  one child class extends two or more parent classes.
	
    Encapsulation;
	
	It means grouping of data into a single block or single unit.
	java bean class is an example for encapsulation class.
	
	Rules of encapsulation
	*class should be public.
	*class should have setter and getter methods
	*variable declare as a private
    *class have one default constructor.

   Advantages of Encapsulation;
   *It provides control over the data.
   *By providing setter and getter method we can make the class read only or write only
   *It is the way to achieve data hiding,other classes cannot be able to access the data 
   through private data members.   
	
	
	
    Abstraction;
	
	hiding implementation
	
  11.Interface
      it means standard way to connect between two different classes.
	  it should public static abstract.
	  it contains abstract variables and methods.
	  it is achieve 100% abstract class;
	  
  12.Exception 
     It means it is an abnormal condition,when it occure stops the normal flow of a program.
      
     Types of Exception
      Checked Exception 
        java compiler is force to handle the exception.
		Except Error and Runtime exception all exceptios are checked exceptions.
		
	  Unchecked Exception
        java compiler is not to force handle exception.
        Runtime Exceptions is exmaple for Unchecked exception. 
		
	When Exception occure we need to handle the exception.we can handle exception by below ways;
	By using Try-catch blocks
	By using throws 
	By using multiple catch blocks
	By using nested try blocks
	
	13.Access specifier
	
	  public-
	  we can access the members inside class,inside the package.
	  
	  private-
	  no one can access the members;
	  
	  protected-
	  we can access the members inside class,inside the package;
	  
	  default-
	  There is no keyword for default,if we can declare without public,private,protected 
	  then it is default.
	  we can access the members inside the class,inside the package,outside the package.

	14.Differance between abstract and interface

       Abstract                                          Interface

   * It contains Abstract method,normal          *It only contains Abstract methods.
     methods or Concrete methods.	   
   * Class declare with abstract keywaord        *class declare with Interface keyword
   * Can achieve 50% abstraction	             *can achieve 100% abstraction.


	
     	

		
      		
			
			

	  
       	  
     	  
	
	
	  
	  
      	  
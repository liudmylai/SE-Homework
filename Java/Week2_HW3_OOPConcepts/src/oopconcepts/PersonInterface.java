package oopconcepts;
//6. Create an Interface PersonInterface.
//Declare one static final variable for the organization name and create 2 abstract methods in it. 
//One should be calculate which should take one int argument and should return a double value. The other method should be of your choice.

public interface PersonInterface {
   static final String ORGANIZATION="Organization";
   
   double calculate(int num);
   void display();
   
}

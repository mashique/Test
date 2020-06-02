class Animal  // Base class (parent) 
{
  public void animalSound() 
  {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal  // Derived class (child) 
{
  public void animalSound() 
  {

    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal  // Derived class (child) 
{
  public void animalSound() 
  {
    
    System.out.println("The dog says: bow wow");
  }
}

class Program 
{
	public static void main(String[] args) 
  {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object

    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}
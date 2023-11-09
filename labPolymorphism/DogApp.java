package labPolymorphism;

public class DogApp
{
    public static void main(String[] args)
    {
        Dog myDog = new Dog("Greyhound");
        System.out.println(myDog); // Print the newly created instance
        actAsDog(myDog);

        SledDog mySledDog = new SledDog("Husky");
        System.out.println(mySledDog);
        actAsDog(mySledDog);

        CircusDog myCircusDog = new CircusDog("Terrier");
        System.out.println(myCircusDog);
        actAsDog(myCircusDog);
        
        //Print the Header of array
        System.out.println("Using an array: ");
        System.out.println();
        // create an arrays of Dogs
        Dog [] dogs = {myDog, mySledDog, myCircusDog};
        
        for (Dog currentDog : dogs) {
        	// print instance following new line
        	System.out.println(currentDog);
        	
        	
        	//check wheather the current dogs is a SledDog
        	if(currentDog instanceof SledDog) {
        		//cast the current dog to sledDog and call the pullSled method
        		SledDog sledDog = (SledDog) currentDog;
        		
        		sledDog.pullSled();
        	}
        	//call the methods actAsDogs
        	actAsDog(currentDog);
        }
    }

    private static void actAsDog(Dog d)
    {
        d.communicate();
        d.move();
        System.out.println();
    }

   
}

package animalKingApp;

import java.util.*;

public class Main
{
	public static ArrayList<AbstractAnimal> filteredList = new ArrayList<AbstractAnimal>();

	public static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester)
	{
		filteredList.clear();

		for (AbstractAnimal v : animals)
		{
			if (tester.test(v))
			{
				System.out.println(v.getName() + " " + v.getYear()+ " " + v.getMove()+ " " + v.getBreath()+ " " + v.getReproduce());
				filteredList.add(v);
			}
		}
	}


	public static void main(String[] args)
	{
		MammalFromAnimal panda = new MammalFromAnimal("Panda", 1869);
        MammalFromAnimal zebra = new MammalFromAnimal("Zebra", 1778);
        MammalFromAnimal koala = new MammalFromAnimal("Koala", 1816);
        MammalFromAnimal sloth = new MammalFromAnimal("Sloth", 1804);
        MammalFromAnimal armadillo = new MammalFromAnimal("Armadillo", 1758);
        MammalFromAnimal raccoon = new MammalFromAnimal("Raccoon", 1758);
        MammalFromAnimal bigfoot = new MammalFromAnimal("Bigfoot", 2021);

        BirdFromAnimal pigeon = new BirdFromAnimal("Pigeon", 1837);
        BirdFromAnimal peacock = new BirdFromAnimal("Peacock", 1821);
        BirdFromAnimal toucan = new BirdFromAnimal("Toucan", 1758);
        BirdFromAnimal parrot = new BirdFromAnimal("Parrot", 1824);
        BirdFromAnimal swan = new BirdFromAnimal("Swan", 1758);
	
        FishFromAnimal salmon = new FishFromAnimal("Salmon", 1758);
        FishFromAnimal catfish = new FishFromAnimal("Catfish", 1817);
		FishFromAnimal perch = new FishFromAnimal("Perch", 1758);

        ArrayList<AbstractAnimal> myList = new ArrayList<AbstractAnimal>();
        myList.add(panda);
        myList.add(pigeon);
        myList.add(salmon);
        myList.add(zebra);
        myList.add(koala);
        myList.add(sloth);
        myList.add(armadillo);
        myList.add(raccoon);
        myList.add(bigfoot);
        myList.add(peacock);
        myList.add(toucan);
        myList.add(parrot);
        myList.add(swan);
        myList.add(catfish);
        myList.add(perch);

        // sort
        System.out.println("*** List all the animals in descending order by year named ***");
        myList.sort((v1, v2) -> v2.getYear()- v1.getYear());
        myList.forEach((v) -> System.out.println(v.getName()+ " " + v.getYear()));
        System.out.println("\n");

        System.out.println("*** List all the animals alphabetically ***");

        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        myList.forEach((v) -> System.out.println(v.getName()));
        System.out.println("\n");

        System.out.println("*** List all the animals order by how they move ***");

        myList.sort((v1, v2) -> v1.getMove().compareToIgnoreCase(v2.getMove()));
        myList.forEach((v) -> System.out.println(v.getName()+ " " + v.getMove()));
        System.out.println("\n");

        System.out.println("*** List only those animals the breath with lungs ***");
        printAnimals(myList, v -> v.getBreath() == "Lungs");
        System.out.println("\n");
        
        System.out.println("*** List only those animals that breath with lungs and were named in 1758 ***");
        printAnimals(myList, v -> v.getBreath() == "Lungs" && v.getYear() == 1758);
        System.out.println("\n");
        

        System.out.println("*** List only those animals that lay eggs and breath with lungs ***");
        printAnimals(myList, v -> v.getBreath() == "Lungs" && v.getReproduce() == "Eggs");
        System.out.println("\n");

        System.out.println("*** List alphabetically only those animals that were named in 1758 ***");
        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        printAnimals(myList, v -> v.getYear() == 1758);
        System.out.println("\n");

	}
}

package animalKingApp;

// object -> AbstractVehicle -> HorseFromVehicle

public class MammalFromAnimal extends AbstractAnimal
{
	

	public MammalFromAnimal(String name, int year)
	{
		super(name,year);
		this.name = name;
		this.year = year;
	}


	@Override
	public String getMove()
	{
		return "Walk";
	}
	@Override
	public String getBreath()
	{
		return "Lungs";
	}
	@Override
	public String getReproduce()
	{
		return "Live Births";
	}


	@Override
    public String toString()
    {
        return "BirdFromAnimal{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
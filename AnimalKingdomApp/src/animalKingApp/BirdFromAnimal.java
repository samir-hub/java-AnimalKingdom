package animalKingApp;

// object -> AbstractVehicle -> HorseFromVehicle

public class BirdFromAnimal extends AbstractAnimal
{
	

	public BirdFromAnimal(String name, int year)
	{
		super(name,year);
		this.name = name;
		this.year = year;
	}


	@Override
	public String getMove()
	{
		return "Fly";
	}
	@Override
	public String getBreath()
	{
		return "Lungs";
	}
	@Override
	public String getReproduce()
	{
		return "Eggs";
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
package animalKingApp;

// object -> AbstractVehicle -> HorseFromVehicle

public class FishFromAnimal extends AbstractAnimal
{
	

	public FishFromAnimal(String name, int year)
	{
		super(name,year);
		this.name = name;
		this.year = year;
	}


	@Override
	public String getMove()
	{
		return "Swim";
	}
	@Override
	public String getBreath()
	{
		return "Gills";
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
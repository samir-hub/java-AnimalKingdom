package animalKingApp;

// fields
// methods
// "abstract" methods

public abstract class AbstractAnimal
{
    private static int maxId = 0;
	private int id;
    protected String name; 
    protected int year;
    

	public AbstractAnimal(String name, int year)
	{
        maxId++;
		id = maxId;
        this.name = name;
        this.year = year; 
	}

	
    public abstract String getMove();
    public abstract String getBreath();
    public abstract String getReproduce();
    

	public String getName()
	{
		return name;
    }
    
    public int getYear()
	{
		return year;
    }

    public String eat()
    {
        return "Monch";
    }
}

	
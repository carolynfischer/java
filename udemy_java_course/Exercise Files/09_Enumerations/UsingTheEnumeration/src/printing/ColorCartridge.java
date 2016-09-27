package printing;

public enum ColorCartridge implements ICartridge{
	
	Red,
	Blue,
	Green,
	Yellow;
	
	@Override
	public String toString()
	{
		return "Color!";
    }

	@Override
	public String getFillPercentage()
	{
		return "97%";
	}

}



public class Record
	{
	
	private int numberCode;
	private String letterCode;
	
public Record (String lC, int nC)
	{
	
	numberCode = nC;
	letterCode = lC;
	}
	
public int getNumberCode()
{
return numberCode;
}

public String getLetterCode()
	{
     return letterCode;
	}

public void setNumberCode(int numberCode)
	{
	this.numberCode = numberCode;
	}

public void setLetterCode(String letterCode)
	{
	this.letterCode= letterCode;
	}

	}
	

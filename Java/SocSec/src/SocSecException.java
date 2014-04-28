package week8;
import java.lang.Exception;

public class SocSecException extends Exception
{
	public SocSecException (String err)
	{
		super("Invalid Social Security number" + err);
	}

}

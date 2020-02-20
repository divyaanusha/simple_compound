package epam.simple_and_compound;

/**
 * Hello world!
 *
 */
interface Interest
{
	public void calculate(double amount,double time_period,double rate_of_interest);
}
class Simple_Interest implements Interest
{
	public void calculate(double amount,double time_period,double rate_of_interest) {
		System.out.println((amount*rate_of_interest*time_period)/100);
	}
	
}
class Compound_Interest implements Interest
{
	public void calculate(double amount,double time_period,double rate_of_interest)
	{
		System.out.println((amount*(Math.pow((1 + rate_of_interest / 100), time_period)))-amount);
	}
	
}

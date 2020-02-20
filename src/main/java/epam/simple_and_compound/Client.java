package epam.simple_and_compound;
public class Client 
{
    public static void main( String[] args )
    {
        Interest i;
        i=new Simple_Interest();
        i.calculate(10000,1 , 10);
        i=new Compound_Interest();
        i.calculate(10000,1 , 10);
        
        
    }
}

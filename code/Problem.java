class OneException extends Exception
{
    String message;
    public OneException(String message)
    {
        super(message);
        this.message=message;
    }
}
class ZeroException extends Exception
{
    String message;
    public ZeroException(String message)
    {
        super(message);
        this.message=message;
    }
}
public class Problem
{
    static int process(int a)throws OneException,ZeroException
    {
        if(a==0)
        {
            throw new ZeroException("Zero exception");
            
        }
        else if(a==1)
        {
            throw new OneException("One exception");
        }
        return a;
    }
    public static void main(String[]args)
    {
        try
        {
            int data = process(0);
            System.out.println("Data "+data);
        }
        catch(OneException e)
        {
            System.out.println(e.getMessage());
        }
        catch(ZeroException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
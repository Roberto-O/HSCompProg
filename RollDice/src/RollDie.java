
public class RollDie
{
    private int num;

      //Default constructor
      //Sets the default number rolled by a die to 1
    RollDie()
    {
        num = 1;
    }

    public int roll()
    {
        num = (int) (Math.random() * 6) + 1;

        return num;
    }


    public int getNum()
    {
        return num;
    }


    public String toString()
    {
        return "" + num;
    }
}


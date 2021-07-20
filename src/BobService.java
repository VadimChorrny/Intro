public class BobService {

    public int Code;
    public int Money;
    public int Lazy;

    public BobService(int code,int money,int lazy)
    {
        this.Code = code;
        this.Money = money;
        this.Lazy = lazy;
    }


    public int FirstTask(int money, int lazy)
    {
         Lazy = lazy*50;
         Code = money * 100/Lazy;
         return Code;
    }

    public int ThirdTask(int code,int lazy)
    {
        Lazy = lazy * 50;
        Code = Money - Lazy;
        return Money;
    }

}

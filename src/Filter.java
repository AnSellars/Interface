public interface Filter
{

    boolean accept(Object x);

}

class ShortWordFilter implements Filter
{
    @Override
    public boolean accept(Object x)
    {
        String str = (String) x;
        return (str.length() > 5);
    }
}

class BigRectangleFilter implements Filter
{

    @Override
    public boolean accept(Object x) {
        int p  = (int) x;
        return (p > 10);
    }
}

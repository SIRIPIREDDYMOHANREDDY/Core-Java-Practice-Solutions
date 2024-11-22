class Ke
{
public static void main(String[] args)
{
System.out.println(Su.i);
}
}
class Su
{
static int i ;
static
{
System.out.println(Su.i);
i = 10;
}
}
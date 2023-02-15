public class Arithmetic
{
int a=5;
int b=2;
int c;


int add ()
{
c=a+b;
System.out.println("add value is"+c);
return c;
}


int sub()
{
c=a-b;
System.out.println("subvalue is"+c);
return c;
}


public static void main(String args[])
{
Arithmetic obj=new Arithmetic();
obj.add();
obj.sub();
}

}

public class Calculator
{

double add(double a,double b)
{
double c= a+b;
System.out.println("addtion value is"+c);
return c;
}


double sub(double a,double b)
{
double c= a-b;
System.out.println("subtraction value is"+c);
return c;
}


double mul(double a,double b)
{
double c= a*b;
System.out.println("multiplication value is"+c);
return c;
}


double divQ(double a,double b)
{
double c= a/b;
System.out.println("modulo value is"+c);
return c;
}

double divR(double a,double b)
{
double c= a%b;
System.out.println("modulo value is"+c);
return c;
}

public static void main(String args[])
{
Calculator cal=new Calculator();
cal.add(7.0,5.0);
cal.sub(9.0,7.0);
cal.mul(5.0,5.0);
cal.divQ(2.5,1.5);
cal.divR(3.5,1.5);

}

}

class rbi
{
double credit(double balance, double amount)
{
balance = balance+amount;
System.out.println(balance);
return balance;
}

double debit(double balance, double amount)
{
balance = balance-amount;
System.out.println(balance);
return balance;
}
public static void main(String arugs[])
{

rbi rb = new rbi();
rb.credit(100.0,50.0);
rb.debit(10.0,20.0);
}

}

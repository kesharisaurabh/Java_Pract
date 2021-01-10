package NumericComputation;

class Account
{
    int id;
    double balance;
    double intrestRate;
    public double getBalance() {
        return balance;
    }
    public int getId() {
        return id;
    }
    public void setIntrestRate(double intrestRate) {
        this.intrestRate = intrestRate;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getIntrestRate() {
        return intrestRate;
    }
	public Account(int id, double balance, double intrestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.intrestRate = intrestRate;
	}
    
}
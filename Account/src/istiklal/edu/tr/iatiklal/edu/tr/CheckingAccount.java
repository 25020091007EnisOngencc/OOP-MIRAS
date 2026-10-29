package iatiklal.edu.tr;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount() {
        super();
        this.overdraftLimit = 500;
    }

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Hata: Overdraft limitiniz ($" + overdraftLimit + ") aşıldı! Para çekilemedi.");
        }
    }

    @Override
    public String toString() {
        return "Checking Account\n" + super.toString() + "\nOverdraft Limiti: $" + overdraftLimit;
    }
}
package session05.task;

public class ConfidentialBankAccount {

    // TODO Aufgabe 1: Sichtbarkeitsmodifikatoren ändern
    int accountNumber;
    double balance;
    double overdraftLimit;

    public ConfidentialBankAccount(int accountNumber, double balance, double overdraftLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    // TODO Aufgabe 1: Methoden zum Auslesen der Attribute implementieren

    // TODO Aufgabe 1: Methode zum Setzen von overdraftLimit implementieren

    void printInfo() {
        System.out.println("Accountnumber: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
        System.out.println("-----------------------");
    }

    void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    void transfer(double amount, ConfidentialBankAccount to) {
        this.withdraw(amount);
        to.deposit(amount);
    }

    /*
     * TODO Aufgabe 2: calculateWithdrawLimit
     * Für das Auszahlungslimit wird sowohl der Kontostand als auch das Kreditlimit berücksichtigt
     */

    double calculateWithdrawLimit() {
        // replace with your implementation
        return 0.0;
    }

    /*
     * TODO Aufgabe 2: transferChecked
     * Vor jeder Überweisung soll sichergestellt werden,
     * ob der Betrag unter Einhaltung des Kreditlimits abgebucht werden kann.
     */

    void transferChecked(double amount, ConfidentialBankAccount to) {}
}
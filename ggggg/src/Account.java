public class Account {
    String accountname;
    int accountnum;
    int balance;

    Account() {
        this.accountname = "EMPTY";
        this.accountnum = 0;
        this.balance = 0;
    }

    Account(String name, int num, int amt) {
        this.accountname = name;
        this.accountnum = num;
        this.balance = amt;
    }

    public void deposit(int amt) {
        this.balance += amt;
    }

    public void withdraw(int amt) {
        this.balance -= amt;
    }

    public void setaccountname(String name) {
        this.accountname = name;
    }

    public void setaccountnum(int num) {
        this.accountnum = num;
    }

    public void setbalance(int num) {
        this.balance = num;
    }

    public String getaccountname() {
        return this.accountname;
    }

    public int getaccountnum() {
        return this.accountnum;
    }

    public int getbalance() {
        return this.balance;
    }

    public void print() {
        System.out.println(this.accountname + " " + this.accountnum + " " + this.balance);
    }
}

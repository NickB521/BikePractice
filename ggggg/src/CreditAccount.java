public class CreditAccount extends Account {
    int creditLimit;

    CreditAccount() {
        this.creditLimit = 100;
    }

    CreditAccount(String name, int num, int amt, int credit) {
        super(name, num, amt);
        this.creditLimit = credit;
    }

    public void setcreditlimit(int num) {
        this.creditLimit = num;
    }

    public int getcreditlimit() {
        return this.creditLimit;
    }

    public void print() {
        System.out.println(this.accountname + " " + this.accountnum + " " + this.balance + " " + this.creditLimit);
    }
}

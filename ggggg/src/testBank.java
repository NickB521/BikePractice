
public class testBank {
    public testBank() {
    }

    public static void main(String[] args) {
        Account A1 = new Account("Sanjay Gupta", 11556, 300);
        Account A2 = new Account();
        Account A3 = new Account();
        A2.setaccountname("He Xai");
        A2.setaccountnum(22338);
        A2.setbalance(500);
        A3.setaccountname("Ilya Mustafana");
        A3.setaccountnum(44559);
        A3.setbalance(1000);
        A1.print();
        A2.print();
        A3.print();
    }
}

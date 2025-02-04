public class Account {
    
    //Atributes
    private String holder;
    private int number;
    private double balance;

    //Contructors
    public Account(String holder, int number, double balance){
        super();

        this.holder = holder;
        this.number = number;
        this.balance = balance;
    }

    //Getters and setters
    public String getHolder() {
            return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Methods
    public void deposit(double amount){
        this.balance += amount;
    }
    public boolean withdraw(double amount){
        if (this.balance >= amount) {
            //ask for account number

            this.balance -= amount;
            return 1;
        }else {
            return 0;
        }
    }
    public void seeBalance(String holder){
        System.out.println("Current banlance :" + this.balance);
    }
    
}

public class Bank {

    //Atributes
    private String name;
    private String address;
    private ArrayList<Account> client;

    //Constructors
    public Bank(String name, String address, Account client) {
        super();

        this.name = name;
        this.address = address;
        this.client = client;
    } 

    //Getters and setters
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Account getClient() {
		return this.client;
	}

	public void setClient() {
		this.client = client;
	}

    //Methods
    public boolean sendMoney(int debitor, int creditor){

		return 1;
    }
    public boolean addClient(String account){
        this.ArrayList<>.add(account);
    }

}

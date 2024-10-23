package com.example.demo11;

public class Bank {

	// 賦予 brance 新的預設值，而不是程式本身的預設值 null
	private String branch = "TTA 分行";

	private String user;

	private int balance;
	
	private final static int aaa = 500;
	
	// 預設建構方法，格式: 方法的存取權限 類別名稱(){}
	//                       public     Bank() {}
	// 預設建構方法 --> 就是沒有參數的建構方法
	// 當類別中沒有建立帶有參數的建構方法時，沒有參數的建構方法就是預設建構方法，其省略不寫也可以使用
	// 類別中有建立帶有參數的建構方法時，沒有參數的建構方法就不再是預設建構方法，沒寫就不能使用
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 帶有參數的建構方法，實作內容等同於 setXXX 方法，實際作用在於減少程式碼的行數
	public Bank(String branch, String user, int balance) {
		super();
		this.branch = branch;
		this.user = user;
		this.balance = balance;
	}


	// 建立屬性的存(get)取(set)方法
	// 一般方法:
	// 格式: 方法的存取權限 方法回傳值的資料型態 方法名稱(參數資料型態 參數變數名稱) {方法的實作內容}
	//         public           String          getBranch() {}
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 存款
	public void saving(int amount) {
		System.out.println("存款前餘額: " + balance);
		// 判斷 amount 是否為正數
		if(amount >= 0) {
			// 原本的金額 + 存款金額
			balance = balance + amount; // balance += amount;
		} else {
			System.out.println("存款金額不能為負數!!");
		}		
		System.out.println("存款後餘額: " + balance);
	}

	// 提款
	public void withdraw(int amount) {
		// 排除金額是負數
		if(amount < 0) {
			System.out.println("提款金額不能為負數!!");
			return;
		}
		// 排除餘額不足
		// amount: 提款金額； balance: 原本的餘額
		if(amount > balance) {
			System.out.println("餘額不足!!");
			return;
		}
		System.out.println("提款前金額: " + this.balance);
		balance = balance - amount; // balance -= amount;
		System.out.println("提款後金額: " + this.balance);
	}
	
	public void withdraw(Bank bank) {
		System.out.println(bank.getBranch());
		System.out.println(bank.getUser());
		System.out.println(bank.getBalance());
	}
	
	public void withdraw(String branch, String user, int balance) {
		System.out.println(branch);
		System.out.println(user);
		System.out.println(balance);
		return;
		
	}
	
	public String withdraw(String branch) {
		return "";
	}
	
	public int withdraw1(String branch) {
		return 5;
	}
	
	public Bank withdraw2(String branch) {
		return new Bank();
	}
	
	public void withdraw3(String title, String branch, String user, int balance) {
		System.out.println(branch);
		System.out.println(user);
		System.out.println(balance);
		return;
		
	}
	
	public static void withdraw31(String title, String branch, String user, int balance) {
		System.out.println(branch);
		System.out.println(user);
		System.out.println(balance);
		return;
		
	}
	
	public void withdraw4(int balance, String ...params) {
		// params 是陣列，包含了 title, branch, user
		String title = params[0];
		String branch = params[1];
		String user = params[2];
		System.out.println(branch);
		System.out.println(user);
		System.out.println(balance);
		return;
		
	}

}

public class Main {

    interface operation {
        void deposit(double amount);
        void withdraw(double amount);
        void showDetail();
    }
    class Bank implements operation{
        private String userName;
        private String accID;
        private double balance;
        public Bank(){
            userName = "N/A";
            accID = "N/A";
            balance = 0.0;
        };
        public Bank(String userName, String accID, double balance) {
            this.userName = userName;
            this.accID = accID;
            this.balance = balance;
        }

        @Override
        public void deposit(double amount) {
              balance += amount;
        }

        @Override
        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Insufficient Balance");
            } else {
                balance -= amount;
            }
        }

        @Override
        public void showDetail() {
            System.out.println("Username: " + userName);
            System.out.println("Account ID: " + accID);
            System.out.println("Balance: " + balance);
        }
    }
    class otherBank extends Bank implements operation {
        static double fee = 2.0;
        public otherBank(String userName, String accID, double balance, double fee) {
            super(userName, accID, balance);
        }

    }
    public static void main(String[] args) {
        {

        }
    }
}
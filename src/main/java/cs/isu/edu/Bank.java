package cs.isu.edu;

public class Bank {
    double[] accNumbersArray={821521,825123,912321,124589};
    double[] money={1000,5200.0,32055.21,1200};
    
    public void deposit(){
        for (int i = 0; i <accNumbersArray.length ; i++) {
            accNumbersArray[i]= money[i];
        }
    }

    public double getBalance(double accountNumber){
        double balance=0;
        for (int i = 0; i <accNumbersArray.length ; i++) {
            if (accountNumber ==accNumbersArray[i]) {
                balance=money[i];
            }
        }
        return balance;
    }

    public static void main(String[] args) {
        Bank bank=new Bank();
        System.out.println(bank.getBalance(8215210));
    }

}

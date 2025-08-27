public class atm_transaction {
    public static void main(String[] args) {
        int account_balance=0;
        int arr[]={2000,-500,1000,-200,-700};
        for(int i=0;i<arr.length;i++){
            account_balance +=arr[i];

        }
        if(account_balance<0){
            System.out.println("account overdraft");
            
        }
        else{
            System.out.println(account_balance);
        }
    }
}

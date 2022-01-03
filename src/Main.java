public class Main {

    public static void main(String[] args) {
	// write your code here
        int number=28;
        int total=0;
        for (int i=1;i<number;i++){
            if (number % i ==0){
                total=total+i;
            }
        }
        if (total==number){
            System.out.println("Mmükemmel Sayıdır");
        }
        else {
            System.out.println("Mükemmel sayı değildir");
        }
    }
}

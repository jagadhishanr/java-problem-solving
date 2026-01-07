public class sumoddeven{
    public static void main(String[]args){
       int sumeven = 0;
        int sumodd = 0;

        for(int i=0; i<=100; i++){
            if(i%2==0){
                sumeven += i;
            }
            else{
                sumodd += i;
            }
        }
        System.out.println("Total sum of even number is:" + sumeven);
        System.out.println("Total sum of odd number is:" + sumodd);
    }
}
import java.util.*;
class pair{
    int first;
    int second;

    pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}

public class pairSelectionSort{

      public static boolean isSmaller(pair p1, pair p2) {
    if (p1.first < p2.first) return true;
    if (p1.first == p2.first && p1.second < p2.second) return true;
    return false;
}

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        pair [] arr = new pair[n];
        for(int i=0; i<n; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            arr[i] = new pair(a,b);
        }
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(isSmaller(arr[j],arr[minIndex])){
                    minIndex = j;
                }
            }
            pair temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i].first + " " + arr[i].second);
        }




    }
}

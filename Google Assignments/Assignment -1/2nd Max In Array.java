import java.util.Scanner;

class Main {
  public static void secondLargest(int arr[],int n){
    int first=-1,second=-1;
    for(int i=0;i<n;i++){
      if(arr[i]>=first){
        second=first;
        first=arr[i];
      }
    }
    System.out.println(second);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //size of arr
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    secondLargest(arr,n);
  }
}

import java.util.Scanner;
class Main {
  public static int findGcd(int a,int b){
    if(b==0){
      return a;
    }
    else{
      return findGcd(b,a%b);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println(findGcd(a,b));
  }
}

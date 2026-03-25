package _0325;

public class Test1 {
    static int Sol(int num1, int num2){
        int answer = 0;
        answer = num1*num2;
        return answer;
    }

     int Sol2(int a, int b){
        return a+b;
    }
     int Sol3(int a, int b){
        return a-b;
    }
    int Sol4(int a, int b){
        return a/b;
    }
    int sol5(int num1, int num2) {

            double a =(double)num1;
            double b = (double)num2;
            double c = a/b*1000;
            int answer = (int)c;
            return answer;

    }
    public static void main(String[] args) {
        System.out.println(Sol(9,10));
    }


}

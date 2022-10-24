class CalculatePower {
    public int calculate(int x, int n) {

        if(n == 0 || x == 1) {
            return 1;
        }

        if(n == 1 || x == 0) {
            return x;
        }
         if(n == 2) {
             return x * x;
         }

        while(n > 0){
            if(n % 2 == 0) {
                return calculate(x,n/2) * calculate(x,n/2);
            }
            else {
                return x * calculate(x,n/2) * calculate(x,n/2);
            }
        }
        return -1;

    }
}

public class Power {
    public static void main(String[] args) {

        int x = 2;
        int n = 7;
        CalculatePower calculatePower = new CalculatePower();
        System.out.println(calculatePower.calculate(x,n));
    }
}

//定義MyMath介面
interface MyMath {
    void show();
    void add(int a, int b);
    void sub(int a, int b);
    void mul(int a, int b);
    void div(int a, int b);
}

//定義AdvancedMath介面
interface AdvancedMath {
    void mod(int a, int b);
    void fac(int a);
    void pow(int a, int b);
}

//Compute
class Compute implements MyMath, AdvancedMath {
    private int ans;
    //add
    public void add(int a, int b) {
        ans = a + b;
    }
    //sub
    public void sub(int a, int b) {
        ans = a - b;
    }
    //mul
    public void mul(int a, int b) {
        ans = a * b;
    }
    //div
    public void div(int a, int b) {
        ans = a / b;
    }
    //mod
    public void mod(int a, int b) {
        ans = a % b;
    }
    //fac
    public void fac(int a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        ans = factorial;
    }
    //pow
    public void pow(int a, int b) {
        ans = (int) Math.pow(a, b);
    }
    //show
    public void show() {
        System.out.println("ans=" + ans);
    }
}

public class hw11_07 {
    public static void main(String args[]) {
        Compute cp = new Compute();
        cp.mul(3, 5);
        cp.show();               //輸出ans=15
        cp.mod(14, 5);
        cp.show();              //輸出ans=4
        cp.fac(5);
        cp.show();              //輸出ans=120
    }
}

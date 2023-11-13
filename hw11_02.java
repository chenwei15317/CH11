// 定義抽象類別
abstract class MyMath {
    protected int ans; //成員變數ans

    //顯示結果
    public void show() {
        System.out.println("ans=" + ans);
    }

    //計算a+b
    public abstract void add(int a, int b);

    // 計算a-b
    public abstract void sub(int a, int b);

    //計算a*b
    public abstract void mul(int a, int b);

    //計算a/b
    public abstract void div(int a, int b);
}

//Compute繼承自MyMath
class Compute extends MyMath {
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
}

public class hw11_02 {
    public static void main(String args[]) {
        Compute cp = new Compute();             // 建立Compute物件
        cp.mul(3, 5);               // 呼叫mul計算3*5
        cp.show();              //顯示結果
    }
}

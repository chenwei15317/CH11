//定義介面
interface MyMath {
    // 顯示結果
    public void show();

    //計算a+b
    public void add(int a, int b);

    //計算a-b
    public void sub(int a, int b);

    // 計算a*b
    public void mul(int a, int b);

    // 計算a/b
    public void div(int a, int b);
}

// Compute繼承自implements
class Compute implements MyMath {
    private int ans; // 私有成員變數 ans

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

    //show
    public void show() {
        System.out.println("ans=" + ans);
    }
}

public class hw11_04 {
    public static void main(String args[]) {
        Compute cp = new Compute();                 //建立Compute物件
        cp.mul(3, 5);               //呼叫mul計算 3*5
        cp.show();              //顯示結果
    }
}

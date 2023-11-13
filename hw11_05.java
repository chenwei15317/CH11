//定義介面
interface iAaa {
    // 顯示方法
    public void show();
}

//定義Bbb
class Bbb {
    public int num = 10;

    //設定數字
    public void set(int n) {
        num = n;
    }
}

//Ccc繼承自Bbb並實作iAaa介面
class Ccc extends Bbb implements iAaa {
    // 實作介面中的show
    public void show() {
        System.out.println("num=" + num);
    }
}

public class hw11_05 {
    public static void main(String args[]) {
        Ccc obj = new Ccc();                //建立Ccc物件
        obj.set(5);              //使用Bbb類別的set設定num為5
        obj.show();              //呼叫Ccc類別中的show，輸出"num=5"
    }
}

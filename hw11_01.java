// 抽象類別 Caaa
abstract class Caaa {
    //成員變數num
    protected int num;
    
    // 建構子，初始化num
    public Caaa(int n) {
        this.num = n;
    }
    
    // 抽象方法，子類別需實作
    public abstract void show();
}

//Cbbb繼承自Caaa
class Cbbb extends Caaa {
    // 建構子，呼叫父類別建構子
    public Cbbb(int n) {
        super(n); 
    }
    
    //show
    public void show() {
        System.out.println("num 的值是: " + num);
    }
}

public class hw11_01 {
    public static void main(String args[]) {
        // 創建Cbbb物件，傳入初始值 2
        Cbbb bb = new Cbbb(2);
        
        //呼叫Cbbb物件
        bb.show();
    }
}

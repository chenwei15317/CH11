//定義Date介面
interface Date {
    void showDate();
}

// 定義Test介面
interface Test {
    void showScore();
    double calcu();
}

//Stu類別
class Stu implements Date, Test {
    protected String id;                //學號
    protected String name;              //姓名
    protected int mid;                  //期中考成績
    protected int finl;                 //期末考成績
    protected int common;               //平時成績

    // 建構子
    public Stu(String id, String name, int mid, int finl, int common) {
        this.id = id;
        this.name = name;
        this.mid = mid;
        this.finl = finl;
        this.common = common;
    }

    //實作Date介面
    public void showDate() {
        System.out.println("學號：" + id);
        System.out.println("姓名：" + name);
    }

    // 實作Test介面
    public void showScore() {
        System.out.println("期中考成績：" + mid);
        System.out.println("期末考成績：" + finl);
        System.out.println("平時成績：" + common);
    }

    // 實作Test介面
    public double calcu() {
        // 計算學期成績
        double semesterScore = (mid * 0.3) + (finl * 0.3) + (common * 0.4);
        return semesterScore;
    }

    // 顯示全部資訊
    public void show() {
        showDate();
        showScore();
        System.out.println("學期成績：" + calcu());
    }
}

public class hw11_08 {
    public static void main(String args[]) {
                        //建立Stu物件並顯示資訊
        Stu stu = new Stu("940001", "Fiona", 90, 92, 85);
        stu.show();
    }
}

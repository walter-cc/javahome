/*
# 此範例執行步驟

# 在「命令提示元(cmd)」裡面執行

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> 產生 "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## 不用加副檔名

===============================
# 執行結果 :

C:\D_drive\6_javahome>javac Calculation1.java       -> 產生 "Calculation1.class" + "Calc1.class" + "Plus.class"   !!!!!!! (重要)

C:\D_drive\6_javahome>java Calculation1
27 + 32 = 59

===============================
# 參考文件 :
  全民學程式設計：從插畫學 Java，株式?社??? (ANK Co., Ltd.)

*/

abstract class Calc1        // 抽象類別
{
    int a;
    int b;
    abstract void answer(); // 抽象方法
    
    void setData(int m, int n)
    {
        a = m;
        b = n;
    }
}

class Plus extends Calc1
{
    void answer()   //實作，覆寫抽象方法
    {
        System.out.println(a + " + " + b + " = " + (a+b));
    }
}

class Calculation1   // 「檔案名稱」必須與「類別名稱」的大小寫完全相同，否則會發生錯誤 !!!!!!! (重要)
{
    public static void main(String[] args)
    {
        Plus plus = new Plus();
        plus.setData(27,32);
        plus.answer();
    }
}

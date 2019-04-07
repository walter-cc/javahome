/*
# 此範例執行步驟

# 在「命令提示元(cmd)」裡面執行

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> 產生 "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## 不用加副檔名

===============================
# 執行結果 :

C:\D_drive\6_javahome>javac Meet1.java               -> 產生 "Meet.class" + "Greet.class" + "Bye.class" + "Greeting.class"  !!!!!!! (重要)

C:\D_drive\6_javahome>java Meet1
你好!
再見!


===============================
# 參考文件 :
  全民學程式設計：從插畫學 Java，株式?社??? (ANK Co., Ltd.)

*/

interface Greet      // 介面(interface)
{
    void greet();
}

interface Bye extends Greet      // 左子右父。介面Bye繼承介面Greet
{
    void bye();
}

class Greeting implements Bye   // 類別Greeting實作介面Bye
{
    public void greet()      // 介面實作
    {
        System.out.println("你好!");
    }

    public void bye()      // 介面實作
    {
        System.out.println("再見!");
    }
}

class Meet1   // 「檔案名稱」必須與「類別名稱」的大小寫完全相同，否則會發生錯誤 !!!!!!! (重要)
{
    public static void main(String[] args)
    {
        Greeting greeting = new Greeting();
        greeting.greet();
        greeting.bye();
    }
}

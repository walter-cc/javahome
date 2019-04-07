/*
# 此範例執行步驟

# 在「命令提示元(cmd)」裡面執行

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> 產生 "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## 不用加副檔名

===============================
# 執行結果 :

C:\D_drive\6_javahome>javac Meet.java               -> 產生 "Meet.class" + "Geet.class" + "Talk.class" + "Morning.class"  !!!!!!! (重要)

C:\D_drive\6_javahome>java Meet
早安
今天天氣真好


===============================
# 參考文件 :
  全民學程式設計：從插畫學 Java，株式?社??? (ANK Co., Ltd.)

*/

interface Geet      // 介面(interface)
{
    void greet();
}

interface Talk      // 介面(interface)
{
    void talk();
}

class Morning implements Geet, Talk
{
    public void greet()      // 介面實作
    {
        System.out.println("早安");
    }

    public void talk()      // 介面實作
    {
        System.out.println("今天天氣真好");
    }
}

class Meet   // 「檔案名稱」必須與「類別名稱」的大小寫完全相同，否則會發生錯誤 !!!!!!! (重要)
{
    public static void main(String[] args)
    {
        Morning morning = new Morning();
        morning.greet();
        morning.talk();
    }
}

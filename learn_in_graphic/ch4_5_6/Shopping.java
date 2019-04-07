/*
# 此範例執行步驟

# 在「命令提示元(cmd)」裡面執行

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> 產生 "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## 不用加副檔名

===============================
# 執行結果 :

C:\D_drive\6_javahome>javac Shopping.java           -> 產生 "Shopping.class" + "Purse.class"   !!!!!!! (重要)

C:\D_drive\6_javahome>java Shopping
餘額為900元。
餘額為650元。
尚不足150元。

===============================
# 參考文件 :
  全民學程式設計：從插畫學 Java，株式?社??? (ANK Co., Ltd.)

*/

class Purse
{
    // 「static」是一個用來修飾「欄位」與「方法」的修飾子。從相同類別建立出的物件，可以透過加上「static」的方式讓欄位的值統一。
    static int money = 0;   // 統一儲值在總部

    void printMoney(int in, int out)
    {
        money = money + in - out;

        if(money < 0)
            System.out.println("尚不足" + (-1 * money) + "元。");
        else
            System.out.println("餘額為" + money + "元。");
    }
}

class Shopping   // 「檔案名稱」必須與「類別名稱」的大小寫完全相同，否則會發生錯誤 !!!!!!! (重要)
{
    public static void main(String[] args)
    {
        Purse store1 = new Purse();     // 分店1
        Purse store2 = new Purse();     // 分店2

        store1.printMoney(1000,100);    // 在分店1儲值和消費
        store2.printMoney(0,250);       // 在分店2消費
        store1.printMoney(0,800);       // 在分店1消費
    }
}

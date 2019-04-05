/*
# 此範例執行步驟

# 在「命令提示元(cmd)」裡面執行

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> 產生 "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## 不用加副檔名

===============================
# 執行結果 : 

C:\D_drive\6_javahome>javac StringClass.java

C:\D_drive\6_javahome>java StringClass
len = 6
「Java繪本」的最後兩個字為「繪本」。
的確是繪本。

===============================
# 參考文件 :
  全民學程式設計：從插畫學 Java，株式?社??? (ANK Co., Ltd.)

*/


class StringClass   // 「檔案名稱」必須與「類別名稱」的大小寫完全相同，否則會發生錯誤 !!!!!!! (重要)
{
    public static void main(String[] args)
    {
        String a = "Java繪本";
        int len = a.length();   // len = 6
        
        String b = a.substring(len -2, len);
        int c = b.compareTo("繪本");
        
        System.out.printf("len = %d\n",len);
        System.out.println("「"+ a + "」的最後兩個字為「" + b + "」。");     // println() : 讓()當中的字串顯示在畫面上並換行。
        System.out.println((c == 0 ? "的確是" : "並不是") + "繪本。"); 
    }
}

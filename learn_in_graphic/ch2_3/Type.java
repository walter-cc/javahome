/*
# 此範例執行步驟

# 在「命令提示元(cmd)」裡面執行

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> 產生 "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## 不用加副檔名

===============================
# 執行結果 : 

C:\D_drive\6_javahome>javac Type.java

C:\D_drive\6_javahome>java Type
3 / 2 = 1
3.0 / 2.0 = 1.5
3.0 / 2 = 1.5
3 / 2.0 = 1.5

===============================
# 參考文件 :
  全民學程式設計：從插畫學 Java，株式?社??? (ANK Co., Ltd.)

*/

class Type   // 「檔案名稱」必須與「類別名稱」的大小寫完全相同，否則會發生錯誤 !!!!!!! (重要)
{
    public static void main(String[] args)
    {
        System.out.println("3 / 2 = " + 3/2);           // 1
        System.out.println("3.0 / 2.0 = " + 3.0/2.0);   // 1.5
        System.out.println("3.0 / 2 = " + 3.0/2);       // 1.5
        System.out.println("3 / 2.0 = " + 3/2.0);       // 1.5
    }
}

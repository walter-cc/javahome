/*
# 此範例執行步驟

# 在「命令提示元(cmd)」裡面執行

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> 產生 "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## 不用加副檔名

===============================
# 執行結果 : 

C:\D_drive\6_javahome>javac Fruit.java

C:\D_drive\6_javahome>java Fruit
蘋果3個

===============================
# 參考文件 :
  全民學程式設計：從插畫學 Java，株式?社??? (ANK Co., Ltd.)

*/


class Fruit   // 「檔案名稱」必須與「類別名稱」的大小寫完全相同，否則會發生錯誤 !!!!!!! (重要)
{
    public static void main(String[] args)
    {
        String apple = "蘋果";
        int a = 3;
        
        String fruit = apple + a + "個";
        System.out.println(fruit);     // println() : 讓()當中的字串顯示在畫面上並換行。
    }
}

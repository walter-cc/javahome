/*
# 此範例執行步驟

# 在「命令提示元(cmd)」裡面執行

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> 產生 "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## 不用加副檔名

===============================
# 執行結果 : 

C:\D_drive\6_javahome>javac Add.java

C:\D_drive\6_javahome>java Add
a
b
c
a+b+c

===============================
# 參考文件 :
  全民學程式設計：從插畫學 Java，株式?社??? (ANK Co., Ltd.)

*/

import java.util.*;  // java.util套件的匯入

class Add   // 「檔案名稱」必須與「類別名稱」的大小寫完全相同，否則會發生錯誤 !!!!!!! (重要)
{
    public static void main(String[] args)
    {
        StringTokenizer x = new StringTokenizer("a b c");
        StringTokenizer v = new StringTokenizer("a b c");
        
        String walter = x.nextToken();  // 依序取得Token(標記)
        System.out.println(walter);     // a
        walter = x.nextToken();         // 依序取得Token(標記)
        System.out.println(walter);     // b
        walter = x.nextToken();         // 依序取得Token(標記)
        System.out.println(walter);     // c
        
        String s = v.nextToken();       // 依序取得Token(標記)

        while(v.hasMoreTokens())        // 檢查還有沒有下一個Token，若有就回傳True
        {
            s = s + "+" + (v.nextToken());
        }
        System.out.println(s);          // a+b+c
    }
}

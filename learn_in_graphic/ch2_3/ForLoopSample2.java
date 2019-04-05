/*
# 此範例執行步驟

# 在「命令提示元(cmd)」裡面執行

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> 產生 "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## 不用加副檔名

===============================
# 執行結果 : 

C:\D_drive\6_javahome>javac ForLoopSample2.java

C:\D_drive\6_javahome>java ForLoopSample2
0
1
2

===============================
# 參考文件 :
  全民學程式設計：從插畫學 Java，株式?社??? (ANK Co., Ltd.)

*/

import java.util.*;

class ForLoopSample2   // 「檔案名稱」必須與「類別名稱」的大小寫完全相同，否則會發生錯誤 !!!!!!! (重要)
{
    public static void main(String[] args)
    {
        // 設置名為 ArrayList，集合類別(型態)的物件(變數)lst(資料型別為String)
        ArrayList<String> lst = new ArrayList<String>();
        
        // 在lst增加數值
        lst.add(new String("0"));
        lst.add(new String("1"));
        lst.add(new String("2"));
        
        for(String s : lst)  // 從頭依序將 lst 的元素指派到 s，在還有元素指派的前提下會重複執行。
        {
            System.out.println(s);
        }
    }
}

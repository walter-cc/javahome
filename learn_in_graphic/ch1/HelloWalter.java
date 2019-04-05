/*
# 此範例執行步驟

# 在「命令提示元(cmd)」裡面執行

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> 產生 "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## 不用加副檔名


************************************
# 噴了以下錯誤出來 : 
************************************

-------------------------------
C:\D_drive\6_javahome>javac HelloWalter.java
HelloWalter.java:2: error: unmappable character (0xAF) for encoding x-windows-950
-------------------------------
# 解法 :
1) 在編譯時指定採用的編碼為UTF8，EX: javac -encoding utf-8 example.java

   C:\D_drive\6_javahome>javac -encoding utf-8 HelloWalter.java

2) 在Notepad++上先將檔案存為ANSI編碼的格式

   Notepad++ -> 編碼 -> 轉換至ANSI碼格式
   C:\D_drive\6_javahome>javac HelloWalter.java

# 參考文件 :

  [JAVA] 錯誤解決: unmappable character for encoding MS950
  http://chshman310222.pixnet.net/blog/post/174134316-%5Bjava%5D-%E9%8C%AF%E8%AA%A4%E8%A7%A3%E6%B1%BA:-unmappable-character-for-encoding-ms950

  
************************************
# 噴了以下錯誤出來 : 
************************************

-------------------------------
C:\D_drive\6_javahome>java HelloWalter
Error: A JNI error has occurred, please check your installation and try again
Exception in thread "main" java.lang.UnsupportedClassVersionError: HelloWalter has been compiled by a more recent version of the Java Runtime (class file version 55.0), this version of the Java Runtime only recognizes class file versions up to 52.0
-------------------------------

為java與javac版本不一致而造成的。
-------------------------------
C:\D_drive\6_javahome>java -version
java version "1.8.0_161"
Java(TM) SE Runtime Environment (build 1.8.0_161-b12)
Java HotSpot(TM) Client VM (build 25.161-b12, mixed mode, sharing)

C:\D_drive\6_javahome>javac -version
javac 11.0.2
-------------------------------

# 解法 :

檔案總管 -> 本機 -> 右鍵 -> 內容 -> 進階系統設定 -> 進階 -> 環境變數 -> 系統變數 -> Path

  將下面這個變數移到最上方
  
  C:\Program Files\Java\jdk-11.0.2\bin

   
   
# 參考文件 :

  [JAVA] 錯誤解決: unmappable character for encoding MS950
  http://chshman310222.pixnet.net/blog/post/174134316-%5Bjava%5D-%E9%8C%AF%E8%AA%A4%E8%A7%A3%E6%B1%BA:-unmappable-character-for-encoding-ms950

  A JNI error has occurred, please check your installation and try again in CMD Problem Solved
  https://www.youtube.com/watch?v=ghQay370oXk


===============================
# 執行結果 : 

C:\D_drive\6_javahome>javac HelloWalter.java

C:\D_drive\6_javahome>java HelloWalter
Hello Walter
HelloWalter
結束

===============================
# 參考文件 :
  全民學程式設計：從插畫學 Java，株式?社??? (ANK Co., Ltd.)

*/


class HelloWalter   // 「檔案名稱」必須與「類別名稱」的大小寫完全相同，否則會發生錯誤 !!!!!!! (重要)
{
    public static void main(String[] args)
    {
        System.out.println("Hello Walter");     // println() : 讓()當中的字串顯示在畫面上並換行。
        System.out.print("Hello");
        System.out.print("Walter\n");
        System.out.print("結束");
    }
}

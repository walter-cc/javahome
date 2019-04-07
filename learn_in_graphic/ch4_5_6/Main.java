/*
# 此範例執行步驟

# 在「命令提示元(cmd)」裡面執行

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> 產生 "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## 不用加副檔名

===============================
# 執行結果 :

C:\D_drive\6_javahome>javac Main.java

C:\D_drive\6_javahome>java Main
沒有命令列參數。

C:\D_drive\6_javahome>java Main orange apple grape
1:orange
2:apple
3:grape

===============================
# 參考文件 :
  全民學程式設計：從插畫學 Java，株式?社??? (ANK Co., Ltd.)

*/


class Main   // 「檔案名稱」必須與「類別名稱」的大小寫完全相同，否則會發生錯誤 !!!!!!! (重要)
{
    public static void main(String[] args)
    {
        int i;

        if(args.length == 0)
        {
            System.out.println("沒有命令列參數。");
        }
        else
        {
            for(i = 0; i < args.length; i++)
            {
                System.out.println((i+1) + ":" + args[i]);
            }
        }
    }
}

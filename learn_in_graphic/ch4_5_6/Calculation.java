/*
# 此範例執行步驟

# 在「命令提示元(cmd)」裡面執行

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> 產生 "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## 不用加副檔名

===============================
# 執行結果 : 

C:\D_drive\6_javahome>javac Calculation.java        -> 產生 "Calculation.class" + "Calc.class"   !!!!!!! (重要)

C:\D_drive\6_javahome>java Calculation
8 + 9 = 17

===============================
# 參考文件 :
  全民學程式設計：從插畫學 Java，株式?社??? (ANK Co., Ltd.)

*/

class Calc   // 「檔案名稱」必須與「類別名稱」的大小寫完全相同，否則會發生錯誤 !!!!!!! (重要)
{
    int add(int a, int b)
    {
        return a + b;
    }
}


class Calculation   // 「檔案名稱」必須與「類別名稱」的大小寫完全相同，否則會發生錯誤 !!!!!!! (重要)
{
    static void disp()      // 當從main()方法呼叫相同物件的方法時，必須在該方法加上static。
    {
        int c;
        Calc calc = new Calc();
        c = calc.add(8,9);
        System.out.println("8 + 9 = " + c);
    }   
    
    public static void main(String[] args)
    {
        disp();
    }
}

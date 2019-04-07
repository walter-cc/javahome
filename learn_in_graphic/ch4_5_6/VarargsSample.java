/*
# 此範例執行步驟

# 在「命令提示元(cmd)」裡面執行

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> 產生 "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## 不用加副檔名

===============================
# 執行結果 :

C:\D_drive\6_javahome>javac VarargsSample.java

C:\D_drive\6_javahome>java VarargsSample
(2,5,7,0,1)最大值 : 7
(100,54,1)最大值 : 100
(10)最大值 : 10

===============================
# 參考文件 :
  全民學程式設計：從插畫學 Java，株式?社??? (ANK Co., Ltd.)

*/




class VarargsSample   // 「檔案名稱」必須與「類別名稱」的大小寫完全相同，否則會發生錯誤 !!!!!!! (重要)
{
    int getMax(int... nums)
    {
        int max = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(i == 0)
            {
                max = nums[0];
            }

            if(max < nums[i])
            {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        VarargsSample vt = new VarargsSample();
        System.out.println("(2,5,7,0,1)最大值 : " + vt.getMax(2,5,7,0,1));
        System.out.println("(100,54,1)最大值 : " + vt.getMax(100,54,1));
        System.out.println("(10)最大值 : " + vt.getMax(10));
    }
}

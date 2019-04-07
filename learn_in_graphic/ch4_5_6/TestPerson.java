/*
# 此範例執行步驟

# 在「命令提示元(cmd)」裡面執行

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> 產生 "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## 不用加副檔名

===============================
# 執行結果 :

C:\D_drive\6_javahome>javac TestPerson.java         -> 產生 "TestPerson.class" + "Person.class" + "Girl.class"   !!!!!!! (重要)

C:\D_drive\6_javahome>java TestPerson
紫桐妹妹

===============================
# 參考文件 :
  全民學程式設計：從插畫學 Java，株式?社??? (ANK Co., Ltd.)

*/

class Person   // 「檔案名稱」必須與「類別名稱」的大小寫完全相同，否則會發生錯誤 !!!!!!! (重要)
{
    private String name;    // pritvate的成員無法讓子類別繼承，也無法被其他物件運用。

    void setName(String n)
    {
        name = n;
    }
    String getName()
    {
        return name;
    }
}

class Girl extends Person   // 左子右父
{
    void print()
    {
        System.out.println(getName() + "妹妹");
        // System.out.println(name);    <- 無法繼承
    }
}

class TestPerson   // 「檔案名稱」必須與「類別名稱」的大小寫完全相同，否則會發生錯誤 !!!!!!! (重要)
{
    public static void main(String[] args)
    {
        Girl tiana = new Girl();
        tiana.setName("紫桐");
        tiana.print();


        // Person tiana = new Person();
        // tiana.name = "紫桐"; <- 無法使用
    }
}

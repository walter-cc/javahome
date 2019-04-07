/*
# 此範例執行步驟

# 在「命令提示元(cmd)」裡面執行

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> 產生 "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## 不用加副檔名

===============================
# 執行結果 :

C:\D_drive\6_javahome>javac Pet.java                -> 產生 "Pet.class" + "Animal.class" + "Cat.class"   !!!!!!! (重要)

C:\D_drive\6_javahome>java Pet
名字 : 蘭
年齡 : 5
品種 : 波斯貓

# 如果mark "super.printPet();"，則只會出現
品種 : 波斯貓

===============================
# 參考文件 :
  全民學程式設計：從插畫學 Java，株式?社??? (ANK Co., Ltd.)

*/

class Animal   // 「檔案名稱」必須與「類別名稱」的大小寫完全相同，否則會發生錯誤 !!!!!!! (重要)
{
    String name;
    int age;

    void printPet()
    {
        System.out.println("名字 : " + name);
        System.out.println("年齡 : " + age);
    }
}

class Cat extends Animal   // 左子右父
{
    String variety;

    void printPet()     // 覆寫
    {
        super.printPet();       // 若是在子類別中使用「super」，就能參考父類別的欄位或方法。 如果mark "super.printPet();"，則只會出現"品種 : 波斯貓"
        System.out.println("品種 : " + variety);
    }
}

class Pet   // 「檔案名稱」必須與「類別名稱」的大小寫完全相同，否則會發生錯誤 !!!!!!! (重要)
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        cat.name = "蘭";
        cat.age = 5;
        cat.variety = "波斯貓";
        cat.printPet();
    }
}

/*
# 此範例執行步驟

# 在「命令提示元(cmd)」裡面執行

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> 產生 "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## 不用加副檔名

===============================
# 執行結果 : 

C:\D_drive\6_javahome>javac Books.java              -> 產生 "Books.class" + "Book.class"   !!!!!!! (重要)

C:\D_drive\6_javahome>java Books
書名 : C的繪本
作者 : tiana
書名 : JAVA的繪本
作者 : tiana

===============================
# 參考文件 :
  全民學程式設計：從插畫學 Java，株式?社??? (ANK Co., Ltd.)

*/


class Book   // 「檔案名稱」必須與「類別名稱」的大小寫完全相同，否則會發生錯誤 !!!!!!! (重要)
{
    String title;
    String writer;
    
    Book(String t, String w)    // 有參數的建構子
    {
        title = t;
        writer = w;
    }
    
    Book(Book copy)     // 複製建構子，以參數的形式來接收相同類別的物件，並將值指派到對應欄位的建構子，這叫做「複製建構子」。複製建構子會複製接收的物件。
    {
        title = copy.title;
        writer = copy.writer;
    }
    
    void print()
    {
        System.out.println("書名 : " + title);
        System.out.println("作者 : " + writer);
    }
}

class Books   // 「檔案名稱」必須與「類別名稱」的大小寫完全相同，否則會發生錯誤 !!!!!!! (重要)
{
    public static void main(String[] args)
    {
        Book book1 = new Book("C的繪本", "tiana");
        book1.print();
        
        Book book2 = new Book(book1);
        book2.title = "JAVA的繪本";    // 改變物件book2的title
        book2.print();
    }
}

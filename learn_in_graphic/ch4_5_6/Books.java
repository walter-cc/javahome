/*
# ���d�Ұ���B�J

# �b�u�R�O���ܤ�(cmd)�v�̭�����

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> ���� "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## ���Υ[���ɦW

===============================
# ���浲�G : 

C:\D_drive\6_javahome>javac Books.java              -> ���� "Books.class" + "Book.class"   !!!!!!! (���n)

C:\D_drive\6_javahome>java Books
�ѦW : C��ø��
�@�� : tiana
�ѦW : JAVA��ø��
�@�� : tiana

===============================
# �ѦҤ�� :
  �����ǵ{���]�p�G�q���e�� Java�A�覡?��??? (ANK Co., Ltd.)

*/


class Book   // �u�ɮצW�١v�����P�u���O�W�١v���j�p�g�����ۦP�A�_�h�|�o�Ϳ��~ !!!!!!! (���n)
{
    String title;
    String writer;
    
    Book(String t, String w)    // ���Ѽƪ��غc�l
    {
        title = t;
        writer = w;
    }
    
    Book(Book copy)     // �ƻs�غc�l�A�H�Ѽƪ��Φ��ӱ����ۦP���O������A�ñN�ȫ����������쪺�غc�l�A�o�s���u�ƻs�غc�l�v�C�ƻs�غc�l�|�ƻs����������C
    {
        title = copy.title;
        writer = copy.writer;
    }
    
    void print()
    {
        System.out.println("�ѦW : " + title);
        System.out.println("�@�� : " + writer);
    }
}

class Books   // �u�ɮצW�١v�����P�u���O�W�١v���j�p�g�����ۦP�A�_�h�|�o�Ϳ��~ !!!!!!! (���n)
{
    public static void main(String[] args)
    {
        Book book1 = new Book("C��ø��", "tiana");
        book1.print();
        
        Book book2 = new Book(book1);
        book2.title = "JAVA��ø��";    // ���ܪ���book2��title
        book2.print();
    }
}

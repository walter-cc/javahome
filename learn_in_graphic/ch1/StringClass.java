/*
# ���d�Ұ���B�J

# �b�u�R�O���ܤ�(cmd)�v�̭�����

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> ���� "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## ���Υ[���ɦW

===============================
# ���浲�G : 

C:\D_drive\6_javahome>javac StringClass.java

C:\D_drive\6_javahome>java StringClass
len = 6
�uJavaø���v���̫��Ӧr���uø���v�C
���T�Oø���C

===============================
# �ѦҤ�� :
  �����ǵ{���]�p�G�q���e�� Java�A�覡?��??? (ANK Co., Ltd.)

*/


class StringClass   // �u�ɮצW�١v�����P�u���O�W�١v���j�p�g�����ۦP�A�_�h�|�o�Ϳ��~ !!!!!!! (���n)
{
    public static void main(String[] args)
    {
        String a = "Javaø��";
        int len = a.length();   // len = 6
        
        String b = a.substring(len -2, len);
        int c = b.compareTo("ø��");
        
        System.out.printf("len = %d\n",len);
        System.out.println("�u"+ a + "�v���̫��Ӧr���u" + b + "�v�C");     // println() : ��()�����r����ܦb�e���W�ô���C
        System.out.println((c == 0 ? "���T�O" : "�ä��O") + "ø���C"); 
    }
}

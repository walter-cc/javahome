/*
# ���d�Ұ���B�J

# �b�u�R�O���ܤ�(cmd)�v�̭�����

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> ���� "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## ���Υ[���ɦW

===============================
# ���浲�G : 

C:\D_drive\6_javahome>javac Add.java

C:\D_drive\6_javahome>java Add
a
b
c
a+b+c

===============================
# �ѦҤ�� :
  �����ǵ{���]�p�G�q���e�� Java�A�覡?��??? (ANK Co., Ltd.)

*/

import java.util.*;  // java.util�M�󪺶פJ

class Add   // �u�ɮצW�١v�����P�u���O�W�١v���j�p�g�����ۦP�A�_�h�|�o�Ϳ��~ !!!!!!! (���n)
{
    public static void main(String[] args)
    {
        StringTokenizer x = new StringTokenizer("a b c");
        StringTokenizer v = new StringTokenizer("a b c");
        
        String walter = x.nextToken();  // �̧Ǩ��oToken(�аO)
        System.out.println(walter);     // a
        walter = x.nextToken();         // �̧Ǩ��oToken(�аO)
        System.out.println(walter);     // b
        walter = x.nextToken();         // �̧Ǩ��oToken(�аO)
        System.out.println(walter);     // c
        
        String s = v.nextToken();       // �̧Ǩ��oToken(�аO)

        while(v.hasMoreTokens())        // �ˬd�٦��S���U�@��Token�A�Y���N�^��True
        {
            s = s + "+" + (v.nextToken());
        }
        System.out.println(s);          // a+b+c
    }
}

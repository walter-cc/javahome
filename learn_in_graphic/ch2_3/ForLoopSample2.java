/*
# ���d�Ұ���B�J

# �b�u�R�O���ܤ�(cmd)�v�̭�����

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> ���� "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## ���Υ[���ɦW

===============================
# ���浲�G : 

C:\D_drive\6_javahome>javac ForLoopSample2.java

C:\D_drive\6_javahome>java ForLoopSample2
0
1
2

===============================
# �ѦҤ�� :
  �����ǵ{���]�p�G�q���e�� Java�A�覡?��??? (ANK Co., Ltd.)

*/

import java.util.*;

class ForLoopSample2   // �u�ɮצW�١v�����P�u���O�W�١v���j�p�g�����ۦP�A�_�h�|�o�Ϳ��~ !!!!!!! (���n)
{
    public static void main(String[] args)
    {
        // �]�m�W�� ArrayList�A���X���O(���A)������(�ܼ�)lst(��ƫ��O��String)
        ArrayList<String> lst = new ArrayList<String>();
        
        // �blst�W�[�ƭ�
        lst.add(new String("0"));
        lst.add(new String("1"));
        lst.add(new String("2"));
        
        for(String s : lst)  // �q�Y�̧ǱN lst ������������ s�A�b�٦������������e���U�|���ư���C
        {
            System.out.println(s);
        }
    }
}

/*
# ���d�Ұ���B�J

# �b�u�R�O���ܤ�(cmd)�v�̭�����

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> ���� "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## ���Υ[���ɦW

===============================
# ���浲�G : 

C:\D_drive\6_javahome>javac ForLoopSample.java

C:\D_drive\6_javahome>java ForLoopSample
�K
�L
��
�V

===============================
# �ѦҤ�� :
  �����ǵ{���]�p�G�q���e�� Java�A�覡?��??? (ANK Co., Ltd.)

*/

class ForLoopSample   // �u�ɮצW�١v�����P�u���O�W�١v���j�p�g�����ۦP�A�_�h�|�o�Ϳ��~ !!!!!!! (���n)
{
    public static void main(String[] args)
    {
        String[] season = {"�K","�L","��","�V"};
        
        for(String s : season)  // �q�Y�̧ǱN season ������������ s�A�b�٦������������e���U�|���ư���C
        {
            System.out.println(s);
        }
    }
}

/*
# ���d�Ұ���B�J

# �b�u�R�O���ܤ�(cmd)�v�̭�����

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> ���� "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## ���Υ[���ɦW

===============================
# ���浲�G :

C:\D_drive\6_javahome>javac Main.java

C:\D_drive\6_javahome>java Main
�S���R�O�C�ѼơC

C:\D_drive\6_javahome>java Main orange apple grape
1:orange
2:apple
3:grape

===============================
# �ѦҤ�� :
  �����ǵ{���]�p�G�q���e�� Java�A�覡?��??? (ANK Co., Ltd.)

*/


class Main   // �u�ɮצW�١v�����P�u���O�W�١v���j�p�g�����ۦP�A�_�h�|�o�Ϳ��~ !!!!!!! (���n)
{
    public static void main(String[] args)
    {
        int i;

        if(args.length == 0)
        {
            System.out.println("�S���R�O�C�ѼơC");
        }
        else
        {
            for(i = 0; i < args.length; i++)
            {
                System.out.println((i+1) + ":" + args[i]);
            }
        }
    }
}

/*
# ���d�Ұ���B�J

# �b�u�R�O���ܤ�(cmd)�v�̭�����

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> ���� "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## ���Υ[���ɦW

===============================
# ���浲�G :

C:\D_drive\6_javahome>javac VarargsSample.java

C:\D_drive\6_javahome>java VarargsSample
(2,5,7,0,1)�̤j�� : 7
(100,54,1)�̤j�� : 100
(10)�̤j�� : 10

===============================
# �ѦҤ�� :
  �����ǵ{���]�p�G�q���e�� Java�A�覡?��??? (ANK Co., Ltd.)

*/




class VarargsSample   // �u�ɮצW�١v�����P�u���O�W�١v���j�p�g�����ۦP�A�_�h�|�o�Ϳ��~ !!!!!!! (���n)
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
        System.out.println("(2,5,7,0,1)�̤j�� : " + vt.getMax(2,5,7,0,1));
        System.out.println("(100,54,1)�̤j�� : " + vt.getMax(100,54,1));
        System.out.println("(10)�̤j�� : " + vt.getMax(10));
    }
}

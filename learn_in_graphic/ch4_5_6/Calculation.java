/*
# ���d�Ұ���B�J

# �b�u�R�O���ܤ�(cmd)�v�̭�����

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> ���� "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## ���Υ[���ɦW

===============================
# ���浲�G : 

C:\D_drive\6_javahome>javac Calculation.java        -> ���� "Calculation.class" + "Calc.class"   !!!!!!! (���n)

C:\D_drive\6_javahome>java Calculation
8 + 9 = 17

===============================
# �ѦҤ�� :
  �����ǵ{���]�p�G�q���e�� Java�A�覡?��??? (ANK Co., Ltd.)

*/

class Calc   // �u�ɮצW�١v�����P�u���O�W�١v���j�p�g�����ۦP�A�_�h�|�o�Ϳ��~ !!!!!!! (���n)
{
    int add(int a, int b)
    {
        return a + b;
    }
}


class Calculation   // �u�ɮצW�١v�����P�u���O�W�١v���j�p�g�����ۦP�A�_�h�|�o�Ϳ��~ !!!!!!! (���n)
{
    static void disp()      // ��qmain()��k�I�s�ۦP���󪺤�k�ɡA�����b�Ӥ�k�[�Wstatic�C
    {
        int c;
        Calc calc = new Calc();
        c = calc.add(8,9);
        System.out.println("8 + 9 = " + c);
    }   
    
    public static void main(String[] args)
    {
        disp();
    }
}

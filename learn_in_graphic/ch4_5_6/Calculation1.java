/*
# ���d�Ұ���B�J

# �b�u�R�O���ܤ�(cmd)�v�̭�����

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> ���� "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## ���Υ[���ɦW

===============================
# ���浲�G :

C:\D_drive\6_javahome>javac Calculation1.java       -> ���� "Calculation1.class" + "Calc1.class" + "Plus.class"   !!!!!!! (���n)

C:\D_drive\6_javahome>java Calculation1
27 + 32 = 59

===============================
# �ѦҤ�� :
  �����ǵ{���]�p�G�q���e�� Java�A�覡?��??? (ANK Co., Ltd.)

*/

abstract class Calc1        // ��H���O
{
    int a;
    int b;
    abstract void answer(); // ��H��k
    
    void setData(int m, int n)
    {
        a = m;
        b = n;
    }
}

class Plus extends Calc1
{
    void answer()   //��@�A�мg��H��k
    {
        System.out.println(a + " + " + b + " = " + (a+b));
    }
}

class Calculation1   // �u�ɮצW�١v�����P�u���O�W�١v���j�p�g�����ۦP�A�_�h�|�o�Ϳ��~ !!!!!!! (���n)
{
    public static void main(String[] args)
    {
        Plus plus = new Plus();
        plus.setData(27,32);
        plus.answer();
    }
}

/*
# ���d�Ұ���B�J

# �b�u�R�O���ܤ�(cmd)�v�̭�����

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> ���� "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## ���Υ[���ɦW

===============================
# ���浲�G :

C:\D_drive\6_javahome>javac Shopping.java           -> ���� "Shopping.class" + "Purse.class"   !!!!!!! (���n)

C:\D_drive\6_javahome>java Shopping
�l�B��900���C
�l�B��650���C
�|����150���C

===============================
# �ѦҤ�� :
  �����ǵ{���]�p�G�q���e�� Java�A�覡?��??? (ANK Co., Ltd.)

*/

class Purse
{
    // �ustatic�v�O�@�ӥΨӭ׹��u���v�P�u��k�v���׹��l�C�q�ۦP���O�إߥX������A�i�H�z�L�[�W�ustatic�v���覡����쪺�ȲΤ@�C
    static int money = 0;   // �Τ@�x�Ȧb�`��

    void printMoney(int in, int out)
    {
        money = money + in - out;

        if(money < 0)
            System.out.println("�|����" + (-1 * money) + "���C");
        else
            System.out.println("�l�B��" + money + "���C");
    }
}

class Shopping   // �u�ɮצW�١v�����P�u���O�W�١v���j�p�g�����ۦP�A�_�h�|�o�Ϳ��~ !!!!!!! (���n)
{
    public static void main(String[] args)
    {
        Purse store1 = new Purse();     // ����1
        Purse store2 = new Purse();     // ����2

        store1.printMoney(1000,100);    // �b����1�x�ȩM���O
        store2.printMoney(0,250);       // �b����2���O
        store1.printMoney(0,800);       // �b����1���O
    }
}

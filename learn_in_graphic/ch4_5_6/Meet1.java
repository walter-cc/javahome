/*
# ���d�Ұ���B�J

# �b�u�R�O���ܤ�(cmd)�v�̭�����

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> ���� "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## ���Υ[���ɦW

===============================
# ���浲�G :

C:\D_drive\6_javahome>javac Meet1.java               -> ���� "Meet.class" + "Greet.class" + "Bye.class" + "Greeting.class"  !!!!!!! (���n)

C:\D_drive\6_javahome>java Meet1
�A�n!
�A��!


===============================
# �ѦҤ�� :
  �����ǵ{���]�p�G�q���e�� Java�A�覡?��??? (ANK Co., Ltd.)

*/

interface Greet      // ����(interface)
{
    void greet();
}

interface Bye extends Greet      // ���l�k���C����Bye�~�Ӥ���Greet
{
    void bye();
}

class Greeting implements Bye   // ���OGreeting��@����Bye
{
    public void greet()      // ������@
    {
        System.out.println("�A�n!");
    }

    public void bye()      // ������@
    {
        System.out.println("�A��!");
    }
}

class Meet1   // �u�ɮצW�١v�����P�u���O�W�١v���j�p�g�����ۦP�A�_�h�|�o�Ϳ��~ !!!!!!! (���n)
{
    public static void main(String[] args)
    {
        Greeting greeting = new Greeting();
        greeting.greet();
        greeting.bye();
    }
}

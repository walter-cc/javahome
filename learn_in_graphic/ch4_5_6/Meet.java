/*
# ���d�Ұ���B�J

# �b�u�R�O���ܤ�(cmd)�v�̭�����

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> ���� "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## ���Υ[���ɦW

===============================
# ���浲�G :

C:\D_drive\6_javahome>javac Meet.java               -> ���� "Meet.class" + "Geet.class" + "Talk.class" + "Morning.class"  !!!!!!! (���n)

C:\D_drive\6_javahome>java Meet
���w
���ѤѮ�u�n


===============================
# �ѦҤ�� :
  �����ǵ{���]�p�G�q���e�� Java�A�覡?��??? (ANK Co., Ltd.)

*/

interface Geet      // ����(interface)
{
    void greet();
}

interface Talk      // ����(interface)
{
    void talk();
}

class Morning implements Geet, Talk
{
    public void greet()      // ������@
    {
        System.out.println("���w");
    }

    public void talk()      // ������@
    {
        System.out.println("���ѤѮ�u�n");
    }
}

class Meet   // �u�ɮצW�١v�����P�u���O�W�١v���j�p�g�����ۦP�A�_�h�|�o�Ϳ��~ !!!!!!! (���n)
{
    public static void main(String[] args)
    {
        Morning morning = new Morning();
        morning.greet();
        morning.talk();
    }
}

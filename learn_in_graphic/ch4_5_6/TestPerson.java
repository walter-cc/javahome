/*
# ���d�Ұ���B�J

# �b�u�R�O���ܤ�(cmd)�v�̭�����

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> ���� "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## ���Υ[���ɦW

===============================
# ���浲�G :

C:\D_drive\6_javahome>javac TestPerson.java         -> ���� "TestPerson.class" + "Person.class" + "Girl.class"   !!!!!!! (���n)

C:\D_drive\6_javahome>java TestPerson
����f�f

===============================
# �ѦҤ�� :
  �����ǵ{���]�p�G�q���e�� Java�A�覡?��??? (ANK Co., Ltd.)

*/

class Person   // �u�ɮצW�١v�����P�u���O�W�١v���j�p�g�����ۦP�A�_�h�|�o�Ϳ��~ !!!!!!! (���n)
{
    private String name;    // pritvate�������L�k���l���O�~�ӡA�]�L�k�Q��L����B�ΡC

    void setName(String n)
    {
        name = n;
    }
    String getName()
    {
        return name;
    }
}

class Girl extends Person   // ���l�k��
{
    void print()
    {
        System.out.println(getName() + "�f�f");
        // System.out.println(name);    <- �L�k�~��
    }
}

class TestPerson   // �u�ɮצW�١v�����P�u���O�W�١v���j�p�g�����ۦP�A�_�h�|�o�Ϳ��~ !!!!!!! (���n)
{
    public static void main(String[] args)
    {
        Girl tiana = new Girl();
        tiana.setName("����");
        tiana.print();


        // Person tiana = new Person();
        // tiana.name = "����"; <- �L�k�ϥ�
    }
}

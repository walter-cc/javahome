/*
# ���d�Ұ���B�J

# �b�u�R�O���ܤ�(cmd)�v�̭�����

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> ���� "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## ���Υ[���ɦW

===============================
# ���浲�G :

C:\D_drive\6_javahome>javac Pet.java                -> ���� "Pet.class" + "Animal.class" + "Cat.class"   !!!!!!! (���n)

C:\D_drive\6_javahome>java Pet
�W�r : ��
�~�� : 5
�~�� : �i����

# �p�Gmark "super.printPet();"�A�h�u�|�X�{
�~�� : �i����

===============================
# �ѦҤ�� :
  �����ǵ{���]�p�G�q���e�� Java�A�覡?��??? (ANK Co., Ltd.)

*/

class Animal   // �u�ɮצW�١v�����P�u���O�W�١v���j�p�g�����ۦP�A�_�h�|�o�Ϳ��~ !!!!!!! (���n)
{
    String name;
    int age;

    void printPet()
    {
        System.out.println("�W�r : " + name);
        System.out.println("�~�� : " + age);
    }
}

class Cat extends Animal   // ���l�k��
{
    String variety;

    void printPet()     // �мg
    {
        super.printPet();       // �Y�O�b�l���O���ϥΡusuper�v�A�N��ѦҤ����O�����Τ�k�C �p�Gmark "super.printPet();"�A�h�u�|�X�{"�~�� : �i����"
        System.out.println("�~�� : " + variety);
    }
}

class Pet   // �u�ɮצW�١v�����P�u���O�W�١v���j�p�g�����ۦP�A�_�h�|�o�Ϳ��~ !!!!!!! (���n)
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        cat.name = "��";
        cat.age = 5;
        cat.variety = "�i����";
        cat.printPet();
    }
}

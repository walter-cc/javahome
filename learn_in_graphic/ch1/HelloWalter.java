/*
# ���d�Ұ���B�J

# �b�u�R�O���ܤ�(cmd)�v�̭�����

1) C:\D_drive\6_javahome>javac HelloWalter.java     -> ���� "HelloWalter.class"

2) C:\D_drive\6_javahome>java HelloWalter           ## ���Υ[���ɦW


************************************
# �Q�F�H�U���~�X�� : 
************************************

-------------------------------
C:\D_drive\6_javahome>javac HelloWalter.java
HelloWalter.java:2: error: unmappable character (0xAF) for encoding x-windows-950
-------------------------------
# �Ѫk :
1) �b�sĶ�ɫ��w�ĥΪ��s�X��UTF8�AEX: javac -encoding utf-8 example.java

   C:\D_drive\6_javahome>javac -encoding utf-8 HelloWalter.java

2) �bNotepad++�W���N�ɮצs��ANSI�s�X���榡

   Notepad++ -> �s�X -> �ഫ��ANSI�X�榡
   C:\D_drive\6_javahome>javac HelloWalter.java

# �ѦҤ�� :

  [JAVA] ���~�ѨM: unmappable character for encoding MS950
  http://chshman310222.pixnet.net/blog/post/174134316-%5Bjava%5D-%E9%8C%AF%E8%AA%A4%E8%A7%A3%E6%B1%BA:-unmappable-character-for-encoding-ms950

  
************************************
# �Q�F�H�U���~�X�� : 
************************************

-------------------------------
C:\D_drive\6_javahome>java HelloWalter
Error: A JNI error has occurred, please check your installation and try again
Exception in thread "main" java.lang.UnsupportedClassVersionError: HelloWalter has been compiled by a more recent version of the Java Runtime (class file version 55.0), this version of the Java Runtime only recognizes class file versions up to 52.0
-------------------------------

��java�Pjavac�������@�P�ӳy�����C
-------------------------------
C:\D_drive\6_javahome>java -version
java version "1.8.0_161"
Java(TM) SE Runtime Environment (build 1.8.0_161-b12)
Java HotSpot(TM) Client VM (build 25.161-b12, mixed mode, sharing)

C:\D_drive\6_javahome>javac -version
javac 11.0.2
-------------------------------

# �Ѫk :

�ɮ��`�� -> ���� -> �k�� -> ���e -> �i���t�γ]�w -> �i�� -> �����ܼ� -> �t���ܼ� -> Path

  �N�U���o���ܼƲ���̤W��
  
  C:\Program Files\Java\jdk-11.0.2\bin

   
   
# �ѦҤ�� :

  [JAVA] ���~�ѨM: unmappable character for encoding MS950
  http://chshman310222.pixnet.net/blog/post/174134316-%5Bjava%5D-%E9%8C%AF%E8%AA%A4%E8%A7%A3%E6%B1%BA:-unmappable-character-for-encoding-ms950

  A JNI error has occurred, please check your installation and try again in CMD Problem Solved
  https://www.youtube.com/watch?v=ghQay370oXk


===============================
# ���浲�G : 

C:\D_drive\6_javahome>javac HelloWalter.java

C:\D_drive\6_javahome>java HelloWalter
Hello Walter
HelloWalter
����

===============================
# �ѦҤ�� :
  �����ǵ{���]�p�G�q���e�� Java�A�覡?��??? (ANK Co., Ltd.)

*/


class HelloWalter   // �u�ɮצW�١v�����P�u���O�W�١v���j�p�g�����ۦP�A�_�h�|�o�Ϳ��~ !!!!!!! (���n)
{
    public static void main(String[] args)
    {
        System.out.println("Hello Walter");     // println() : ��()�����r����ܦb�e���W�ô���C
        System.out.print("Hello");
        System.out.print("Walter\n");
        System.out.print("����");
    }
}

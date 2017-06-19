
public class main
{
    public static void main ()
    {
        int a=3;

        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print("*");

            }
            System.out.println("");
        }

        System.out.println("___________________________");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<=i;j++)
            {

                System.out.print("*");

            }
            System.out.println("");
        }

        System.out.println("___________________________");

        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(j>=i)
                {
                    System.out.print("1 ");

                }
                else
                {
                    System.out.print("0 ");
                }

            }
            System.out.println("");
        }

        System.out.println("___________***______________");
        int wysokosc=4;
        int dl=wysokosc*2;

        
        for(int i=1;i<=wysokosc;i++)
        {
            for(int j=1;j<dl;j++)
            {
                if(j<=wysokosc-i || j>=wysokosc+i)
                {
                    System.out.print(" ");

                }
                else
                {

                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}

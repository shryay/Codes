class printz
{
    public static void main(String[] args)
    {
        System.out.println("********");
        int p=7;
        for(int i=1;i<=7;i++)
        {
            for(int j=p-1;j>=1;j--)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            p--;
            System.out.println();
        }
        System.out.println("********");
    }
}
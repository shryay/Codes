class pattern
{
    public static void main(String[] args) {
        int i,j,t=0;
        for(i=5;i>=1;i--)
        {
            t=i;
            for(j=1;j<=10;j=j+2)
            {
                System.out.print(t+"\t");
                if(j%2!=0)
                t++;
                else
                t+=9;
            }
           System.out.println();
        }
    }
}
public class a
 { 
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you need to draw?");
        int k =in.nextInt();
        System.out.print("What is the highest number you can draw?");
        int n =in.nextInt();
        int lotterodds = 1;
        for(int i=1;i<=k;i++)
        lotterodds = lotterodds*(n-i+1)/i;
        System.out.println("Your odds are 1 in"+lotterodds+".Good luck!");

    }
}

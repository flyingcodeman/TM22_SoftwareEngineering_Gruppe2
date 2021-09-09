public class Pitch {
    int[][] array;

    public int[][] createPitch(int size){
        return new int[size][size];
    }

    public void printPitch(int[][] array){
        System.out.println("     A B C D E F G H I J ");
        System.out.println("   * * * * * * * * * * * *");
        int x = 1;
        for(int i = 0 ; i < 10 ; i++) {
            if (x != 10) {
                System.out.print(x + "  " + "* ");
            }else{
                System.out.print(x + " " + "* ");
            }
            for (int j = 0; j < 10; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.print("*");
            x++;
            System.out.println();
        }
        System.out.println("   * * * * * * * * * * * *");
    }
}

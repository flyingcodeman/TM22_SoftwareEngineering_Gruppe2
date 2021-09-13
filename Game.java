class Game {

    /*
     * Initial commit
     */
    public void createPitch(){}
    public void placeShip(){}
    public void sankShip(){}
    public void shoot(){}
    public void showOnConsole(){}

    public static void main(String []args) {
        Pitch p = new Pitch();
        Ships ships = new Ships();

        System.out.println("Pitch Player 1: ");
        int[][] pitch3 = p.createPitch(10);
        ships.setShipsRandom(pitch3);
        p.printPitch(pitch3);

        System.out.println("Pitch Player 2: ");
        int[][] pitch2 = p.createPitch(10);
        ships.setShipsRandom(pitch2);
        p.printPitch(pitch2);


    }
}
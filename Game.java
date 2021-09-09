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
        Pitch pitch = new Pitch();
        Ships ships = new Ships();
        int[][] pitch1 = pitch.createPitch(10);
        pitch.printPitch(pitch1);
        ships.setShipsRandom(pitch1);
        pitch.printPitch(pitch1);
    }
}
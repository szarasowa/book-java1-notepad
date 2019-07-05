class TwoD {
    public static void main(String args[]){
        int row, column;
        int table[][] = new int[3][4];

        for(row = 0; row < 3; ++row){
            for(column = 0; column < 4; column++){
                table[row][column] = 1 + column + (row * 4);
                System.out.print(table[row][column] + " ");
            }
            System.out.println();;
        }
    }
}
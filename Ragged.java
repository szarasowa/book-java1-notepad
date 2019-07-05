// indiviually set size of second dimension array in multidimensional array 
class Ragged {
    public static void main(String args[]) {
        int arr[][] = new int [5][];
        arr[0] = new int [10];
        arr[1] = new int [10];
        arr[2] = new int [10];
        arr[3] = new int [2];
        arr[4] = new int [2];
        
        int i,j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 10; j++){
                arr[i][j] = i + j + 10;
            }
        }

        for(i = 3; i < 5; i++){
            for(j = 0; j < 2; j++){
                arr[i][j] = i + j + 10;
            }
        }

        System.out.println("first 3 arrays with 10 second-dimension elements");
        for(i=0; i < 3; i++){
            for(j=0; j<10; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("last 2 arrays with 2 second-dimension elements");
        for(i=3; i < 5; i++){
            for(j=0; j < 2; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
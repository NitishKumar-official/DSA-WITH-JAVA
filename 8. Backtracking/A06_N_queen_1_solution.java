



public class A06_N_queen_1_solution {


    public static boolean isSafe(char board[][], int row, int col){

        //vertical up

        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diag left up

        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diag right up

        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static boolean N_queen(char board[][], int row){
        //base

        if(row == board.length){
            // printBoard(board);
            count++;
            return true;
        }

        //column loop

        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(N_queen(board, row+1)){
                    return true;

                }   //functioin call
                board[row][j]='x'; //backtracking step
            }
        }
        return false;
    }

    public static void printBoard(char board[][]){
        System.out.println("-----------chess board -----------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

     static int count =0;
    public static void main(String[] args){
        
        int n=5;
        char board[][] = new char[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='x';
            }
        }
       if(N_queen(board,0)){
        System.out.println("solution is possible");
        printBoard(board);
       }
       else{
        System.out.println("solution is not possible");
       }
        // System.out.println("total ways is: "+count);
    }
    
}


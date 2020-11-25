public class Sudoku {
    public static void main(String[] args) throws Exception {
        int grid[] = {
            0, 1, 0, 6, 0, 7, 0, 0, 4,
            0, 4, 2, 0, 0, 0, 0, 0, 0,
            8, 7, 0, 3, 0, 0, 6, 0, 0,
            0, 8, 0, 0, 7, 0, 0, 2, 0,
            0, 0, 0, 8, 9, 3, 0, 0, 0,
            0, 3, 0, 0, 6, 0, 0, 1, 0,
            0, 0, 8, 0, 0, 6, 0, 4, 5,
            0, 0, 0, 0, 0, 0, 1, 7, 0,
            4, 0, 0, 9, 0, 8, 0, 6, 0
           };
        Boolean fixed[] = new Boolean[81];
        for (int i=0; i<grid.length; i++) {
            if (grid[i] != 0) {
                fixed[i] = true;
            } else {
                fixed[i] = false;
            }
        }
        int cur=0;
        Boolean reverse = false;
        do {
            if (fixed[cur]) {
                if (reverse) {
                    cur--;
                } else {
                    cur++;
                }
            } else {
                if (reverse) {
                    reverse = false;
                }
                grid[cur]++;
                if (grid[cur] == 10) {
                    grid[cur] = 0;
                    cur--;
                    reverse=true;
                } else {
                    int line=cur/9;
                    int col=cur%9;
                    int sline=(line/3)*3;
                    int scol = (col/3)%3;
                    int checked = 0;
                    for (int i=0; i<9; i++) {
                        int iline = i*9 + col;
                        int icol = line*9 + i;
                        int isquare = 9*(sline + (i/3)) + scol + (i%3);
                        if (grid[iline] == grid[cur]) {
                            checked++;
                        }
                        if (grid[icol] == grid[cur]) {
                            checked++;
                        }
                        if (grid[isquare] == grid[cur]) {
                            checked++;
                        }
                    }
                    if (checked == 3) {
                        cur++;
                    }
                }
            }
        } while (cur != 81);
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                System.out.print(grid[i*9+j]);
            }
            System.out.println();
        }
    }
}

#include <stdio.h>

int main(int argc, const char * argv[]) {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output
    
    int sizeOfMatrix;
    printf("Please enter the size of the matrix: \n");
    scanf("%d", &sizeOfMatrix);
    int matrix[sizeOfMatrix][sizeOfMatrix];
    for (int i = 0; i < sizeOfMatrix; i++) {
        for (int j = 0; j < sizeOfMatrix; j++) {
            if (i == j) {
                matrix[i][j] = 1;
            } else {
                matrix[i][j] = 0;
            }
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }
}

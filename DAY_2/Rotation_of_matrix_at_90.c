#include<stdio.h>
int main(){
    int arr[3][3];
    int n,i,j;
    printf("Enter the elements of 3x3 matrix:");
    scanf("%d",&n);

    for(int i=0;i<3;i++){
        for(int j=0;j<=3;j++){
            scanf("%d",&arr[i][j]);
        }
        printf("%d",&arr[i][j]);

    }
    printf("\n");

}
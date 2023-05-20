class Solution {
    void printTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<(n-i)*4 + 1;j++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print((j)+" ");
            }
            System.out.println();
        }
    }
}

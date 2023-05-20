class Solution {
    void printTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(char c = 'A'; c<'A'+i ;c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

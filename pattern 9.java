class Solution {
    void printDiamond(int n) {
        for(int i=0;i<n;i++){
            System.out.println(" ".repeat(n-i-1)+"* ".repeat(i+1));
        }
        for(int i=0;i<n;i++){
            System.out.println(" ".repeat(i)+"* ".repeat(n-i));
        }
    }
}

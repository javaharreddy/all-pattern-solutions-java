class Solution {
    void printTriangle(int n) {
        for(int i=1;i<=n;i++){
            System.out.println("* ".repeat(i));
        }
        for(int i=1;i<n;i++){
            System.out.println("* ".repeat(n-i));
        }
    }
}

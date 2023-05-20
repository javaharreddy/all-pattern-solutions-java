class Solution {
    void printTriangle(int n) {
        for(int i=1;i<=n;i++){
            System.out.println(" ".repeat(n-i)+"*".repeat(2*(i)-1));
        }
    }
}

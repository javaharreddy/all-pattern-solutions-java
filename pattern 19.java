class Solution {
    void printTriangle(int n) {
        for(int i=0;i<n;i++){
            System.out.println("*".repeat(n-i) + " ".repeat(2*i) + "*".repeat(n-i));
        }
        for(int i=0;i<n;i++){
            System.out.println("*".repeat(i+1) + " ".repeat(2*(n-i-1)) + "*".repeat(i+1));
        }
    }
}

class Solution {
    void printTriangle(int n) {
        for(int i=1;i<n;i++){
            System.out.println("*".repeat(i) + " ".repeat(2*(n-i)) + "*".repeat(i));
        }
        for(int i=0;i<n;i++){
            System.out.println("*".repeat(n-i) + " ".repeat((2*i)) + "*".repeat(n-i));
        }
    }
}

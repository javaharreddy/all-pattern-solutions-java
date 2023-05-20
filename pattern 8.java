class Solution {
    void printTriangle(int n) {
        for(int i=0;i<n;i++){
            System.out.println(" ".repeat(i)+"*".repeat(2*(n-i)-1));
        }
    }
}

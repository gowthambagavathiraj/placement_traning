class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;
        int n = arr.length;

        for (int len = 1; len <= n; len += 2) {
            for (int i = 0; i <= n - len; i++) {
                int sum = 0;
                for (int j = i; j < i + len; j++) {
                    sum += arr[j];
                }
                total += sum;
            }
        }

        return total;
    }
    }

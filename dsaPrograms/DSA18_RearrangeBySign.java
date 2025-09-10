package dsaPrograms;

import java.util.ArrayList;

public class DSA18_RearrangeBySign {
    public static void rearrangeBySign(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                neg.add(arr[i]);
            } else {
                pos.add(arr[i]);
            }
        }

        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }

            int idx = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                arr[idx] = pos.get(i);
                idx++;
            }
        } else {
            for (int i = 0; i < pos.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }

            int idx = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                arr[idx] = neg.get(i);
                idx++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 4, -3, 1};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        rearrangeBySign(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

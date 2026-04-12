class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int noe = nums.length;
        if (noe == 0 || k == 0) return new int[0];

        int res_arr_size = noe - k + 1;
        int[] res = new int[res_arr_size];
        int res_ind = 0;

        dll candidates = new dll();

        // Solve the first window
        candidates.addFirst(0);
        for (int data_ind = 1; data_ind < k; data_ind++) {
            while (!candidates.isEmpty() && nums[data_ind] > nums[candidates.peekLast()]) {
                candidates.removeLast();
            }
            candidates.addLast(data_ind);
        }
        res[res_ind] = nums[candidates.peekFirst()];

        int wb = 1; // window begin
        int we = k; // window end
        int li = 0; // leaving index

        while (we < noe) {
            // remove expired index
            if (candidates.peekFirst() == li) {
                candidates.removeFirst();
            }
            // maintain decreasing order
            while (!candidates.isEmpty() && nums[we] > nums[candidates.peekLast()]) {
                candidates.removeLast();
            }
            candidates.addLast(we);

            li = wb;
            wb++;
            we++;
            res_ind++;
            res[res_ind] = nums[candidates.peekFirst()];
        }

        return res;
    }

    class node {
        int ind_val;
        node next;
        node prev;
        node(int data) {
            ind_val = data;
            next = null;
            prev = null;
        }
    }

    class dll {
        node first;
        node last;
        dll() {
            first = null;
            last = null;
        }
        void addFirst(int data) {
            node nn = new node(data);
            if (first == null) {
                first = nn;
                last = nn;
                return;
            }
            nn.next = first;
            first.prev = nn;
            first = nn;
        }
        void addLast(int data) {
            node nn = new node(data);
            if (last == null) {
                first = nn;
                last = nn;
                return;
            }
            last.next = nn;
            nn.prev = last;
            last = nn;
        }
        boolean isEmpty() {
            return first == null || last == null;
        }
        void removeLast() {
            if (last == null) return;
            last = last.prev;
            if (last != null) last.next = null;
            else first = null;
        }
        void removeFirst() {
            if (first == null) return;
            first = first.next;
            if (first != null) first.prev = null;
            else last = null;
        }
        int peekFirst() {
            return first.ind_val;
        }
        int peekLast() {
            return last.ind_val;
        }
    }
}

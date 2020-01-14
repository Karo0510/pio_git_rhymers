package edu.kis.vh.nursery;

public class IntArrayStack {

        public int[] NUMBERS = new int[12];

        private int total = -1;

        public void countIn(int in) {
            if (!isFull()) {
                NUMBERS[setTotal(getTotal()+1)] = in;
            }

        }

        public boolean callCheck() {
            return getTotal() == -1;
        }


        public boolean isFull() {
            return getTotal() == 11;
        }


        protected int peekaboo() {
            if (callCheck()) {
                return -1;
            }

            return NUMBERS[getTotal()];
        }


        public int countOut() {
            if (callCheck()) {
                return -1;
            }
            return NUMBERS[setTotal(getTotal() - 1)];
        }

        public int getTotal() {
            return total;
        }

        public int setTotal(int total) {
            this.total = total;
            return total;
        }

}

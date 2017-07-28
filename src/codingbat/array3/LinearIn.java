package codingbat.array3;

public class LinearIn {
    public boolean linearIn(int[] outer, int[] inner) {
        boolean notLinearIn;
        for (int outerIndex = 0, innerIndex = 0; innerIndex < inner.length; innerIndex++) {
            notLinearIn = true;
            for (; outerIndex < outer.length && notLinearIn; outerIndex++) {
                if (inner[innerIndex] == outer[outerIndex]) {
                    notLinearIn = false;
                }
            }
            if (notLinearIn) {
                return false;
            }
        }
        return true;
    }
}

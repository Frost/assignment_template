/**
 * An utility class for commonly used math operations.
 * Comments can contain  \LaTeX code.
 * @author David Flemström
 * @version 1.0
 */
public class Math {
    // This class contains static methods only!
    private Math() {}

    /**
     * An implementation of $\sum_{i=1}ˆ{n}i$
     * @param n The upper limit of the sum
     * @returns The sum of $1, 2, ..., n$
     */
    public static int sumFromOneTo(final int n) {
        int result;
        for(int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    /**
     * The mathematical "bottom" value. Use this to
     * indicate that a value is undefined.
     * @returns Nothing; this method never returns.
     */
    public static <A> A undefined() {
        throw new RuntimeException("undefined");
    }
}

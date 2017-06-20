import java.util.concurrent.Callable;

class Util {
    static void timeSolution(Callable<Integer> solution) {
        final long startTime = System.currentTimeMillis();
        try {
            int solutionResult = solution.call();
            final long endTime = System.currentTimeMillis();

            System.out.println("Found solution in " + (endTime - startTime) + " ms");
            System.out.println(solutionResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class PermMissingElement {

  public int solution(int[] A) {
    long actualSum = 0;
    for (int i = 0; i < A.length - 1; i++) {
      actualSum += i;
    }
    long maxNumber = A.length + 1;
    long expectedSum = 0;
    for (int i = 0; i <= maxNumber; i++) {
      expectedSum += i;
    }
    return (int) (expectedSum - actualSum);
  }
}

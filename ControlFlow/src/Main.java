public class Main {
    public static void main(String[] args) {

        System.out.println("Coding Exercise 13 : Number In Word");
        NumberInWord.printNumberInWord(2);

        System.out.println("\nCoding Exercise 14 : NumberOfDaysInMonth : " +
                NumberOfDaysInMonth.getDaysInMonth(2, 2023));

        System.out.println("\nCoding Exercise 15 : SumOddRange" +
                "\nisOdd : " + SumOddRange.isOdd(1) +
                "\nSum : " + SumOddRange.sumOdd(1, 5));

        System.out.println("\nCoding Exercise 16 : NumberPalindrome : " +
                NumberPalindrome.isPalindrome(212));

        System.out.println("\nCoding Exercise 17 : FirstLastDigitSum : " +
                FirstLastDigitSum.sumFirstAndLastDigit(252));

        System.out.println("\nCoding Exercise 18 : EvenDigitSum : " +
                EvenDigitSum.getEvenDigitSum(12345));

        System.out.println("\nCoding Exercise 19 : SharedDigit : " +
                SharedDigit.hasSharedDigit(26,42));

        System.out.println("\nCoding Exercise 20 : LastDigitChecker : " +
                LastDigitChecker.hasSameLastDigit(41,22, 71));

        System.out.println("\nCoding Exercise 21 : FactorPrinter");
        FactorPrinter.printFactors(6);

        System.out.println("\nCoding Exercise 22 : GreatestCommonDivisor : " +
                GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));

        System.out.println("\nCoding Exercise 23 : PerfectNumber : " +
                PerfectNumber.isPerfectNumber(6));

        System.out.println("\nCoding Exercise 24 : NumberToWords : " +
                NumberToWords.getDigitCount(123));

        System.out.println("\nCoding Exercise 25 : FlourPacker : " +
                FlourPacker.canPack(1,0,4));

        System.out.println("\nCoding Exercise 26 : LargestPrime : " +
                LargestPrime.getLargestPrime(21));

        System.out.println("\nCoding Exercise 27 : DiagonalStar");
        DiagonalStar.printSquareStar(5);

        System.out.println("\nCoding Exercise 28 : InputCalculator");
        InputCalculator.inputThenPrintSumAndAverage();

        System.out.println("\nCoding Exercise 29 : PaintJob : " +
                PaintJob.getBucketCount(-3.4,2.1,1.5, 2));

    }
}
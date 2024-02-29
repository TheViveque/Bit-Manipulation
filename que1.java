import java.util.*;

// public class que1 {

//     public static void main(String[] args) {
//         // Binary AND
//         System.out.println(5 & 6);
//         // 00000101
//         // 00000110
//         // -----------
//         // 00000100 i.e 4
// // ------------------------------------------------


//         // Binary OR
//         System.out.println(5 | 6);
//         // 00000101
//         // 00000110
//         // -----------
//         // 00000111 i.e 7
// // -------------------------------------------------

//         // Binary XOR
//         System.out.println(5 ^ 6);
//         // 00000101
//         // 00000110
//         // -----------
//         // 00000011 i.e 3

//         // Binary 1's
//         System.out.println(~1);
// // ---------------------------------------------------
//         // Binary Left Shift <<
//         // all the bits shifts left by 2 bit here and empty 2 places will 
//         // be filled with 0
//         System.out.println(5 <<  2);
//         // 00000101
//         //   //////
//         //  //////
//         // 00010100
//         // -----------
//         // i.e 20
//         // a*b^2
// // ---------------------------------------------------
//         // Binary Left Shift <<
//         // all the bits shifts right by 2 bit here and empty 2 places will 
//         // be filled with 0
//         System.out.println(5 >> 2);
//         //  00000101
//         //   \\\\\\
//         //    \\\\\\
//         //     000001      
//         // -----------
//         // i.e 1
//         // a/b^2

//     }
// }

// ==========================Odd or even================================
// public class que1 {

//     public static void oddOrEven(int n){
//         int bitMask = 1;
//         if((n & bitMask) == 0){
//             // Even Number
//             System.out.println("Number is even");
//         }else{
//             System.out.println("Number is Odd");
//         }
//     }
//     public static void main(String[] args) {
//         oddOrEven(5);
//         oddOrEven(6);
//         oddOrEven(0);
//     }
// }
// -------------------------Find ith Bit------------------------------
// public class que1{
//     public static int getIthBit(int n , int i){
//         int bitMask = 1 << i;
//         if((n & bitMask) == 0) {
//             return 0;
//         }else{
//             return 1;
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println(getIthBit(10, 2));
//     }
// }
// -------------------------Set ith Bit------------------------------

// public class que1{
//     public static int setIthBit(int n , int i){
//         int bitMask = 1 << i;
//         return n | bitMask;

//     }
//     public static void main(String[] args) {
//         System.out.println(setIthBit(10, 2));
//     }
// }

// -------------------------Delete ith Bit------------------------------
// public class que1{
//     public static int deleteIthBit(int n , int i){
//         int bitMask = ~(1 << i);
//         return n & bitMask;

//     }
//     public static void main(String[] args) {
//         System.out.println(deleteIthBit(10, 1));
//     }
// }

// -------------------------Delete ith Bit------------------------------
// public class que1{
//     public static int deleteIthBit(int n , int i){
//         int bitMask = ~(1 << i);
//         return n & bitMask;

//     }
//     public static int updateIthBit(int n , int i, int newBit){
//         n = deleteIthBit(n, i);
//         int BitMask = newBit<<i;
//         return n | BitMask;
        
//     }
//     public static void main(String[] args) {
//         System.out.println(updateIthBit(20, 1, 1));
//     }
// }
// -------------------------Delete ith Bit------------------------------
// public class que1{
//     public static int deleteIBit(int n , int i){
//         int bitMask = ((~0) << i);
//         // shift bits by I except zero
//         return n & bitMask;

//     }
//     public static void main(String[] args) {
//         System.out.println(deleteIBit(15, 1));
//     }
// }

// ------------------------ClearBitsInRange------------------------------
// public class que1{
//     public static int ClearBitsInRange(int n , int i, int j){
//         int a = ((~0)<<(j+1));
//         int b = (1<<i)-1;
//         int bitMask = a | b;
//         return n & bitMask;


//     }
//     public static void main(String[] args) {
//         System.out.println(ClearBitsInRange(15, 2,4));
//     }
// }

// ------------------------ClearBitsInRange------------------------------
// public class que1{
//     public static boolean isPowerOfTwo(int n){
//         return (n&(n-1)) == 0; 
//     }
//     public static void main(String[] args) {
//         System.out.println(isPowerOfTwo(8));
//     }
// }

// ------------------------ClearBitsInRange------------------------------
// public class que1{
//     public static int countSetBits(int n){
//         int count = 0;
//         while (n > 0) {
//             if((n & 1) != 0){
//                 count++;
//             }
//             n = n>>1;
//         }
//         return count; 
//     }
//     public static void main(String[] args) {
//         System.out.println(countSetBits(15));
//     }
// }

// --------------------------Fast Exponential----------------------------
public class que1 {

public static int fastExpo(int a, int n){
    int ans = 1;

    while (n > 0) {
        if((n & 1) != 0){//Check LSB
            ans = ans*a;
        }
        a = a * a;
        n = n>>1;
    }
    return ans;
}
public static void main(String[] args) {
    System.out.println(fastExpo(7, 3));
}
}
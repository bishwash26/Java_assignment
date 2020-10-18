 class Q2 {
	public static void main(String[] args) {
		int val = -1;
        byte x = (byte)val;
        System.out.println(x);
        char y = (char)x;
        System.out.println(y);
        int z = (int)y;
		System.out.println(z);
	}
}
/* First we stored the value of -1 in int. Int preserves the value of -1. Again we store the value in byte. Byte stores the data from -128 to 127 so -1 is preserved
Char value stores the value from 0 to 2^16-1 values. However when we try to store the value of -1 the last possible value
ie 65535 is stored in java.
*/
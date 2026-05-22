public class DataTypeSizeRange {
    public static void main(String[] args) {

        System.out.println("Byte:");
        System.out.println("Size: " + Byte.SIZE / 8 + " bytes");
        System.out.println("Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        System.out.println("\nShort:");
        System.out.println("Size: " + Short.SIZE / 8 + " bytes");
        System.out.println("Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);

        System.out.println("\nInteger:");
        System.out.println("Size: " + Integer.SIZE / 8 + " bytes");
        System.out.println("Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        System.out.println("\nLong:");
        System.out.println("Size: " + Long.SIZE / 8 + " bytes");
        System.out.println("Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        System.out.println("\nFloat:");
        System.out.println("Size: " + Float.SIZE / 8 + " bytes");
        System.out.println("Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);

        System.out.println("\nDouble:");
        System.out.println("Size: " + Double.SIZE / 8 + " bytes");
        System.out.println("Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        System.out.println("\nCharacter:");
        System.out.println("Size: " + Character.SIZE / 8 + " bytes");

        System.out.println("\nBoolean:");
        System.out.println("Size: JVM dependent");
    }
}
public class TiposPrimitivos {
    public static void main(String[] args){
        byte b = 0b10; // 1 byte 
        short s = 100; // 2 bytes
        int i = 40; // 4 bytes
        long l = 100L; // 8 bytes

        float f = 10.0F; // 4 bytes
        double d = 20.0; // 8 bytes

        float g = (float)d;

        boolean bb = true;
        char c = 'a';
        //String ss = "hello world!"; não é tipo primitivo
    }
    
}

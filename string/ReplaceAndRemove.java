package string;

public class ReplaceAndRemove {

    public static void removeAndReplace(char[] input) {
        int size = input.length;
        int writerIdx = 0 ;
        int aCount = 0;
        for(int i =0 ; i<size;i++) {

            if( 'd' != input[i]) {
                input[writerIdx++] = input[i];
            }
            if('a' == input[i]) {
                aCount++;
            }
        }
        int currentIdx = writerIdx - 1;
        writerIdx = writerIdx + aCount - 1;
        char[] out = new char[writerIdx+1];

        for( int i = currentIdx; i >=0 ; i--) {

            if('a' == input[i]) {
                out[writerIdx--] = 'x';
                out[writerIdx--] = 'x';
            } else {
                out[writerIdx--] = input[i];
            }
        }

        for( int i = 0;i< out.length;i++) {
            System.out.print(" "+out[i]);
        }

    }

    public static void main(String[] args) {
        char[] input = {'a','c','d','b','b','c','a'};
        System.out.print(input);
        removeAndReplace(input);
    }
}

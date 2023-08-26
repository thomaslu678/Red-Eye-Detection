public class RedEyeDetection {

    public String getMiddlePixel(String[][] array, String[] colorOptions){

        int colorCount = 0;

        for (String[] pixelRow: array) {
            for (String pixel : pixelRow) {
                for (String color : colorOptions){
                    if (pixel.equals(color)) {
                        colorCount += 1;
                    }
                }

            }
        }

        int middlePixelNumber = (colorCount/2)+1;

        for (String[] pixelRow: array) {
            for (String pixel : pixelRow) {
                for (String color : colorOptions) {
                    if (pixel.equals(color)) {
                        middlePixelNumber -= 1;
                    }
                }

                if (middlePixelNumber == 0){
                    return pixel;
                }

            }
        }

        return null;

    }

    public boolean middlePixelsAreAligned(String[][] array, String[] innerCircleOptions, String[] outerCircleOptions){
        if (getMiddlePixel(array, innerCircleOptions) == (getMiddlePixel(array, outerCircleOptions))){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {

        /**
         * Declare an array, same as the assignment, with
         * "w" = white
         * "r" = red
         * "b" = black
         */
        RedEyeDetection red = new RedEyeDetection();

        String[][] array = new String[][]{
            {new String("w"), new String("w"), new String("w"), new String("w"), new String("w"), new String("w"), new String("w"), new String("w"), new String("w"), new String("w"), new String("w"),},
            {new String("w"), new String("w"), new String("w"), new String("w"), new String("r"), new String("r"), new String("r"), new String("w"), new String("w"), new String("w"), new String("w"),},
            {new String("w"), new String("w"), new String("w"), new String("r"), new String("r"), new String("r"), new String("r"), new String("r"), new String("w"), new String("w"), new String("w"),},
            {new String("w"), new String("w"), new String("r"), new String("r"), new String("b"), new String("b"), new String("b"), new String("r"), new String("r"), new String("w"), new String("w"),},
            {new String("w"), new String("r"), new String("r"), new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("r"), new String("r"), new String("w"),},
            {new String("w"), new String("r"), new String("r"), new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("r"), new String("r"), new String("w"),},
            {new String("w"), new String("r"), new String("r"), new String("b"), new String("b"), new String("b"), new String("b"), new String("b"), new String("r"), new String("r"), new String("w"),},
            {new String("w"), new String("w"), new String("r"), new String("r"), new String("b"), new String("b"), new String("b"), new String("r"), new String("r"), new String("w"), new String("w"),},
            {new String("w"), new String("w"), new String("w"), new String("r"), new String("r"), new String("r"), new String("r"), new String("r"), new String("w"), new String("w"), new String("w"),},
            {new String("w"), new String("w"), new String("w"), new String("w"), new String("r"), new String("r"), new String("r"), new String("w"), new String("w"), new String("w"), new String("w"),},
            {new String("w"), new String("w"), new String("w"), new String("w"), new String("w"), new String("w"), new String("w"), new String("w"), new String("w"), new String("w"), new String("w"),}
        };


        /**
         * If the center of the red+black pixels is the same pixel as the center of the black pixels,
         * then we should return True.
         * Else, return False.
         */

        String[] pupilColor = {"b"};
        String[] eyeColors = {"b", "r"};
        System.out.println(red.middlePixelsAreAligned(array, pupilColor, eyeColors));

    }

}
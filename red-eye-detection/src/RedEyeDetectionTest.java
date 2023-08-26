import org.junit.jupiter.api.Test;

public class RedEyeDetectionTest {

    @Test
    public void testGetMiddlePixel(){
        RedEyeDetection red = new RedEyeDetection();

        String[][] array = new String[][]{
                {new String("w"), new String("r"), new String("w")},
                {new String("r"), new String("b"), new String("r")},
                {new String("w"), new String("r"), new String("w")}
        };

        /**
         * w r w
         * r b r
         * w r w
         */

        String[] eyeColors = {"b", "r"};
        assert(red.getMiddlePixel(array, eyeColors).equals("b"));
    }

    @Test
    public void testCase1(){
        RedEyeDetection red = new RedEyeDetection();

        String[][] array = new String[][]{
                {new String("w"), new String("r"), new String("w")},
                {new String("r"), new String("b"), new String("r")},
                {new String("w"), new String("r"), new String("w")}
        };

        /**
         * w r w
         * r b r
         * w r w
         */

        String[] pupilColor = {"b"};
        String[] eyeColors = {"b", "r"};
        assert(red.middlePixelsAreAligned(array, pupilColor, eyeColors));

    }

    @Test
    public void testCase2(){
        RedEyeDetection red = new RedEyeDetection();

        String[][] array = new String[][]{
                {new String("w"), new String("r"), new String("r"), new String("r"), new String("w")},
                {new String("b"), new String("b"), new String("b"), new String("b"), new String("b")},
                {new String("b"), new String("b"), new String("b"), new String("b"), new String("b")},
                {new String("b"), new String("b"), new String("b"), new String("b"), new String("b")},
                {new String("w"), new String("r"), new String("r"), new String("r"), new String("w")},

        };

        /**
         * w r r r w
         * r b b b r
         * r b b b r
         * r b b b r
         * w r r r w
         */

        String[] pupilColor = {"b"};
        String[] eyeColors = {"b", "r"};
        assert(red.middlePixelsAreAligned(array, pupilColor, eyeColors));

    }

    @Test
    public void testCase3(){
        RedEyeDetection red = new RedEyeDetection();

        String[][] array = new String[][]{
                {new String("w"), new String("w"), new String("r"), new String("w"), new String("w")},
                {new String("b"), new String("r"), new String("b"), new String("r"), new String("w")},
                {new String("r"), new String("b"), new String("b"), new String("b"), new String("r")},
                {new String("w"), new String("r"), new String("b"), new String("r"), new String("w")},
                {new String("w"), new String("w"), new String("r"), new String("w"), new String("w")},

        };

        /**
         * w w r w w
         * w r b r w
         * r b b b r
         * w r b r w
         * w w r w w
         */

        String[] pupilColor = {"b"};
        String[] eyeColors = {"b", "r"};
        assert(red.middlePixelsAreAligned(array, pupilColor, eyeColors));

    }

    @Test
    public void testCase4(){
        RedEyeDetection red = new RedEyeDetection();

        String[][] array = new String[][]{
                {new String("w"), new String("w"), new String("w"), new String("r"), new String("w"), new String("w"), new String("w"), },
                {new String("w"), new String("w"), new String("r"), new String("r"), new String("r"), new String("w"), new String("w"), },
                {new String("w"), new String("r"), new String("b"), new String("b"), new String("b"), new String("r"), new String("w"), },
                {new String("w"), new String("r"), new String("b"), new String("b"), new String("b"), new String("r"), new String("w"), },
                {new String("w"), new String("r"), new String("b"), new String("b"), new String("b"), new String("r"), new String("w"), },
                {new String("w"), new String("w"), new String("r"), new String("r"), new String("r"), new String("w"), new String("w"), },
                {new String("w"), new String("w"), new String("w"), new String("r"), new String("w"), new String("w"), new String("w"), },
        };

        /**
         * w w w r w w w
         * w w r r r w w
         * w r b b b r w
         * r r b b b r r
         * w r b b b r r
         * w w r r r w w
         * w w w r w w w
         */

        String[] pupilColor = {"b"};
        String[] eyeColors = {"b", "r"};
        assert(red.middlePixelsAreAligned(array, pupilColor, eyeColors));

    }


}

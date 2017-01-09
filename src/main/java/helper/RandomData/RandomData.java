package helper.RandomData;

/**

 *
 * Creating data for test
 */
public class RandomData {


    //For ALL page
    public static String getEmail() {
        return FIRST_PART_EMAIL + Randomizer.getRandomAppendix() + LASTPART_EMAIL;
    }

    //For NewAccountPage
    private static final String FIRST_PART_EMAIL = "test";
    private static final String LASTPART_EMAIL = "@testers.com";

    //  ContactUsPage
    private static final String ORDER_REFERENCE = "789456";
    private static final String MESSAGE = "Testing!";
    private static final String DROPDAWN_LABEL = "Customer service";
    private static final String PATH_TO_FILE = "src\\main\\resources\\sample.txt";
    private static final String FAIL_MESSAGE = "The message cannot be blank.";

    public static String getOrderReference() {
        return ORDER_REFERENCE;
    }

    public static String getMessage() {
        return MESSAGE;
    }

    public static String getDropdawnLabel() {
        return DROPDAWN_LABEL;
    }

    public static String getPathToFile() {
        return PATH_TO_FILE;
    }

    public static String getFailMessage() {
        return FAIL_MESSAGE;
    }

}

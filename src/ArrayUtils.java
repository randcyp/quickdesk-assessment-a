public class ArrayUtils {
    /**
     * Makes a deep copy of a string array
     * @param array The array to be copied
     * @return A deep-copied string arrau
     */
    public static String[] copyStringArray(String[] array) {
        String[] newArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            String string = array[i];

            if (string != null) {
                char[] charArray = string.toCharArray();

                char[] newCharArray = new char[charArray.length];
                for (int j = 0; j < charArray.length; j++) {
                    newCharArray[j] = charArray[j];
                }

                newArray[i] = String.copyValueOf(newCharArray);
            } else {
                newArray[i] = null;
            }

        }

        return newArray;
    }
}

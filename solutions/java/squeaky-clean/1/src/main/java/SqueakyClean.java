class SqueakyClean {
    static String clean(String identifier) {
        char[] arr = identifier.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (!Character.isDigit(arr[i]) && !Character.isLetter(arr[i]) && !Character.isWhitespace(arr[i]) && arr[i] != '-') {
                arr[i] = '\u0000';
            }
            if (Character.isWhitespace(arr[i])) {
                arr[i] = '_';
                continue;
            }
            if (i < arr.length - 1 && arr[i] == '-') {
                arr[i] = '\u0000';
                arr[i + 1] = Character.toUpperCase(arr[i + 1]);
                continue;
            }
            if (arr[i] == '4') {
                arr[i] = 'a';
            }
            if (arr[i] == '3') {
                arr[i] = 'e';
            }
            if (arr[i] == '0') {
                arr[i] = 'o';
            }
            if (arr[i] == '1') {
                arr[i] = 'l';
            }
            if (arr[i] == '7') {
                arr[i] = 't';
            }
        }
        StringBuilder builder = new StringBuilder();
        for (char c : arr) {
            if (c != '\u0000') {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}

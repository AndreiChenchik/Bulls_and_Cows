class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        char firstLetter = 'A';
        char lastLetter = 'Z';

        char letter = firstLetter;
        StringBuilder result = new StringBuilder();

        while (letter != lastLetter + 1) {
            if (result.length() != 0) {
                result.append(" ");
            }
            result.append(letter);
            letter += 1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(createEnglishAlphabet());
    }
}
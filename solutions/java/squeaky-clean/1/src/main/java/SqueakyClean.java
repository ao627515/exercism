class SqueakyClean {

    static String clean(String identifier) {
        if (identifier == null || identifier.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (char c : identifier.toCharArray()) {
            if (c == ' ') {
                result.append('_');
            }
            else if (c == '-') {
                capitalizeNext = true;
            }
            else if (Character.isLetter(c) || c == '_') {
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(c);
                }
            }
            else {
                // remplacement "leet-speak" simplifié
                switch (c) {
                    case '4' -> result.append('a');
                    case '3' -> result.append('e');
                    case '0' -> result.append('o');
                    case '1' -> result.append('l');
                    case '7' -> result.append('t');
                    // autres caractères ignorés
                }
            }
        }
        return result.toString();
    }
}

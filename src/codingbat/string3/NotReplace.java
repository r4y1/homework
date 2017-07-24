package codingbat.string3;

public class NotReplace {
    public String notReplace(String str) {
        int currentIndexOfIs = str.indexOf("is");
        int currentIndex;
        while (currentIndexOfIs != -1) {
            currentIndex = 0;
            if (currentIndexOfIs > 0) {
                if (!Character.isLetter(str.charAt(currentIndexOfIs - 1)))
                    currentIndex++;
            } else {
                currentIndex++;
            }
            if (currentIndexOfIs < str.length() - 2) {
                if (!Character.isLetter(str.charAt(currentIndexOfIs + 2))) {
                    currentIndex++;
                }
            } else {
                currentIndex++;
            }
            if (currentIndex == 2) {
                str = str.substring(0, currentIndexOfIs) + "is not" + str.substring(currentIndexOfIs + 2);
            }
            currentIndexOfIs = str.indexOf("is", currentIndexOfIs + 2);
        }
        return str;
    }
}


package codingbat.string3;

public class CountYZ {
    int countYZ(String str) {
        str = str.toLowerCase();
        int count = 0;
        char ch = str.charAt(0);
        for(int i = 1; i < str.length(); i++) {
            if(ch == 'y' || ch == 'z') {
                ch = str.charAt(i);
                if(!Character.isLetter(ch))
                    count++;
            }
            else {
                ch = str.charAt(i);
            }
        }
        if(ch == 'y' || ch == 'z') {
            count++;
        }
        return count;
    }
}

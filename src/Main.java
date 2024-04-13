public class Main {
    public static void main(String[] args) {
        int digitCount = 10;
        int passwordLength = 8;
        char fullSet[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '*', '&', '$', '#'};

        // Number of combinations for first digit * fullSet ^ remaining digits
        double combinations = digitCount * (Math.pow(fullSet.length,(passwordLength - 1)));
        System.out.println("Total Number of Combinations: " + combinations);

        String password = generatePassword(passwordLength,fullSet);
        System.out.println("Randomly Generated Password: " + password);
    }

    public static String generatePassword(int passwordLength,char[] set){
        String password = "";
        //Make first character a digit 0-9
        password += (int)(Math.random() * 10);

        //Randomize last 7 characters
        for(int i = 1; i < passwordLength; i++) {
            int index = (int) (Math.random() * set.length);
            password += set[index];
        }

        return password;
    }
}


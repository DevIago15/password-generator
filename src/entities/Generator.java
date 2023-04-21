package entities;

public class Generator {
    private String password;

    public String generateEasyPassword(int length) {
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        password = "";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * lowerCase.length());
            password += lowerCase.charAt(index);
        }
        return password;
    }

    public String generateMediumPassword(int length) {
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        password = "";
        for (int i = 0; i < length; i++) {
            int option = (int) (Math.random() * 3) + 1;
            switch (option) {
                case 1:
                    int indexLowerCase = (int) (Math.random() * lowerCase.length());
                    password += lowerCase.charAt(indexLowerCase);
                    break;
                case 2:
                    int indexUpperCase = (int) (Math.random() * upperCase.length());
                    password += upperCase.charAt(indexUpperCase);
                    break;
                case 3:
                    int indexNumbers = (int) (Math.random() * numbers.length());
                    password += numbers.charAt(indexNumbers);
                    break;
            }
        }
        return password;
    }

    public String generateHardPassword(int length) {
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()_-+=|\\{}[]:;\"'<>,.?/";
        password = "";
        for (int i = 0; i < length; i++) {
            int option = (int) (Math.random() * 4) + 1;
            switch (option) {
                case 1:
                    int indexLowerCase = (int) (Math.random() * lowerCase.length());
                    password += lowerCase.charAt(indexLowerCase);
                    break;
                case 2:
                    int indexUpperCase = (int) (Math.random() * upperCase.length());
                    password += upperCase.charAt(indexUpperCase);
                    break;
                case 3:
                    int indexNumbers = (int) (Math.random() * numbers.length());
                    password += numbers.charAt(indexNumbers);
                    break;
                case 4:
                    int indexSymbols = (int) (Math.random() * symbols.length());
                    password += symbols.charAt(indexSymbols);
                    break;
            }
        }
        return password;
    }
}

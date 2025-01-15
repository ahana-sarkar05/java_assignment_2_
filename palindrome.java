class Person {
    private String name;

    // Getter and Setter methods
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Method to check if the name is a palindrome
    public boolean isPalindrome() {
        if (name == null || name.isEmpty()) {
            return false;
        }

        // Remove spaces and convert to lowercase
        String processedName = name.replaceAll("\\s+", "").toLowerCase();

        // Check if the processed string is a palindrome
        int length = processedName.length();
        for (int i = 0; i < length / 2; i++) {
            if (processedName.charAt(i) != processedName.charAt(length - 1 - i)) {
                return false; // Not a palindrome
            }
        }
        return true; // It is a palindrome
    }

    // Method to display whether the name is a palindrome
    public void displayPalindromeCheck() {
        System.out.println("Name: " + name);
        System.out.println("Is palindrome: " + (isPalindrome() ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        // Create a person object
        Person person = new Person();
        person.setName("Ahana");

        // Display whether the person's name is a palindrome
        person.displayPalindromeCheck();
    }
}

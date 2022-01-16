class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if (firstName != null && !firstName.isEmpty()) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {

        String result = "";

        if (!firstName.isEmpty() && !lastName.isEmpty()) {
            result = firstName + " " + lastName;
        } else if (!firstName.isEmpty()) {
            result = firstName;
        } else if (!lastName.isEmpty()) {
            result = lastName;
        } else {
            return "Unknown";
        }

        return result; // write your code here
    }
}
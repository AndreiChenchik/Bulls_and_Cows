class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        } else {
            this.firstName = "";
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        } else {
            this.lastName = "";
        }
    }

    public String getFullName() {
        if ("".equals(this.firstName) && "".equals(this.lastName)) {
            return "Unknown";
        } else {
            return "".equals(this.firstName) ?
                    this.lastName :
                    this.firstName + ("".equals(this.lastName) ? "" : " " + this.lastName);
        }
    }
}
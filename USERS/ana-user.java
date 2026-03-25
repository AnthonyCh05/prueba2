public Class AnaUser {
    private String name;
    private String email;

    public AnaUser(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        String nombre = name.toUpperCase();
        return nombre;
    }

    public String getEmail() {
        String email = this.email.toLowerCase();
        return email;
    }
}
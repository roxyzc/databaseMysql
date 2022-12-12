public record Login(String username, String password) {
    public Login {
        System.out.println("Anda berhasil Login");
    }

    // public Login(String username) {
    // this(username, "");
    // }

    // public Login() {
    // this("", "");
    // }
}

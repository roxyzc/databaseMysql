class BuatExceptionKe3 extends Error {
    // buat yang fatal + nggak direkomendasikan menggunakan try catch
    public BuatExceptionKe3(String message) {
        super(message);
    }
}

class BuatExceptionKe2 extends RuntimeException {

    public BuatExceptionKe2(String message) {
        super(message);
    }
}

public class BuatException extends Throwable {

    public BuatException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        // buat object baru --> record
        Login login = new Login("coba", null);

        // checked
        // try {
        // validasi.validasiLogin(login);
        // } catch (BuatException error) {
        // System.out.println("Error: " + error.getMessage());
        // }

        // runtime
        // validasiKe2.validasiLoginKe2(login);

        // Error
        // validasiKe3.validasiLoginKe3(login);

        // Throwable
        // try {

        // String[] coba = { "Coba", "Dulu" };
        // System.out.println(coba[2]);
        // } catch (Throwable e) {
        // e.printStackTrace();
        // }
    }
}

class validasi {
    public static void validasiLogin(Login login) throws BuatException {
        if (login.username() == null) {
            throw new BuatException("Username null");
        } else if (login.username().isBlank()) {
            throw new BuatException("Username wajib diisi");
        } else if (login.password() == null) {
            throw new BuatException("Password null");
        } else if (login.password().isBlank()) {
            throw new BuatException("Password wajib diisi");
        }
    }
}

class validasiKe2 {
    public static void validasiLoginKe2(Login login) {
        if (login.username() == null) {
            throw new BuatExceptionKe2("Username null");
        } else if (login.username().isBlank()) {
            throw new BuatExceptionKe2("Username wajib diisi");
        } else if (login.password() == null) {
            throw new BuatExceptionKe2("Password null");
        } else if (login.password().isBlank()) {
            throw new BuatExceptionKe2("Password wajib diisi");
        }
    }
}

class validasiKe3 {
    public static void validasiLoginKe3(Login login) {
        if (login.username() == null) {
            throw new BuatExceptionKe3("Username null");
        } else if (login.username().isBlank()) {
            throw new BuatExceptionKe3("Username wajib diisi");
        } else if (login.password() == null) {
            throw new BuatExceptionKe3("Password null");
        } else if (login.password().isBlank()) {
            throw new BuatExceptionKe3("Password wajib diisi");
        }
    }
}
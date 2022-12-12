// tingkat 1 => buat validasi
class CobaAja extends Throwable {
    public CobaAja(String message) {
        super(message);
    }
}

// tingkat 2 => buat validasi tapi lebih simple dan lebih bagus dari tingkat 1
class runTime extends RuntimeException {
    public runTime(String message) {
        super(message);
    }
}

// tingkat 3 => kesalahan sangat fatal
class errorH extends Error {
    public errorH(String message) {
        super(message);
    }
}

// validasi dari class errorH
class validasiError {
    public static void verify(String nama) {
        if (nama == null) {
            throw new errorH("namanya kosong");
        }
    }
}

// validasi dari class runtime
class validasiruntime {
    public static void verify(String nama) {
        if (nama == null) {
            throw new runTime("namanya kosong");
        }
    }
}

// validasi dari class CobaAja
class validasiCobaAja {
    public static void verify(String nama) throws CobaAja {
        if (nama == null) {
            throw new CobaAja("namanya kosong");
        }
    }
}

public class BelajarTKe2 {
    public static void main(String[] args) {
        // checked
        // try {
        // validasiCobaAja.verify(null);
        // System.out.println("VALID");
        // } catch (CobaAja bebas) {
        // System.out.println("Error: " + bebas.getMessage());
        // } finally {
        // System.out.println("pasti kebaca");
        // }

        // boleh pake try catch
        // runtime
        // validasiruntime.verify(null);

        // error
        // validasiError.verify(null);
    }
}

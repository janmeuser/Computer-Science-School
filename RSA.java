import java.math.BigInteger;
import java.util.Random;

public class RSA {

    private BigInteger n, d, e;
    private int bitlength = 1024;

    // Konstruktor
    public RSA() {
        generateKeys();
    }

    // Schritt 1
    private void generateKeys() {
        Random r = new Random();
        BigInteger p = BigInteger.probablePrime(bitlength, r);
        BigInteger q = BigInteger.probablePrime(bitlength, r);

        // Schritt 2
        n = p.multiply(q);

        // Schritt 3
        BigInteger B = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));

        // Schritt 4
        do {
            e = new BigInteger(bitlength / 2, r);
        } while (e.gcd(B).intValue() > 1);

        // Schritt 5
        d = e.modInverse(B);
    }

    // Verschlüsselung
    public BigInteger encrypt(BigInteger message) {
        return message.modPow(e, n);
    }

    // Entschlüsselung
    public BigInteger decrypt(BigInteger message) {
        return message.modPow(d, n);
    }
}

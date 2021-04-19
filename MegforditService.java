package hu.beadando3.beadando3Simple;

public class MegforditService {

    public Megfordit reverser (String string) {
        byte[] strAsByteArray = string.getBytes();

        byte[] result = new byte[strAsByteArray.length];
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        return new Megfordit(new String(result));

    }

}
package StaticData;

/**
 * Created by Guto on 11/11/2016.
 */
public class TextPt {
    final static String[] error = {
            "Insira um nome",
            "O chat não está funcionando :("
    };
    public static String getErrorByPosition(int i) {
        return error[i];
    }
}

import java.util.Stack;

public class VerificarParenteses {
    public static boolean verificarExpressao(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);

            if (c == '(') {
                pilha.push(c);
            }
            else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false;
                }
                pilha.pop();
            }
        }
        return pilha.isEmpty();
    }
}

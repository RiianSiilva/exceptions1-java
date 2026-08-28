package academy.devdojo.untitled.introducao;

public class aula05EstruturaCondicionais04 {
    static void main(String[] args) {
        // imprima o dia da semana, considerando 1 como domingo
        byte dia = 8;
        // char, int, byte, short, enum, String
        switch (dia) {
            default:
                System.out.println("opaaaaaaaaaaaa!");
                break;
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terca");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
        }
    }
}

import java.util.Arrays;

public class Ejercicio01 {

    public static void main(String[] args) {
        String mensaje = "";
        String res = ""; // Initialize 'res' outside the loop

        for (Ejercicio01Enum size : Ejercicio01Enum.values()) {
            res = switch (size) {
                case SMALL, MEDIUM -> "BAJO O NORMAL";
                case LARGE, XL -> "ALTO";
                default -> "NO DEFINIDO";
            };

            mensaje = """
                    Hola la talla es %s y es considerado %s
                    """.formatted(size, res);

            // Print mensaje inside the loop if needed
            System.out.println(mensaje);
        }

//      Usefull String methods
        String de = "DaaaD";
        System.out.println(de.charAt(0));
        String ele=String.join("/",de.split("a"));
        System.out.println(ele);
        System.out.println(ele.lastIndexOf("D"));
        // EQUALSIGNORECASE
        System.out.println(de.equals("DaaaD"));
        System.out.println(de.compareTo("DaaaD"));
//        replacefirst
        System.out.println(de.replace("D","X"));
        System.out.println(de.toLowerCase());
//        TRIM EN VERSIONES ANTIGUAS
        System.out.println("D D ".strip().length());
        System.out.println("DX M OANG EL ".replaceAll("\\s",""));
        System.out.println(de.concat("EFE"));
        System.out.println(de.contains("a"));
        Integer real=15;
        System.out.println("%s %s".formatted(String.valueOf(true),String.valueOf(real)));
        System.out.printf("%d%n", real);
        char [] letritas = {'D','i','G','I','m','o','N'};
        System.out.println(String.copyValueOf(letritas,3,2));
        String [] lee = de.split("");
        System.out.println(Arrays.toString(lee));
        System.out.println(Arrays.stream(lee).toList());
//            STRING BUILDER
        StringBuilder concatenacionEficiente = new StringBuilder();
        concatenacionEficiente.append("HOLA");
        concatenacionEficiente.append("MUNDO");
        System.out.println(concatenacionEficiente.getClass());
        System.out.println(concatenacionEficiente.toString());
    }
}

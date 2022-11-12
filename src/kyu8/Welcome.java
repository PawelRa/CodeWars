package kyu8;

public class Welcome {
    public static void main(String[] args) {
        System.out.println(greet("english"));
    }

    public static String greet(String language) {
        switch (language) {
            case "czech":
                return "Vitejte";
            case "finnish":
                return "Tervetuloa";
            case "flemish":
                return "Welgekomen";
            case "french":
                return "Bienvenue";
            case "german":
                return "Willkommen";
            case "irish":
                return "Failte";
            case "italian":
                return "Benvenuto";
            case "latvian":
                return "Gaidits";
            case "lithuanian":
                return "Laukiamas";
            case "polish":
                return "Witamy";
            case "spanish":
                return "Bienvenido";
            case "swedish":
                return "Valkommen";
            case "estonian":
                return "Tere tulemast";
            case "dutch":
                return "Welkom";
            case "danish":
                return "Velkomst";
            case "welsh":
                return "Croeso";
            default:
                return "Welcome";
        }
    }
}

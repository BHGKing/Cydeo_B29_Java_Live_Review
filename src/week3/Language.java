package week3;

public class Language {
    public static void main(String[] args) {

        String lang = "English";
        String result = " ";

        switch (lang){

            case "English":
                result = "English: Hello, thank you for your call";
                break;

            case "Spanish":
                result = "Spanish: Hola, garcias para llamar";
                break;

            case "Turkish":
                result = "Turkish: merhaba, aradiginiz icin tesekkurler";
                break;

            case "Russian":
                result = "Russian: privet, spasibo za vash zbonok";
                break;

            case "French":
                result = "French: Merci, pour votre appel";
                break;

            default:
                result = "Sorry "+ lang + " is not supported";
        }
        System.out.println(result);
    }
}

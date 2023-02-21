package Demo;

import java.util.ArrayList;
import java.util.List;

//Actividad 4
public class ArtekString {
    public static String UpperName(String name) {
        //solo se toma el metodo q ya tiene por defecto String
        return name.toUpperCase();
    }

    public static String LowerName(String name) {
        //solo se toma el metodo q ya tiene por defecto String
        return name.toLowerCase();
    }

    public static String[] SplitNames(String namesList, char regex) {
        //TODO split names of string list by regex
        //Example: Felipe,Javier => Felipe Javier
        //envio la lista separados por el char q me manden
        return namesList.split( String.valueOf( regex ) );
    }

    public static String ReverseName(String name) {
        //TODO reverse name
        //Example: Felipe => epileF
        String nameNew = "";
        //separo por caracter
        char str[] = name.toCharArray();
        //voy agregando por caracter pero al reves
        for (int i =name.length()-1;i>=0;i--){
            nameNew+=str[i];
        }
        return nameNew;
    }

    public static String DisorderName(String name) {
        //TODO disorder name use random
        //Example: Felipe => LPeeFi
        char str[] = name.toCharArray();
        List<Integer> numbers = new ArrayList<>();
        String newName="";
        int c = 0;
        while (c<name.length()){
            int x= (int) (Math.random()*name.length());
            //comparamos y si es diferente se agrega y se suma la bariable c
            if(!numbers.contains( x )){
                numbers.add( x );
                newName+=str[x];
                c++;
            }
        }
        return newName;
    }

    public static String ReplaceVowelsName(String name) {
        //TODO replace A E I O U a e i o u
        // for random consonants B,C....Z, b,c....z
        //Example: Felipe => FRLppz
        String newString = "";
        char[] consonants = {'b', 'c','d', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
                'n', 'ñ', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z',
                'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'Ñ',
                'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z',};
        char[] replace = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        for (char c : name.toCharArray()){
            boolean exist= false;
            //vemos si existe
            for(char c2 : replace){
                if(c==c2){
                    exist=true;
                }
            }
            if(exist){
                newString+=consonants[(int) (Math.random()*consonants.length)];
            }else {
                newString += c;
            }

        }
        return newString;
    }

    public static String UpperLower(String name) {
        //Todo make the first, third, fifth,... letter upper
        //ToDO make the second, forth, sixth, ... letter lower;
        //Example: Felipe => FeLiPe
        String newString ="";
        int count=0;
        for (char c : name.toCharArray()){
            if(count%2==0){
                newString+= Character.toUpperCase( c );
            }else {
                newString+= Character.toLowerCase( c );
            }
            count++;
        }
        return newString;
    }

    public static String LowerUpper(String name) {
        //Todo make the first, third, fifth,... letter lower
        //ToDO make the second, forth, sixth, ... letter upper;
        //Example: Felipe => fElIpE
        String newString ="";
        int count=0;
        for (char c : name.toCharArray()){
            if(count%2==1){
                newString+= Character.toUpperCase( c );
            }else {
                newString+= Character.toLowerCase( c );
            }
            count++;
        }
        return newString;

    }
}
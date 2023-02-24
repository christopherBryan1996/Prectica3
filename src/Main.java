import Demo.ArtekMath;
import Demo.ArtekString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String [] numberOptionA= {"0", "0.5", "1", "0", "-1", "-0.5", "0.707", "-0.707", "0.666", "-0.666", "0.866", "-0.866"};
        int [][] numberOptionb ={{2, 3}, {3, 3}, {4, 5}, {5, 2}};
        float [][] numberOptionC={{2.5f,3.2f}, {3f,3f}, {4.146f,5.6325f}, {5.7f,2.523f}};
        String [][] numberOptionD={{"2","3"}, {"3","3"}, {"4","5"}, {"5","2"}};

        ArtekMath artekMath = new ArtekMath();

        System.out.println("\nActividad 1\n");

        //Prueba con A
        System.out.println("Prueba con A");
        for (String a: numberOptionA){
            System.out.println(artekMath.GetSin( a ));
        }
        //Prueba con B
        System.out.println("Prueba con B");
        for (int[] b:numberOptionb){
            System.out.println(artekMath.GetSin( b[0],b[1] ));
        }

        //Prueba con C
        System.out.println("Prueba con C");
        for (float[] c:numberOptionC){
            System.out.println(artekMath.GetSin( c[0],c[1] ));
        }

        //Prueba con D
        System.out.println("Prueba con D");
        for (String[] d:numberOptionD){
            System.out.println(artekMath.GetSin( d[0],d[1] ));
        }


        System.out.println("\nActividad 2\n");

        //Prueba con A
        System.out.println("Prueba con A");
        for (String a: numberOptionA){
            System.out.println(artekMath.GetCos( a ));
        }
        //Prueba con B
        System.out.println("Prueba con B");
        for (int[] b:numberOptionb){
            System.out.println(artekMath.GetCos( b[0],b[1] ));
        }

        //Prueba con C
        System.out.println("Prueba con C");
        for (float[] c:numberOptionC){
            System.out.println(artekMath.GetCos( c[0],c[1] ));
        }

        //Prueba con D
        System.out.println("Prueba con D");
        for (String[] d:numberOptionD){
            System.out.println(artekMath.GetCos( d[0],d[1] ));
        }

        System.out.println("\nActividad 3\n");

        //Prueba con A
        System.out.println("Prueba con A");
        for (String a: numberOptionA){
            System.out.println(artekMath.GetTan( a ));
        }
        //Prueba con B
        System.out.println("Prueba con B");
        for (int[] b:numberOptionb){
            System.out.println(artekMath.GetTan( b[0],b[1] ));
        }

        //Prueba con C
        System.out.println("Prueba con C");
        for (float[] c:numberOptionC){
            System.out.println(artekMath.GetTan( c[0],c[1] ));
        }

        //Prueba con D
        System.out.println("Prueba con D");
        for (String[] d:numberOptionD){
            System.out.println(artekMath.GetTan( d[0],d[1] ));
        }


        System.out.println("\nActividad 4\n");
        String test = "Juan,Pedro,Maria,Jose,Abad,Obed,Bryan,Miguel";
        ArtekString artekString = new ArtekString();

        System.out.println( "Texto original: HOla" );
        System.out.println("Texto Upper: " + artekString.UpperName( "HOla" ));
        System.out.println("Texto Lower: " + artekString.LowerName( "HOla" ));

        System.out.println("Texto original: " + test);
        System.out.print("Texto Split: ");
        List<String> names= List.of( artekString.SplitNames( test, ',' ) );
        for(String name : names){
            System.out.print(name+" ");
        }

        System.out.println("\nTexto original: Que hay");
        System.out.println("Texto reverse: " + artekString.ReverseName( "Que hay" ));

        System.out.println("\nTexto original: Felipe");
        System.out.println("Texto reverse random: " + artekString.DisorderName( "Felipe" ));

        System.out.println("\nTexto original: Felipe");
        System.out.println("Texto replace vowels name: " + artekString.ReplaceVowelsName( "Felipe" ));

        System.out.println("\nTexto original: Felipe");
        System.out.println("Texto upper lower: " + artekString.UpperLower( "Felipe" ));

        System.out.println("\nTexto original: Felipe");
        System.out.println("Texto upper lower: " + artekString.LowerUpper( "Felipe" ));
    }
}
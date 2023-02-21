package Demo;

public class ArtekMath {
    //Actividad 1
    public float GetSin(String sin){
        float result = (float) Math.sin( Double.valueOf( sin ) );
        return result;
    }

    public float GetSin(Integer opposite,Integer hypotenuse){
        float result = opposite/hypotenuse;
        return result;
    }
    public float GetSin(Float opposite,Float hypotenuse){
        float result = opposite/hypotenuse;
        return result;
    }
    public float GetSin(String opposite,String hypotenuse){
        float result = Float.valueOf( opposite )/Float.valueOf( hypotenuse );
        return result;
    }
    //Actividad 2
    public float GetCos(String cos){
        float result = (float) Math.cos( Double.valueOf( cos ) );
        return result;
    }
    public float GetCos(Integer adjacent,Integer hypotenuse){
        float result = adjacent/hypotenuse;
        return result;
    }
    public float GetCos(Float adjacent,Float hypotenuse){
        float result = adjacent/hypotenuse;
        return result;
    }
    public float GetCos(String adjacent,String hypotenuse){
        float result = Float.valueOf( adjacent )/Float.valueOf( hypotenuse );
        return result;
    }
    //Actividad 3
    public float GetTan(String tan){
        float result = (float) Math.tan( Double.valueOf( tan ) );
        return result;
    }
    public float GetTan(Integer opposite,Integer adjacent){
        float result = opposite/adjacent;
        return result;
    }
    public float GetTan(Float opposite,Float adjacent){
        float result = opposite/adjacent;
        return result;
    }
    public float GetTan(String opposite,String adjacent){
        float result = Float.valueOf( opposite )/Float.valueOf( adjacent );
        return result;
    }
}

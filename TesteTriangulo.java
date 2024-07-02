public class TesteTriangulo {

    public static void main(String[] args) {
        Triangulo t = new Triangulo(2.5f, 3f);
        float area = (t.base * t.altura)/2;
        System.out.println("area:"+area);
        
    }
}
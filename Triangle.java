import java.util.*;
public class Triangle {
    private int sidea ;
    private int sideb ;
    private int sidec;
    public void Area(int sidea,int sideb, int sidec){
        this.sidea = sidea;
        this.sideb = sideb;
        this.sidec = sidec;
    }
    public int getArea(){
        double s = (sidea+sideb+sidec)/2;
        double area = (s)*(s-sidea)*(s-sideb)*(s-sidec);
         return math.sqrt(area);
    }
    public int getPerimeter(){
        return (sidea + sideb + sidec);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of sidea:");
    int sidea = sc.nextInt();
    System.out.println("Enter the value of sideb:");
    int sideb= sc.nextInt();
    System.out.println("Enter the valeu of sidec:");
    int sidec = sc.nextInt();
    Triangle areaa = new Triangle();
    areaa.Area(sidea,sideb,sidec);
    int AreaofRectangle = areaa.getArea();
    int perimeterofRectangle = areaa.getPerimeter();
    System.out.println("Required perimeter of the rectangle is :"+perimeterofRectangle);
    System.out.println("Required area of the rectangle is:"+AreaofRectangle);
   }
}

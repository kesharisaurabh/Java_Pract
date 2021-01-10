package Classes_Objects;

import java.util.Scanner;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc =new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        Point p1=new Point(x1,y1);
        Point p2=new Point(x2,y2);
        
        double result=findDistance(p1, p2);
    }
    
    public static double findDistance(Point p1, Point p2)
    {
        
        double dis;
        
        dis=Math.sqrt((p2.getX()-p1.getX())*(p2.getX()-p1.getX()) + (p2.getY()-p1.getY())*(p2.getY()-p1.getY()));             
            System.out.println("distancebetween"+"("+p1.getX()+","+p1.getY()+"),"+"("+p2.getX()+","+p2.getY()+")===>"+String.format("%.3f",dis));
        return dis;
    }
}